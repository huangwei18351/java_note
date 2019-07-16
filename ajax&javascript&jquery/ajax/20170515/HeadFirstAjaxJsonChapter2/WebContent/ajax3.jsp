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
			var tableNode = document.getElementById("studentTable");
			var newTr;
			var newTd0;
			var newTd1;
			for(var i = 0; i < dataObj.students.length; i++){
				var student = dataObj.students[i];
				newTr = tableNode.insertRow();
				newTd0 = newTr.insertCell();
				newTd1 = newTr.insertCell();
				newTd0.innerHTML = student.name;
				newTd1.innerHTML = student.password;
				
			} 
		}
	}; 
					 
	xhr.open("get", "GetAjaxInfoServlet?action=jsonArray", true);
	xhr.send(); 
}
</script>
</head>
<body>
<div style="text-align: center">
	<div>
		<input type="button" value="ajax获取信息" onclick="loadInfo()"/><br /><br />
		<table id="studentTable" align="center" border="1px" cellspacing="0">
			<tr>
				<th>姓名</th><th>密码</th>
			</tr>
		</table>
	</div>
</div>
</body>
</html>