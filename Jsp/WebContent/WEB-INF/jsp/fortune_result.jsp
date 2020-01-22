<%@ page import = "jp.co.colla_tech.FortuneBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<% FortuneBean fortuneBean = (FortuneBean)request.getAttribute("fortunebean"); %>
<meta charset="UTF-8">
<title>FortuneResult</title>
</head>
<body>
<h1>↓<%= fortuneBean.getToday()  %>↓</h1>
<h1><%=fortuneBean.getFortune() %></h1>
</body>
</html>