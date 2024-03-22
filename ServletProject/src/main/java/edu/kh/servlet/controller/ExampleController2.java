package edu.kh.servlet.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Servlet 관련 코드를 작성하기 위해서는 HttpServlet 클래스를 반드시 상속받아야함 ㅎ

/* @WebServlet
 * 어노테이션 : 컴파일러가 읽는 주석
 * 
 * @WebServlet : 해당 클래스를 Servlet 으로 등록을 하고,
 * 				 맵핑할 주소를 연결하라고 지시하는 어노테이션
 * 
 * -> 서버 실행 시, 자동으로 web.xml에
 * <servlet><servlet-mapping> 을 작성하는 효과
 * 
 * 
 * */

@WebServlet("/signUp")
public class ExampleController2 extends HttpServlet{

	// POST요청 받았을 때 처리하는 메서드 오버라이딩 해옴
	@Override 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 원래 tomcat9 버젼에는
		// 전달받은 값을 얻어와서 확인 -> 한글이 깨지는 문제가 발생했었다!
		// 해결방법 : 전달받은 데이터의 문자인코딩을 서버에 맞게 변경해줬어야했음
		//req.setCharacterEncoding("UTF-8");
		// -> tomcat10 버젼 이상부터 자동으로 인코딩 처리를 해주기 때문에 추가적인 처리 필요x
		
		String inputId = req.getParameter("inputId");
		String inputPw = req.getParameter("inputPw");
		String inputName = req.getParameter("inputName");
		String intro = req.getParameter("intro");
		
		System.out.println("아이디 : " +inputId);
		System.out.println("비밀번호 : " + inputPw);
		System.out.println("이름 : " + inputName);
		System.out.println("자기소개 : " + intro);
		
		// 응답화면 만들 때
		// -> JAVA에서 작성하기 너무 귀찮고 힘들다.
		// 요청을 위임함. 누가 이것좀 대신 만들어줘라 좀~~
		// -> JSP가 대신 화면을 만들어줘라 !! (Servlet 이 JSP에게 요청 위임)
		
		// JSP 가 대신 화면을 만들어주기 위해서는
		// Servlet이 어떤 요청을 받았는지 알아야함
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/result.jsp");
																	//webapp 폴더 기준으로생성
		
		dispatcher.forward(req, resp);
		// foword : 온 요청에 따라 jsp에게 요청을 위임하는애다
		// 나중에 redirect 도 쓸것임 ㅎ;
		
		
		
		
		
	}
	

}
