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
<a href="kTop.jsp">管理者topへ</a>
<body>
<h1>投票システムを登録</h1>
<form action="TouhyouInsert" method="post" style="width: 500px; height: 180px">
    投票ID:<input type="text" name = "touhyouid" style="margin-left:40px"><br><br>
	投票コンテンツの名前:<input type="text" name = "touhyouname" style="margin-left:40px"><br><br>
	投票データ:<input type="text" name = "touhyouData" style="margin-left:40px"><br><br>
	A:<input type="text" name = "A" style="margin-left:40px"><br><br>
	B:<input type="text" name = "B" style="margin-left:40px"><br><br>
	<input type="submit" value="登録">
	</form>



</body>
</html>