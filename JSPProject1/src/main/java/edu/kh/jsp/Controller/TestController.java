package edu.kh.jsp.Controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/test/result")
public class TestController extends HttpServlet{
	
	// a 태그의 href 속성을 통해서 요청받음 -> GET 요청
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 파라미터로 사용할 값이 어차피없고,세팅해줄 값도 없다~
		// 바로 JSP 로 위임코드 작성
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/testResult.jsp");
		
		dispatcher.forward(req, resp);
		
	}
}
