package day0823;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.sist.common.dao.DbConnection;
import kr.co.sist.vo.TransactionVO;

/**
 * java.sql.Connection은 autocommit상태
 * 쿼리문(insert,update,delete)하나로 transaction이 완료되는 상태
 * 
 * 일관성: transaction으로 구성된 모든 쿼리가 성공 했을 때 테이블에 작업이 완료되어야하고,
 * 쿼리문 중 하나라도 실패하면 모든 테이블에 작업이 취소되어야한다.
 * @author user
 */
public class UseAutocommit {
	
	/**
	 * 입력되는 이름을 transaction_test1 테이블과 transaction_test2테이블 "모두" 추가하는 일
	 * @param tVO
	 * @throws SQLException
	 */
	public void insertJob(TransactionVO tVO)throws SQLException {
		
		DbConnection db=DbConnection.getInstance();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
		//1. 드라이버로딩
		//2. 커넥션얻기
			con=db.getConn();
			con.setAutoCommit(false);
//			System.out.println(con.getAutoCommit());
			
		//3. 쿼리문 생성객체 얻기
			String insert="insert into transaction_test1(name,age) values(?,?)";
			pstmt=con.prepareStatement(insert);

		//4. 바인드변수에 값 할당
			pstmt.setString(1, tVO.getName());
			pstmt.setInt(2, tVO.getAge());
			
		//5. 쿼리문 수행 후 결과 얻기
			int cnt1=pstmt.executeUpdate();
			
			pstmt.close();
			
			//3. 쿼리문 생성객체 얻기
			String insert2="insert into transaction_test2(name,age) values(?,?)";
			pstmt=con.prepareStatement(insert2);
			
			//4. 바인드변수에 값 할당
			pstmt.setString(1, tVO.getName());
			pstmt.setInt(2, tVO.getAge());
			
			//5. 쿼리문 수행 후 결과 얻기
			int cnt2=pstmt.executeUpdate();
			
			System.out.println("처음 insert"+(cnt1==1?"추가성공":"추가된 행 없음"));
			System.out.println("두번째 insert"+(cnt2==1?"추가성공":"추가된 행 없음"));
	
		}finally {
			//6. 연결끊기
			db.dbClose(null, pstmt, con);
		}//end finally
		
		
	}//insertJob

	public static void main(String[] args) {
		UseAutocommit us=new UseAutocommit();
		TransactionVO tVO=new TransactionVO("송성우",20);
		try {
			us.insertJob(tVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
	}//main

}//class
