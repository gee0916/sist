package day0823;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.common.dao.DbConnection;

public class CarDAO {
	
	private static CarDAO cDAO;
	
	private CarDAO() {
	}//CarDAO
	
	public static CarDAO getInstance() {
		if(cDAO==null) {
			cDAO=new CarDAO();
		}//end if
		return cDAO;
	}//getInstance
	
	public List<String> selectCarMaker(String maker)throws SQLException {
		List<String> list=new ArrayList<String>();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		DbConnection db=DbConnection.getInstance();
		
		try {
			
			con=db.getConn();
			StringBuilder selectCar=new StringBuilder();
			selectCar
			.append("	select 	cc.country, cc.maker, cma.model, cmo.car_year, cmo.price, cmo.car_option ")
			.append("	from car_country cc, car_maker cma, car_model cmo	")
			.append("	where cma.maker=cc.maker and cmo.model=cma.model and cc.maker=?");
			
			pstmt=con.prepareStatement(selectCar.toString());
			
			pstmt.setString(1, maker);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				//이렇게 하셔도 되지만  DAO에서는 화면 출력에 대한 부분을 만들지 않아요. + 기호를 사용하시는 것 보다는 StringBuilder의 append를 사용해주세요. ㄴ
				list.add("제조국: "+rs.getString("country")+"\n"+
						"제조사: "+rs.getString("maker")+"\n"+
						"모델명: "+rs.getString("model")+"\n"+
						"연식: "+rs.getString("car_year")+"\n"+
						"가격: "+rs.getString("price")+"\n"+
						"옵션: "+rs.getString("car_option"));
			}//end while
			
		}finally{
			db.dbClose(rs, pstmt, con);
		}//end finally
		return list;
	}//selectCarMaker

}//class
