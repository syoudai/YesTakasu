<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css" media="all">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
<%
String errMsg = (String)request.getAttribute("errMsg");
%>

<%if(errMsg !=null && errMsg.length()>0){%>
	<p><%=errMsg%></p>
	<% } %>
<h1>ログイン</h1>
	<form action="Login" method="post" style="width: 500px; height: 180px">
		学籍番号:<input type="text" name = "idnumber" style="margin-left:40px"><br><br>
		パスワード:<input type="password" name = "Pass"><br><br>
		<input type="submit" value="ログイン">
	</form>
	<form action="registerUserInput.jsp" method="post" style="width: 86px;">
		<input type="submit" value="新規登録">
		</form>

		<form action="klogin.jsp"method=get>

	</form>
</body>

</html>