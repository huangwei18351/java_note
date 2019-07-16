<%--ajax自动补全实例--%>
<%--与传统应用的视图层不同，这个jsp返回的是xml的数据，因此contentType的值是text/xml--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%--返回xml数据的‘视图层暂时不做任何逻辑判断，现将所有单词全部返回，待前后台应用完整
协作的时候，在限制返回的内容’--%>
<words>
    <c:forEach var="word" items="${wordList }">
        <word>${word}</word>
    </c:forEach>
</words>
