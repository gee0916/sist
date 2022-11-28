package day0822;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.common.dao.DbConnection;

public class TableInfoDAO {
	
	private static TableInfoDAO tDAO;
	
	private TableInfoDAO() {
	}//TableInfoDAO
	
	public static TableInfoDAO getInstanc() {
		if(tDAO==null) {
			tDAO=new TableInfoDAO();
		}//end if
		return tDAO;
	}//getInstanc
	
	public List<String> selectAllTable() throws SQLException {
		List<String> list=new ArrayList<String>();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		DbConnection db=DbConnection.getInstance();
		
		try {
			con=db.getConn();
			
			String selectTab="select tname from tab";
			
			pstmt=con.prepareStatement(selectTab.toString());
			rs=pstmt.executeQuery();

			while(rs.next()) {
				list.add(rs.getString("tname"));
			}//end while
			
		}finally{
			db.dbClose(rs, pstmt, con);
		}//end finally
		
		return list;
	}//selectAllTable
	
	public List<ColumnVO> selectTableColumn(String table) throws SQLException {
		List<ColumnVO> list=new ArrayList<ColumnVO>();

		ColumnVO clVO=null;
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		DbConnection db=DbConnection.getInstance();
		
		try {
			
			con=db.getConn();
			StringBuilder selectUTC=new StringBuilder();
			selectUTC
			.append("	select column_name, data_type, data_length	")
			.append("	from user_tab_cols")
			.append("	where table_name=?");
			
			pstmt=con.prepareStatement(selectUTC.toString());
			
			pstmt.setString(1, table);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				clVO=new ColumnVO();
				clVO.setColumnName(rs.getString("column_name"));
				clVO.setDataType(rs.getString("data_type"));
				clVO.setDataLength(rs.getInt("data_length"));
				
				list.add(clVO);
			}//end while
			
		}finally{
			db.dbClose(rs, pstmt, con);
		}//end finally
		
		return list;
	}//selectTableColumn

}//class
