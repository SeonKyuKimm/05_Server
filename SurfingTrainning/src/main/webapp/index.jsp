<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	
	<link rel="stylesheet" href="/resources/css/train-main.css">
	
	<title>Surfing Trainning</title>
	
</head>
<body>
	<main>
		<c:choose>
		
			<c:when test="${empty sessionScope.loginMember}">
			
				
				<form action="/login" method="post" class="login-form">
				
				<h1> Login </h1>
				<br>
					<div>
						<p>ID</p>
						<input type="text" name ="inputId" autocomplete="off">
					</div>
					<div>
						<p>Password</p>
						<input type="password" name="inputPw">
					</div>
				
					<br>
					<button>CONNECT</button>
				
				
				</form>
			
			
			</c:when>
			

						 <%-- 로그인을 했다면 페이지 : 현재 접속한 사람의 연습 리스트--%>
			
			<%--<c:otherwise>
					<h1> ${sessionScope.loginMember.memberNickname} 의 연습일지</h1>
				
				<c:choose>
					<c:when test="${empty practiceList}">
						<h2>연습목록을 작성하세요</h2>
					</c:when>
					
					<c:otherwise>
						<table>
							<c:forEach >
								<tr>
									<td>${practice.practiceTitle}</td>
									<td></td>
								</tr>							
							</c:forEach>
						</table>
						
					</c:otherwise>
					
				</c:choose>
				
			</c:otherwise>
			--%>
		
		</c:choose>
	
	
	</main>

</body>
</html>