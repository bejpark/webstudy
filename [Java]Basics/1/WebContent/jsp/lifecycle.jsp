<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hello</h1>
<h3>최초실행 : init -> service</h3>
<h3>이후 실행 : service</h3>
<h3>수정 사항 있을 시 : destroy -> init -> service</h3>
<%
	System.out.print("jspService()");
%>
<%!
	public void jspInit(){
		System.out.print("jspinit()_edited");
	}
%>

<%!
	public void jspDestroy(){
	System.out.print("jspDestroy()");
	}
%>
</body>
</html>