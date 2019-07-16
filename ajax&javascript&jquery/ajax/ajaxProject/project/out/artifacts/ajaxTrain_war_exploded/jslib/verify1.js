//定义用户名校验的方法
function verify() {
    //首先测试一下页面的按钮按下，可以调用这个方法

    //使用JavaScript的alert方法，显示一个提示窗口
    /*alert("被点击了");*/

    //①获取文本框中的内容
    //document.getElementById("username");dom方式
    //jquery的查找节点，返回的是jquery对象，可以继续在上面执行jquery方法
    var jqueryObj = $("#username");
    //获取节点的值
    var username = jqueryObj.val();

    //alert(username);
    //②将文本框中的数据发送给服务器端的servlet
    //使用jquery的XMLHttprequest对象的get请求的封装
    $.get("AJAXServer?name=" + username, null, callback);


}

//回调函数
function callback(data) {

    //③接受服务器端返回的数据
    //alert(data);
    //④将服务器端返回的数据显示在页面上
    $("#result").html(data);
}