<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이미 내부에 request, out 등의 객체들이 선언되어있음 (Servlet 생성 시)
<br>
<%
	StringBuffer url = request.getRequestURL();
	out.print("url : "+url.toString());
	out.print("<br>");
%>
</body>
</html>