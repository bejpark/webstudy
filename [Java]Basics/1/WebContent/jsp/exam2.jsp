<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- jsp 주석(보이는 위치가 각각 다르다) --%>
<!--html 주석 -->
<%
	for(int i=1;i<=5;i++){
	//자바주석
	/* 
	자바주석@@
	*/
%>
<h1>현재 for문 실행중 .. 횟수 : <%=i %></h1>
<!-- <h<%=i %>> i를 태그 내부에 넣는경우</h<%=i %>>  -->
<%
	}
%>
</body>
</html>