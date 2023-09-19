<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>coffee-result.jsp 페이지</h2>
	<h1>주문 내역입니다.</h1>
	<ul>
		<li># 주문하신 메뉴: ${menu}</li>
		<li># 지불하실 가격: ${p}</li>
	</ul>
	
	<a href="/basic/coffee/order">재 주문</a>
</body>
</html>