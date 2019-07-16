/*需要点击主菜单的按钮，对应的子菜单可以显示，再次点击就隐藏*/

/*需要编写代码，在页面装载时，给所有的主菜单添加onclick事件
* 保证主菜单点击时可以显示或隐藏子菜单
* */

/*注册页面装载是执行的方法*/
$(function () {
    $("#123 a").click(function(){
        /*菜单展开闭合*/
        //$(this).nextAll("li").toggle("slow");
        /*展开闭合一个，关闭其他*/
		var d1 = $(this).next("div")
		d1.show("slow");
		var d2 =  d1.siblings("div")
		d2.hide("slow");
    });
});