<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date,java.text.SimpleDateFormat"%>
<%
String[]luckArray = {"大吉", "中吉", "小吉","末吉","凶","大凶"};
int index = (int)(Math.random() * 6);
String luck = luckArray[index];

Date today = new Date();



%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FortuneResult</title>
</head>
<body>
<h1>↓<%=today %>↓</h1>
<h1><%=luck %></h1>
</body>
</html>