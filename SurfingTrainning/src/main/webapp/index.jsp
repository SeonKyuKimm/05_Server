<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	
	<link rel="stylesheet" href="/resources/css/main.css">
	
	<title>Surfing Trainning</title>
	
</head>
<body>
	<main>
		<c:choose>
		
			<c:when>
			
				<h1>Surfing Trainning</h1>
				<h1> Login </h1>
				<br>
				<h1>────────</h1>
				
				<form action="/login" method="post" class="login-form">
					<div>
						<p>ID</p>
						<input type="text" name ="inputId" autocomplete="off">
					</div>
					<div>
						<p>Password</p>
						<input type="password">
					</div>
				
					<button>CONNECT</button>
				
				
				</form>
			
			
			</c:when>
			<%-- 로그인을 했다면 페이지 : 현재 접속한 사람의 연습 리스트--%>
		
		
		</c:choose>
	
	
	
	
	
	</main>

</body>
</html>