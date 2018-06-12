<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% TouhyouBean tddate=(TouhyouBean) session.getAttribute("tddate");%>
    <% String i=(String)request.getAttribute("i");%>
    <%@page import= "model.TouhyouBean"%>
  <%@page import= "java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
投票番号:<%=tddate.getTouhyouid()%><br>
タイトル:<%=tddate.getTouhyouname()%><br>
内容:<%=tddate.getTouhyouData()%><br>
<form action="Touhyou?id=<%=i%>">
<input type ="radio" name="vote" value="A"><%=tddate.getTouhyouA()%><br>
<input type ="radio" name="vote" value="B"><%=tddate.getTouhyouB()%><br>
<input type="submit" value="投票">
</form>
</body>
</html>