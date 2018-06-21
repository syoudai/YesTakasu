<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import= "model.TouhyouBean"%>
   <% TouhyouBean tddlist=(TouhyouBean)session.getAttribute("voteData");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>投票内容変更</h1>
投票ID:<%=tddlist.getTouhyouid()%><br>
<form action="VoteUpdate" method="post" style="width: 500px; height: 180px">
	投票コンテンツの名前:<input type="text" name = "name" style="margin-left:40px"><br><br>
	投票データ:<input type="text" name = "Data" style="margin-left:40px"><br><br>
	A:<input type="text" name = "A" style="margin-left:40px"><br><br>
	B:<input type="text" name = "B" style="margin-left:40px"><br><br>
	<input type="submit" value="変更">
	</form>
</body>
</html>