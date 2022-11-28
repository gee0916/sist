package kr.co.sist.common.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.print.attribute.standard.PresentationDirection;


/**
 * DB연동을 제공하는 일
 * 싱글턴 패턴을 도입
 * @author user
 */
public class DbConnection {
	
	private static DbConnection dbConn;
	
	//1. 생성자의 접근 지정자를 private으로 하여 클래스외부에 객체생성을 할 수 없도록 막는다.
	private DbConnection() {
	}//DbConnection
	
	//2. 객체를 하나로 유지하면서 객체를 반환하는 일을 하는 method 작성
	/**
	 * 싱글턴 패턴이 적용된 method: 객체가 하나로 유지된다
	 * @return 하나의 객체
	 */
	public static DbConnection getInstance() {
		if(dbConn==null) { //객체가 없다면
			dbConn=new DbConnection(); //객체를 생성한다
		}//end if
		return dbConn; //객체를 반환한다
	}//getInstance
	
	/**
	 * DBMS와 연동된 Connection을 반환하는 일
	 * @return
	 * @throws SQLException
	 */
	public Connection getConn() throws SQLException {
		Connection con=null;
		//1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
		
		//2. Connection 얻기
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String id="scott";
		String pass="tiger";
		
		con=DriverManager.getConnection(url,id,pass);
		
		return con;
		
	}//getConn
	
	/**
	 * DBMS와 연결되어 사용된 객체를 닫는 일
	 * @param rs
	 * @param pstmt
	 * @param con
	 */
	public void dbClose(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		
		if(rs!=null) {rs.close();} //end if
		if(pstmt!=null) {pstmt.close();} //end if
		if(con!=null) {con.close();} //end if
		
	}//dbClose

}//class
