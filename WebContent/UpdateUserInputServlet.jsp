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
<%=list.getUserid() %>さんのページ
<h2>会員情報</h2>
学籍番号:<%=list.getIdnumber() %><br>
名前:<%=list.getUserid() %><br>
メールアドレス:<%=list.getUmail() %><br>

<a href="update.jsp">登録内容変更</a>　　　　
</body>
</html>