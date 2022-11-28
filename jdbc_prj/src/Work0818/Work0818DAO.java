package Work0818;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Work0818DAO {
	
	public void insertWorkJdbc(String name) throws SQLException {
		
		//1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
		
		Connection con=null;
		Statement stmt=null;
		
		try {
		//2. 커넥션 얻기
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String id="scott";
			String pass="tiger";
			con=DriverManager.getConnection(url,id,pass);

		//3. 쿼리문생성객체 얻기
			stmt=con.createStatement();
			
		//4. 쿼리 수행 후 결과 얻기
			StringBuilder insertWorkJdbc=new StringBuilder();
			insertWorkJdbc
			.append("insert into work_jdbc(name) values ('").append(name).append("')");
			
			stmt.execute(insertWorkJdbc.toString());
			
		}finally {
		//5. 연결끊기
			if(stmt!=null) {stmt.close();} //end if
			if(con!=null) {con.close();} //end if
		}//end finally
		
	}//insertWorkJdbc

}//Work0818DAO
