<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import= "model.TouhyouBean"%>
   <% TouhyouBean tddlist=(TouhyouBean)session.getAttribute("tdddata");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="DeleteVote" method="post" style="width: 500px; height: 180px">
投票番号:<%=tddlist.getTouhyouid()%><br>
タイトル:<%=tddlist.getTouhyouname()%><br>
内容:<%=tddlist.getTouhyouData()%><br>
<input type="submit" value="削除">
	</form>
</body>
</html>