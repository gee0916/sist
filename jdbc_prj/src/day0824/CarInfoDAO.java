package day0824;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.common.dao.DbConnection;

public class CarInfoDAO {
	/////////////////////Singleton 패턴화//////////////////////////////////
	private static CarInfoDAO ciDAO;
	
	private CarInfoDAO() {
	}//CarInfoDAO
	
	public static CarInfoDAO getInstance() {
		if(ciDAO == null) {
			ciDAO = new CarInfoDAO();
		}//end if
		
		return ciDAO;
	}//getInstance
	////////////////////////////////////////////////////////////////////////
	
	public List<CarVO> selectCarColumn(String maker) throws SQLException{
		List<CarVO> list = new ArrayList<CarVO>();
		
		DbConnection dc = DbConnection.getInstance();
		
		Connection con =null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		
		//1. 드라이버 로딩
		try {
		//2. Connection 얻기
			con = dc.getConn();
		//3. 쿼리문 생성 객체 얻기
			StringBuilder select = new StringBuilder();
			select
			.append("	select	 cc.country, cc.maker, cma.model, cmo.car_year, cmo.price, cmo.car_option	")
			.append("	from	car_country cc,	car_maker cma,	car_model cmo									")
			.append("	where	(cma.maker=cc.maker and cmo.model= cma.model) and cc.maker = ?																					");
			
			pstmt = con.prepareStatement(select.toString());
		//4. 바인드 변수 값 설정
			pstmt.setString(1, maker);
		//5. 쿼리문 생성 후 결과 얻기
			rs = pstmt.executeQuery();
			
			CarVO cVO = null;
			
			while(rs.next()) {
				cVO = new CarVO();
				cVO.setCountry(rs.getString("country"));
				cVO.setMaker(rs.getString("maker"));
				cVO.setModel(rs.getString("model"));
				cVO.setCarYear(rs.getString("car_year"));
				cVO.setCarOption(rs.getString("car_option"));
				cVO.setPrice(rs.getInt("price"));
				
			}//end while
			list.add(cVO);
			
			
		} finally {
			dc.dbClose(rs, pstmt, con);
		//6. 연결 끊기
		}//end finally
		
		return list;
	}//selectCarColumn
}//class
