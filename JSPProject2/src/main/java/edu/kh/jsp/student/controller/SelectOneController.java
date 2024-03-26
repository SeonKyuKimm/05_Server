package edu.kh.jsp.student.controller;

import java.io.IOException;
import java.util.List;

import edu.kh.jsp.student.model.dto.Student;
import edu.kh.jsp.student.model.service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/jstl/student/selectOne")
public class SelectOneController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 서비스(비즈니스 로직 ) 객체 생성하기
				StudentService service = new StudentService();
				
				try {
					String deptName = req.getParameter("deptName"); // 입력한 과
					
					//학과가 맞는 학생 조회 서비스 호출
					List<Student> stdList = service.selectOne(deptName);
					
					req.setAttribute("stdList", stdList);
					
					
				}catch(Exception e){
					e.printStackTrace();
				}
				
				// 요청 위임
				req.getRequestDispatcher("/WEB-INF/views/student/selectOne.jsp").forward(req, resp);
		
	}
}