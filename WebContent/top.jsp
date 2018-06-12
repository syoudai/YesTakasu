<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TOP画面</title>
</head>
<body class="top">
	<a href="UpdateUserInputServlet.jsp">ユーザーの情報を更新</a>
	<a href="Disp">投票一覧</a>


	<form action="LogoutServlet" method="get">
	<input type ="submit" value="ログアウト">

	</form>
</body>

</html>