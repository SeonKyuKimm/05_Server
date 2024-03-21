<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=request.getParameter("inputName") %>님의 가입</title>
</head>
<body>
	
	<%-- JSP용 주석
	
		<&@ %> : 지시자 태그. 전반적인 jsp 페이지의 전반적 속성을 설정할 때 쓰는 태그
		
		<% %> : 스크립틀릿 -> 자바코드 작성하는 태그
		
		<%= %> : 표현식 -> 자바, 서버에서 얻어온 값을 표현(출력)할 때 사용하는 태그
		
		
		
		
		JSP (Java Server Page) : Java코드가 들어가 있는 HTML코드
	 --%>
	 
	 <h3 style="color : hotpink;"><%=request.getParameter("inputName") %>님의 가입을 환영합니다.</h3>

    <ul>
        <li>id : <%= request.getParameter("inputId") %></li>
        <li>pw : <%= request.getParameter("inputPw") %></li>
    </ul>

	<%if( !request.getParameter("intro").equals("") ) { %>
    	<h4>자기소개</h4>
    	<p><%=request.getParameter("intro") %></p>
    <%} %>
</body>
</html>