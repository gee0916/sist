package day0822;

import java.awt.image.MultiPixelPackedSampleModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import kr.co.sist.common.dao.DbConnection;

/**
 * 테이블명만 알고, 컬럼의 정볼르 모를 때 사용하는 인터페이스
 * ResultDatMetaData=>컬럼의갯수, 컬럼명, 컬럼데이터형, 컬럼크기, 널 허용여부
 * 
 * 사용법
 * 1. 쿼리문을 실행
 * 2. ResultSet에서 MetaData를 얻는다
 * 3. ResultSetMetaData에서 제공하는 컬럼정보를 얻는다
 * @author user
 *
 */
public class UseResultSetMetaData {

	public UseResultSetMetaData(String tableName) throws SQLException {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ResultSetMetaData rsmd=null;
		
		DbConnection dc=DbConnection.getInstance();
		try {
		//1. 드라이버로딩
		//2. 커넥션얻기
			con=dc.getConn();
			
		//3. 쿼리문 생성객체얻기
			StringBuilder select=new StringBuilder();
			select.append("select*from ").append(tableName);
			
			pstmt=con.prepareStatement(select.toString());
		//4. 바인드 변수에 값 설정
//			pstmt.setString(1, tableName);
			
		//5. 쿼리문 수행 후 결과 얻기 (RezultSetMetaData를 사용하여 컬럼정보를 얻는다)
			rs=pstmt.executeQuery();
			//ResultSet에서 ResultSetMetaData를 얻는다
			rsmd=rs.getMetaData();
			
//			//ResultSetMetaData에서 컬럼의 정보를 얻기
//			System.out.println("컬럼의 개수: "+rsmd.getColumnCount());
//			//컬럼명: 인덱스는 1번부터 시작
//			System.out.println("처음 컬럼명: "+rsmd.getColumnName(1));
//			//컬럼 테이터형:
//			System.out.println("데이터형: "+rsmd.getColumnTypeName(1));
//			//컬럼 크기
//			System.out.println("컬럼크기: "+rsmd.getPrecision(1));
//			//null 허용
//			System.out.println("NULL허용: "+(rsmd.isNullable(1)==0?"NOT NULL":"NULL"));
			
			int precision=0;
			
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.printf("%s\t%s",rsmd.getColumnName(i), 
						rsmd.getColumnTypeName(i));
						
				precision=rsmd.getPrecision(i);
					if(precision != 0) {
						System.out.printf("(%d)\t",precision);
					}//end if
					System.out.printf("%s\n",rsmd.isNullable(i)==0?"NOT NULL":"");
			}//end for
			
			
		}finally {
		//6. 연결끊기
			dc.dbClose(rs, pstmt, con);
		}//end finally
		
	}//UseResultSetMetaData
	
	public static void main(String[] args) {
		try {
			String tableName=JOptionPane.showInputDialog("테이블명을 입력해주세요").toUpperCase();
			new UseResultSetMetaData(tableName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}//main

}//class
