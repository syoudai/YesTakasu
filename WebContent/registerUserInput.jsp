<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/login.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会員登録画面</title>
<style type="text/css">
.auto-style1 {
	margin-left: 0px;
}
</style>
</head>
<body>
<h1>新規会員登録</h1>

<form action="Registration" method="post">
	<table>
		<tr>
			<th>学籍番号</th>
			<td><input type="text" name="idnumber"></td>
		</tr>
		<tr>
			<th>名前
		</th>
			<td><input type="text" name="Userid"></td>
		</tr>
		<tr>
			<th>メールアドレス</th>
			<td><input type="text" name="Umail"></td>
		</tr>
		<tr>
			<th>パスワード</th>
			<td><input type="text" name="Pass"></td>
		</tr>

	</table>
	<input type="submit" value="登録">
	</form>
</body>
</html>