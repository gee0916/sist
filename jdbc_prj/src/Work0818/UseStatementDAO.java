package Work0818;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UseStatementDAO {
	public int insertWorkJdbc(String name) throws SQLException {
		int rowCnt = 0;
		
		//1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		
		try {
		//2. Connection 얻기
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			
			con = DriverManager.getConnection(url, id, pass);
		//3. 쿼리문 생성객체얻기
			stmt = con.createStatement();
		//4. 쿼리문 수행 후 결과 닫기
			StringBuilder insertWorkJdbc = new StringBuilder();
			insertWorkJdbc
			.append("	insert into work_jdbc(name)			")
			.append("	values('").append(name).append("')	");
			
			rowCnt = stmt.executeUpdate(insertWorkJdbc.toString());
		} finally {
		//5. 연결끊기
			if( stmt != null ) { stmt.close(); };
			if( con != null ) { con.close(); };
		}//end finally
		return rowCnt;
	}//insertWorkJdbc
}//class
