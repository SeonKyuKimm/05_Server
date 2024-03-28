package edu.kh.surf.practice.model.DAO;

import static edu.kh.surf.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.surf.practice.model.dto.Practice;

public class PracticeDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	public PracticeDAO(){
		
		
		try {
			
			prop = new Properties();
			
			String filePath = 
					PracticeDAO.class.getResource("/edu/kh/surf/sql/PracticeSurf-sql.xml").getPath();
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	/** practice 조회 SQL 실행하는 DAO
	 * @param conn
	 * @param memberNo
	 * @return practiceList
	 */
	public List<Practice> selectAll(Connection conn, int memberNo) throws Exception {
		
		List<Practice> practiceList = new ArrayList<Practice>();
		
		try {
			
			String sql = prop.getProperty("selectAll");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, memberNo);
			
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				
				Practice practice = new Practice();
				
				practice.setPracticeNo(rs.getInt("PRACTICE_NO"));
				practice.setPracticeTitle(rs.getString("PRACTICE_TITLE"));
				practice.setPracticeMemo(rs.getString("PRACTICE_MEMO"));
				practice.setPracticeDate(rs.getString("PRACTICE_DATE"));
				
				practiceList.add(practice);
				
			}
			
			
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return practiceList;
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
