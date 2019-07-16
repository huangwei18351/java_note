<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function loadInfo(){
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
			var dataObj = eval("("+xhr.responseText+")");
			document.getElementById("name").value = dataObj.name;
			document.getElementById("password").value = dataObj.password;
		}
	};
	
	xhr.open("get", "GetAjaxInfoServlet?action=jsonObject", true);
	xhr.send(); 
}
</script>
</head>
<body>
<div style="text-align: center">
	<div>
		<input type="button" value="ajax获取信息" onclick="loadInfo()"/><br /><br />
		姓名：<input type="text" id="name" name="name" value="${name }"/>
		密码：<input type="text" id="password" name="password" value="${password }"/>
	</div>
</div>
</body>
</html>