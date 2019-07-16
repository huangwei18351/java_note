//定义用户名校验的方法
function verify() {
    $.get("AJAXServer?name=" +$("#username").val(), null, function (data) {
        $("#result").html(data);
    });
}