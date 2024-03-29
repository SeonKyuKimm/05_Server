<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>To do 수정하기</title>
	<link rel="stylesheet" href="resources/css/main.css">
<body>

	<main>
		<h1>To do 수정하기</h1>
		<h1>───────</h1>
		
		<form action="/update?todoNo=${todo.todoNo}" method="post">
			
			<p>제목</p>
			<input type="text" name="title" value="${todo.todoTitle}" required>
			<!-- post 에는 queryString을 사용하지 않는게 좋아서  -->
			<!-- <input name="todoNo" value="${todo.todoNo}" type="hidden"> -->
			
			
			<p>메모</p>
			<textarea name="memo" style="resize: none; font-size:18px;" cols="20" rows="5">${todo.todoMemo}</textarea>
			
			<br><br>
			<button class="update-btn">수정하기</button>
		</form>
	
	
	</main>
</body>
</html>