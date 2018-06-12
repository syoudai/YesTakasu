<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import= "model.DataBean"%>
  <%@page import= "java.util.ArrayList"%>
   <% DataBean list=(DataBean) session.getAttribute("list");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<a href="top.jsp">topへ</a>
<body>
<h1>会員メニュー</h1>
<%=list.getUserid() %>
<h2>会員情報</h2>
<form action="UpdateUserInputServlet" method="get" style="width: 500px; height: 180px">
    学籍番号:<input type="text" name = "idnumber" style="margin-left:40px"><br><br>
	名前:<input type="text" name = "Userid" style="margin-left:40px"><br><br>
	password:<%=list.getPass() %><input type="password" name = "Pass"><br>
	メールアドレス:<%=list.getUmail() %><input type="text" name = "Umail" style="margin-left:40px"><br>
		<input type="submit" value="変更">
	</form>
</body>
</html>
