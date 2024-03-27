package edu.kh.todoList.member.model.service;

import java.sql.Connection;

import static edu.kh.todoList.common.JDBCTemplate.*;
import edu.kh.todoList.member.model.dao.MemberDAO;
import edu.kh.todoList.member.model.dto.Member;

public class MemberService {

	private MemberDAO dao = new MemberDAO();

	/** Login Service
	 * @param inputId
	 * @param inputPw
	 * @return loginMember
	 */
	public Member login(String inputId, String inputPw) throws Exception {
		
		Connection conn = getConnection();
		
		Member loginMember = dao.login(conn, inputId, inputPw);
		
		close(conn);
				
		return loginMember;
	}

	/** 회원가입 서비스
	 * @param member
	 * @return result
	 */
	public int signup(Member member) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.signup(conn, member);
		
		// DML 구문 사용했으니 트랜젝션 제어 처리 - 
		if(result>0) commit(conn);
		else		 rollback(conn);
		
		// 사용한 커넥션 반환 ㅎ~
		close(conn);
		
		return result;
	}
}
