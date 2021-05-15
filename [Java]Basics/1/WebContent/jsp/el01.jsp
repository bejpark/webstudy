<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	pageContext.setAttribute("p1","page scope value");
	request.setAttribute("r1", "request scope value");
	session.setAttribute("s1","session scope value");
	application.setAttribute("a1","application scope value");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
jsp코드로 불러온 경우<br> 
pageContext.getAttribute("p1") : <%=pageContext.getAttribute("p1") %> <br> 
el로 불러온 경우 <br>
pageContext.getAttribute("p1") : ${pageScope.p1} <br>
request.getAttribute("r1") : ${requestScope.r1}<br>
session.getAttribute("s1") : ${sessionScope.s1}<br>
application.getAttribute("a1") : ${applicationScope.a1}<br>
겹치지 않은 경우 p1,r1,s1,a1으로 불러도 불러와진다<br>
pageContext.getAttribute("p1") : ${p1}<br>
request.getAttribute("r1") : ${r1}<br>
session.getAttribute("s1") : ${s1}<br>
application.getAttribute("a1") : ${a1}<br>
</body>
</html>