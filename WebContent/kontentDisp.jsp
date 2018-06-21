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

投票番号:<%=tddlist.getTouhyouid()%><br>
タイトル:<%=tddlist.getTouhyouname()%><br>
内容:<%=tddlist.getTouhyouData()%><br>
<a href="DeleteVote">削除</a>　　　<a href="TouhyouU.jsp">変更</a>

</body>
</html>