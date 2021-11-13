<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	pageContext.setAttribute("p1", "page scope value");
	request.setAttribute("r1", "request scope value");
	session.setAttribute("s1", "session scope value");
	application.setAttribute("a1", "application scope value");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

pageContext.getAttribute("p1") : <%=pageContext.getAttribute("p1") %> <br>
pageContext.getAttribute("p1") : ${pageScope.p1} <br>

request.getAttribute("r1") : <%=request.getAttribute("r1") %> <br>
request.getAttribute("r1") : ${request.r1} <br>

session.getAttribute("s1") : <%=session.getAttribute("s1") %> <br>
session.getAttribute("s1") : ${session.s1} <br>

application.getAttribute("a1") : <%=application.getAttribute("a1") %> <br>
application.getAttribute("a1") : ${application.a1} <br>

pageContext.getAttribute("p1") : ${p1} <br>

</body>
</html>