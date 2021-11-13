<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hello!
<!-- jspService() 메소드에 작성  -->
<%
	System.out.println("jspService()");
%>
<!-- jspInit() 메소드에 작성  -->
<%!
	public void jspInit() {
		System.out.println("jspInit()");
	}
%>
<!-- jspDestory() 메소드에 작성  -->
<%!
	public void jspDestroy() {
		System.out.println("jspDestroy()");
	}
%>
</body>
</html>