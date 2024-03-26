<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 검색한 학과 학생 목록</title>
</head>
<body>

<h1> 검색한 학과 학생 목록</h1>
	
	<table border="1">
	<tr>
		<th>번호</th>
		<th>학번</th>
		<th>이름</th>
		<th>학과</th>
		<th>주소</th>
	</tr>
	<c:forEach var="std" items="${stdList}" varStatus="vs">
		<tr>
			<td>${vs.count}</td>
			<td>${std.studentNo}</td>
			<td>${std.studentName}</td>
			<td>${std.departmentName}</td>
			<td>${std.address}</td>
		</tr>
	</c:forEach>
	
	
	</table>


</body>
</html>