<%--
  Created by IntelliJ IDEA.
  User: sshss
  Date: 2017/6/19
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/xml;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <words>
      <c:forEach var="word" items="wordList">
        <word>${word}</word>
      </c:forEach>
    </words>
  </body>
</html>
