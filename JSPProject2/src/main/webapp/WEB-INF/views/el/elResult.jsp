<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<title>EL 결과</title>

</head>
<body>
	<h1>El 을 이용해서 출력하기</h1>

	<h3> 파라미터 </h3>
	<ul>
		<li>\${param.name속성값 } : request에 담긴 파라미터 얻어오기( 1개 )</li>
		<li> \${paramValues.name속성값[인덱스번호]} : name이 일치하는 파라미터 중, 지정된 인덱스 번째 value</li>
	</ul>


	<p>
		이름 : ${param.inputName}<br>
		나이 : ${param.inputAge }<br>
		
		opt : ${param.opt }<br>
		
		opt[0] : ${paramValues.opt[0]}<br>
		opt[1] : ${paramValues.opt[1]}<br>
		opt[2] : ${paramValues.opt[2]}<br>
		
	</p>
	
	<hr>
	
	<h3> 세팅된 속성 (attribute) 출력하기 </h3>
	
	<ul>
		<li>기본 : \${ key } (key는 세팅한 속성의 key값입니다~~)</li>
		<li>배열 또는 List : \${ key[인덱스] } </li>
		<li>DTO 또는 Map : \${key.필드명 (Map 은 key.키값) }</li>
	</ul>
	
	<p>
		address (JSP) : <%= request.getAttribute("address") %> <br>
		address (EL) : ${address}<br>
		
		score  : ${score }<br>
		
		strList : ${strList} <br>
		strList[0] : ${strList[0]}<br>
		strList[1] : ${strList[1]}<br>
		strList[2] : ${strList[2]}<br>
		
		book : ${book}
		
		book의 title만 얻어옴 : ${book.title}<br>
		book의 writer : ${book.writer}<br>
		book의 price : ${book.price}<br>
		
		
	</p>
	
	<hr>
	
	
	<h1>EL은 null, 비어있다를 같은 것으로 생각한다.</h1>
	
	
	 ${list1}   / 	${list2}
	
	<h4>empty 연산자 사용 </h4>	
	<%-- 비어있으면 true , 아니면 false를 반환하는 연산자 --%>
	${empty list1} 	/	${empty list2}
	
	<%--true		/		 true --%>
	
	
	
	
	
	
</body>
</html>