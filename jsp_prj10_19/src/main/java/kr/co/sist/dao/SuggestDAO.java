package kr.co.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import kr.co.sist.vo.SuggestVO;
import kr.co.sist.vo.WebMemberVO;

public class SuggestDAO {
	
	private static SuggestDAO wmDAO;
	private SuggestDAO() {
		
	}
	public static SuggestDAO getInstance() {
		if(wmDAO == null) {
			wmDAO=new SuggestDAO();
		}
		return wmDAO;
	}
	
	public List<SuggestVO> selectSuggest(String keyword) throws SQLException {
		List<SuggestVO> list=new ArrayList<SuggestVO>();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			con=DbcpDAO.getInstance().getConn("jdbc/dbcp");
			
			String selectWebMamber="select num, keyword from suggest where lower(keyword) like lower(?)||'%'";
			pstmt=con.prepareStatement(selectWebMamber);
			pstmt.setString(1, keyword);
			rs=pstmt.executeQuery();
			
			SuggestVO sVO=null;
			
			while(rs.next()) {
				sVO=new SuggestVO(rs.getInt("num"), rs.getString("keyword"));
				list.add(sVO);
			}
			
		} catch (NamingException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {rs.close();}
			if(pstmt != null) {pstmt.close();}
			if(con != null) {con.close();}
		}
		
		return list;
	}

}
