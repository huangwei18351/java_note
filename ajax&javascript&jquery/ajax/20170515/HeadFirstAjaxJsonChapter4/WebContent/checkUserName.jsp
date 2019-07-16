<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function checkUserName(){
	var uername = document.getElementById("username").value;
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
			if(dataObj.exist){
				document.getElementById("usernameSpan").innerHTML = "用户名已存在";
			}
			
		}
	};
	
	/* xhr.open("get", "GetAjaxNameServlet?name=hhh&password=123", true);
	xhr.send(); */
	xhr.open("post", "GetAjaxInfoServlet?action=checkUserName&username="+username, true);
	xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	xhr.send("name=jack&password=123");
}
</script>
</head>
<body>
<div style="text-align: center">
	<table cellspacing="0px" align="center">
		<tr>
			<th>用户注册</th>
		</tr>
		<tr>
			<td>用户名：</td>
			<td><input type="text" id="username" name="username" onblur="checkUserName()"/>
			<span id="usernameSpan" style="color: red"></span></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" id="password" name="password" /></td>
		</tr>
		<tr>
			<td>确认密码：</td>
			<td><input type="password" id="repsw" name="repsw" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="注册" /></td>
			<td><input type="reset" value="重置" /></td>
		</tr>
	</table>
</div>
</body>
</html>