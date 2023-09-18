<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>req-ex01.jsp 파일입니다.</h4>

	<h2>Reqeust 컨트롤러를 이용한 요청 처리 작업중~</h2>

	<form action="/basic/request/basic01">
		<input type="submit" value="GET 요청!">
	</form>

	<form action="/basic/request/basic01" method="post">
		<input type="submit" value="POST 요청!">
	</form>
	
	

</body>
</html>