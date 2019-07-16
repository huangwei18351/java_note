//在页面装载时，让所有的td都有一个onclick事件
$(document).ready(function(){
    //找到所有td的节点
    $("td").click(tdClick);
});

function tdClick(){
    var tdNode = $(this);
    //①取出当前td中的文本内容保存起来
    var text = tdNode.html();
    //②清空ttd里面的内容
    tdNode.html("");//或者tdNode.empyt();
    //③建立一个文本框，也就是input
    var input = $("<input type='text'/>")
    //④设置文本框的值是保存起来的文本内容
    input.val(text);
    //4.5让文本框可以响应键盘按下并弹起的事件，主要用处理回车确认
    input.keyup(inputToTdOnEnter);
    input.blur(inputToTdOnBulr);
    //⑤将文本框加入到td中
    tdNode.append(input);
    //5.5让文本框的文字被高亮选中，需要将jquery对象转换成js对象
    /*var inputDom = input.get(0);
    inputDom.select();*/
    input.select();//jquery也可以使用
    //⑥需要清除td上的点击事件
    tdNode.unbind("click");
}
//点回车是转换input和td
function inputToTdOnEnter(event){
        //0.获取当前用户按下的键值
        //解决不同浏览器获取事件对象的差异
        var myEvent = event || window.event;
        var keyCode = myEvent.keyCode;
        //1.判断是否是回车按下
        if(keyCode == 13){//回车对应的键码表是13
            //2.获取当前文本框的内容
            var inputNode = $(this);
            //3.清空td里面的内容
            var tdNode = inputNode.parent();
            //4.将保存的文本框的内容填充到td中
            tdNode.html(inputNode.val());
            //5.让td重新拥有点击事件
            tdNode.click(tdClick);
        }

}

//鼠标焦点变话转换input和td
function inputToTdOnBulr(event){
    //0.获取当前用户按下的键值
    //解决不同浏览器获取事件对象的差异
    var myEvent = event || window.event;
    var keyCode = myEvent.keyCode;
    //2.获取当前文本框的内容
    var inputNode = $(this);
    //3.清空td里面的内容
    var tdNode = inputNode.parent();
    //4.将保存的文本框的内容填充到td中
    tdNode.html(inputNode.val());
    //5.让td重新拥有点击事件
    tdNode.click(tdClick);
}