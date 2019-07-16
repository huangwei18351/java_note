//显示浮动窗口的方法
function showWin() {
    /*alert("显示弹出窗口");*/
    //①找到对应的窗口让他显示出来
    var winNode = $("#win");
    //②让div对应的窗口显示出来
    //方法①修改节点的css的display的值，让窗口显示出来
    // winNode.css("display","inline");
    //方法②show()方法
    //winNode.show("slow");
    //方法③fadeIn()方法
    winNode.fadeIn("slow");
}
/*关闭窗口*/
function hideWin() {
    $("#win").fadeOut("slow");
}
