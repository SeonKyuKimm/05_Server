package edu.kh.surf.practice.model.service;

import static edu.kh.surf.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import edu.kh.surf.practice.model.DAO.PracticeDAO;
import edu.kh.surf.practice.model.dto.Practice;

public class PracticeService {

	PracticeDAO dao = new PracticeDAO();

	
	/** 로그인 한 회원의  practiceList 전체 조회
	 * @param memberNo
	 * @return practiceList
	 * @throws Exception
	 */
	public List<Practice> selectAll(int memberNo) throws Exception {
		Connection conn = getConnection();

		List<Practice> practiceList = dao.selectAll(conn, memberNo);
		
		close(conn);
		
		return practiceList;
	}
}
