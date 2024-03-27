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
			
				
				
				<h1>────────</h1>
				
				<form action="/login" method="post" class="login-form">
				<h1> ＬＯＧ Ι Ｎ </h1>
					<div>
						<p>ID</p>
						<input type="text" name ="inputId" autocomplete="off">
					</div>
					<div>
						<p>Password</p>
						<input type="password">
					</div>
					<br>
					<button>CONNECT</button>
				
				
				</form>
			
			
			</c:when>
			<%-- 로그인을 했다면 ? 로그인한 사람들의 페이지--%>
		
		
		</c:choose>
	
	
	
	
	
	</main>

</body>
</html>