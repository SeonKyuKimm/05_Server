<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>피자 주문 결과</title>
</head>
<body>
	<h1>피자 종류 : <%= request.getAttribute("pizzaName") %>
	(<%=request.getParameter("size") %>)
	</h>
		
	<h3>수량 : <%= request.getParameter("amount") %> 판</h3>
	
	<h3>총 가격 : <%= request.getAttribute("price") %> 원</h3>
</body>
</html>