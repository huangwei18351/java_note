<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function loadName(){
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
			document.getElementById("name").value = xhr.responseText;
		}
	};
	
	/* xhr.open("get", "GetAjaxNameServlet?name=hhh&password=123", true);
	xhr.send(); */
	xhr.open("post", "GetAjaxNameServlet", true);
	xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	xhr.send("name=jack&password=123");
}
</script>
</head>
<body>
<div style="text-align: center">
	<div>
		<input type="button" value="ajax获取数据" onclick="loadName()"/>&nbsp;&nbsp;
		<input type="text" id="name" name="name" value="${name }"/>
	</div>
</div>
</body>
</html>