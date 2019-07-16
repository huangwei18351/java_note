/*期望进入页面后就可以开始从服务器端获取数据，然后在页面显示价格*/
var obj;
var sid;
$(document).ready(function(){
    getInfo();
    var stockNode = $("#stock");
    stockNode.css("border","1px solid red");
    stockNode.css("width","150px");
    stockNode.css("background","yellow");
    stockNode.hide("slow");
    //页面载入时隐藏弹出框
    var as = $("a");
    //定义鼠标进入的股票名称的操作
    as.mouseover(function(e){
        stockNode.show("slow");
        stockNode.css("position","absolute").css("left",e.pageX).css("top",e.pageY);
        sid = $(this).parent().attr("id");
       update();
    });
    //定义鼠标移除的股票名称的操作
    as.mouseout(function(){
        stockNode.hide("slow");
    });
    //③每隔一秒钟和服务器交互一次，用户不用刷新页面就可以不断地看到最新的股票信息
    setInterval(getInfo,1000);

});
//更新当前
function update(){
    var stockobj = obj[sid];
    $("#yes").children("span").html(stockobj.yes);
    $("#tod").children("span").html(stockobj.tod);
    $("#now").children("span").html(stockobj.now);
}

function getInfo(){
    //①向服务器发起请求，获取数据

    $.get("GetStocksInfo", null, function (data) {
        //②接受并解析数据
        obj = eval(data);
        //2.1获取两只股票的当前指数信息
        szzs = obj["30001"];
        pfyh = obj["00001"];
        /*
         * 遍历一个js对象
         * for(var stockId in obj){
         *   var stock = obj[stockId];
         * }
         * */
        //2.2找到页面中对应的节点，然后填充最新的股票价格
        var spanNode1 = $("#30001").children("span");
        var spanNode2 = $("#00001").children("span");
        spanNode1.html(szzs.now);
        if(szzs.now > szzs.yes){
            //当前价格大于昨天收盘，则显示红色
            spanNode1.css("color","red");
        }else{
            spanNode1.css("color","green");
        }
        spanNode2.html(pfyh.now);
        if(pfyh.now > pfyh.yes){
            //当前价格大于昨天收盘，则显示红色
            spanNode2.css("color","red");
        }else{
            spanNode2.css("color","green");
        }
        update();
    });
}