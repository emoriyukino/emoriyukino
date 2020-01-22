<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*"
 %>
 <%@ page import = "java.text.*"
 %>
<!DOCTYPE html>
<html>
<head>

<%! Date now = new Date();
%>
<%! SimpleDateFormat msg = new SimpleDateFormat("yyyy年/MM月/dd日");
%>
<%!int count = 0;%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>訪問回数:<% out.print(count++);%></h1>
	<p>今日の日付:<% out.print(msg.format(now)); %>
</body>
</html>