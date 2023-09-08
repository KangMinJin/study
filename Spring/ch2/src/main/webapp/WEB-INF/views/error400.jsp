<%@ page contentType="text/html;charset=utf-8" isErrorPage="false"%>
<!-- isErrorPage="true"는 이 페이지는 에러가 났을 때 보여주는 페이지라고 선언하는 것 -->
<!-- jsp는 isErrorPage="true"를 사용하면 상태코드를 500으로 바꾼다 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>error400.jsp</title>
</head>
<body>
<h1>예외가 발생했습니다.</h1>
<!-- 예외를 view로 전달 안 하고 기본 객체 exception 사용 가능해짐 -->
발생한 예외 : ${pageContext.exception}<br>
예외 메시지 : ${pageContext.exception.message}<br>
<!-- 발생한 예외 : ${ex}<br>
예외 메시지 : ${ex.message}<br> -->
<ol>

<c:forEach items="${pageContext.exception.stackTrace}" var="i">
	<li>${i.toString()}</li>
</c:forEach>
</ol>
</body>
</html>

