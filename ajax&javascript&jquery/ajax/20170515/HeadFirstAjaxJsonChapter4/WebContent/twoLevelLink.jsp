<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function loadInfo(){
	var provinceId = document.getElementById("province").value;
	city.options.length = 0;
	var xhr;
	if(window.XMLHttpRequest){
		xhr = new XMLHttpRequest();
	}else{
		xhr = new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	//alert("readyState:"+xhr.readyState + ";status:" + xhr.status);
	xhr.onreadystatechange = function(){
		//alert("readyState:"+xhr.readyState + ";status:" + xhr.status+"----来自function");
		if(xhr.readyState == 4 && xhr.status == 200){
			//alert(xhr.responseText);
			var dataObj = eval("("+xhr.responseText+")");
			for(var i = 0 ; i < dataObj.menu.length; i++){
				//new option(text,value)
				var obj = dataObj.menu[i];
				var option = new Option(obj.city, obj.id);
				city.options.add(option);
			}
			
		}
	};
	
	/* xhr.open("get", "GetAjaxNameServlet?name=hhh&password=123", true);
	xhr.send(); */
	xhr.open("post", "GetAjaxInfoServlet?action=twoLevelLink&provinceId="+provinceId, true);
	xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	xhr.send("name=jack&password=123");
}
</script>
</head>
<body>
<div style="text-align: center">
	省：
	<select id="province" onchange="loadInfo()">
		<option value="1">江苏省</option>
		<option value="2">山东省</option>
		<option value="3">浙江省</option>
	</select>
	&nbsp;&nbsp;
	市：
	<select id="city">
	</select>
</div>
</body>
</html>