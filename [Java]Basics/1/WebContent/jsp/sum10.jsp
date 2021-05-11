<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>html 안에서 java코드 입력할 수 있음</h1>
<h2>Servlet으로 바뀌어 실행된다고 함 </h2>
<%
	int total = 0;
	for(int i =1;i<=10;i++){
		total=total+i;
	}
%>
1부터 10까지의 합 : <%=total %> 
</body>
</html>