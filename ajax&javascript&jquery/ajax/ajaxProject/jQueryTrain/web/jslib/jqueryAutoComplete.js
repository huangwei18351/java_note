/*自动补全*/
/*表示当前高亮的节点*/
var highLightIndex = -1;
var timeoutId;
$(function(){
    var wordInput = $("#word");
    //offset() 方法返回或设置匹配元素相对于文档的偏移（位置）
    var wordInputOffset = wordInput.offset();
    //自动补全的框最开始应该藏起来,解决跟着文本框的位置关系
    $("#auto").hide().css("border","1px black solid").css("position","absolute")
        .css("top",wordInputOffset.top + wordInput.height() + 5 + "px")
        .css("left",wordInputOffset.left + "px").css("width",wordInput.width() + 4);

    //给文本框添加键盘按下并弹出的事件
    wordInput.keyup(function(event){
        //处理文本框的键盘事件
        var myEvent = event || window.event;
        var keyCode = myEvent.keyCode;
        //如果输入的是字母，应该将文本框中的最新信息发送给服务器
        //或者是delete和backspace
        if(keyCode >=65 && keyCode <= 90 || keyCode == 8 || keyCode == 46) {
            //1.首先获取文本框中的内容
            var wordText = wordInput.val();
            if(wordText != "") {
                //对上一次未完成的延时进行取消
                clearTimeout(timeoutId);
                //考虑到用户打字比较慢，设定延迟
                timeoutId = setTimeout(function () {
                    //2.将文本框中的内容发送给服务器端
                    $.post("AutoComplete", {word: wordText}, function (data) {
                        //将dom对象data转换成jquery对象
                        var jqueryObj = $(data);
                        //找到所有的word节点
                        var wordNodes = jqueryObj.find("word");
                        //需要清空原来的内容
                        $("#auto").html("");
                        if (wordNodes.length > 0) {
                            //遍历多有word节点中，取出单词内容，然后将单词内容添加到弹出框
                            wordNodes.each(function (index) {
                                //获取单词内容
                                var wordNode = $(this);

                                //新建div节点，将单词内容加入到新建的节点中
                                var wordText = wordNode.html();
                                var divNode = $("<div>").attr("id",index).html(wordText);
                                //为div节点的鼠标进入添加高亮事件
                                //进入事件
                                divNode.mouseover(function(){
                                    //原来就有高亮的，就取消高亮
                                    if(highLightIndex != -1){
                                        $("#auto").children("div").eq(highLightIndex)
                                            .css("background-color", "white");
                                    }
                                    highLightIndex = $(this).attr("id");
                                    $(this).css("background-color", "red");
                                }).mouseout(function(){
                                    //原来就有高亮的，就取消高亮
                                    if(highLightIndex != -1){
                                        $("#auto").children("div").eq(highLightIndex)
                                            .css("background-color", "white");
                                    }
                                    //移除事件，高亮取消
                                    $(this).css("background-color", "white");
                                    highLightIndex = -1;
                                }).click(function(){
                                    //高亮则填充文本框
                                    var highLightText = $("#auto").children("div").eq(highLightIndex).html();
                                    $("#auto").hide("formal");
                                    highLightIndex = -1;
                                    wordInput.val(highLightText);
                                });
                                //将新建的节点加入到弹出框的div中
                                $("#auto").append(divNode);
                            });
                            $("#auto").show("formal");
                        } else {
                            $("#auto").hide("formal");
                        }
                    }, "xml");
                },500);

            }else{
                $("#auto").hide("formal");
                //弹出框隐藏的同时，高亮节点重置
                highLightIndex = -1;
            }
        }else if(keyCode == 38 || keyCode == 40){
            //针对上下键，进行高亮的处理
            /*向上*/
            //先取到自动补全的div的所有子节点
            var autoNodeChildren = $("#auto").children("div");
            if(keyCode == 38){
                if(highLightIndex != -1){
                    //取到索引值为highLightIndex的div节点,设定背景色为白色
                    autoNodeChildren.eq(highLightIndex).css("background-color", "white");
                    highLightIndex--;
                }else{
                    //处理第一次highLightIndex是-1的问题
                    highLightIndex = autoNodeChildren.length - 1;
                }

                if(highLightIndex == -1){
                    //如果修改索引值以后变成-1，则将索引值指向最后一个元素节点
                    highLightIndex = autoNodeChildren.length - 1;
                }
                //让现在索引值的节点变成红色
                autoNodeChildren.eq(highLightIndex).css("background-color", "red");
            }
            /*向下*/
            if(keyCode == 40){
                if(highLightIndex != -1){
                    //取到索引值为highLightIndex的div节点,设定背景色为白色
                    autoNodeChildren.eq(highLightIndex).css("background-color", "white");
                }
                highLightIndex++;
                if(highLightIndex == autoNodeChildren.length){
                    //如果修改索引值以后变成z最后的值，则将索引值指向第一个元素节点
                    highLightIndex = 0;
                }
                //让现在索引值的节点变成红色
                autoNodeChildren.eq(highLightIndex).css("background-color", "red");
            }

        }else if(keyCode == 13){
            //针对回车进行判断


            if(highLightIndex != -1){
                //高亮则填充文本框 var highLightText = $("#auto").children("div").eq(highLightIndex).html();
                var highLightText = $(this).html();
                $("#auto").hide("formal");
                highLightIndex = -1;
                wordInput.val(highLightText);
            }else {
                //否则就是提交
                submitInput();
                $("#auto").hide("formal");
                //让文本框失去焦点
                wordInput.get(0).blur();
            }
        }
    });
    
    //给按钮添加事件，表示文本框中的数据被提交
    $("input[type=button]").click(function() {
        submitInput();
    });
});

//提交事件
function submitInput() {
    alert("文本框中的["+ $("#word").val() + "]被提交了");
}