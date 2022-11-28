package kr.co.sist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import kr.co.sist.vo.EmpVO;
import kr.co.sist.vo.SearchDataVO;
import oracle.sql.ConcreteProxyUtil;

public class EmpDAO {

	private static EmpDAO eDAO;
	
	private EmpDAO() {
		
	}
	
	public static EmpDAO getInstance() {
		if(eDAO ==null ) {
			eDAO=new EmpDAO();
		}
		
		return eDAO;
	}
	
	public void insertEmp(EmpVO eVO) throws SQLException {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		
		//1. JDNI 사용객체 생성
		//2. DataSouce 얻기
		try {
			
		//3. Connection얻기
			con=DbcpDAO.getInstance().getConn();
			
		//4. 쿼리문생성객체 얻기
			String insertCpEmp="insert into cp_emp1(empno, ename, deptno, mgr, hiredate) values(?,?,?,?, sysdate)";
			
			pstmt=con.prepareStatement(insertCpEmp);
			
		//5. 바인드변수 값 설정
			pstmt.setInt(1, eVO.getEmpno());
			pstmt.setString(2, eVO.getEname());
			pstmt.setInt(3, eVO.getDeptno());
			pstmt.setInt(4, eVO.getMgr());
			
		//6. 쿼리문 실행
			pstmt.execute();
			
		}catch(NamingException ne) {
			ne.printStackTrace();
		}finally {
			
		//7. 연결끊기
			if(pstmt!=null) {pstmt.close(); } //end if
			if(con!=null) {con.close(); } //end if
		
		}
		
	}//insertEmp
	
	/**
	 * 총 게시물의 수를 조회
	 * @return
	 * @throws SQLDataException
	 */
	public int totalCount(SearchDataVO sdVO) throws SQLException {
		int totalCount=0;
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
		//1. JNDI 사용객체 생성
		//2. DataSource 얻기
		//3. Connection  얻기
			con=DbcpDAO.getInstance().getConn();
		//4. PreparedStatement 얻기
			StringBuilder selectEmpCount=new StringBuilder();
			
			//전체글수
			selectEmpCount
			.append("select count(empno) cnt")
			.append(" from cp_emp1");
			
			//검색에 대한 글수: 문자열 컬럼만 검색 가능 부서번호나 사원번호는 검색 안됨
			if(sdVO.getKeyword() !=null) {
				selectEmpCount
					.append(" where ").append(sdVO.getFieldName()).append(" like '%'||?||'%'");
			}
			
			pstmt=con.prepareStatement(selectEmpCount.toString());
			
		//5. 바인드 변수 값 설정
			
			if(sdVO.getKeyword()!=null) {
				pstmt.setString(1, sdVO.getKeyword());
			}
			
		//6. 쿼리문 수행 후 결과 얻기
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				totalCount=rs.getInt("cnt");
			}
			
		}catch(NamingException ne) {
			ne.printStackTrace();
		}finally {
		//7. 연결 끊기
			if(rs!=null) {rs.close();}
			if(pstmt!=null) {pstmt.close();}
			if(con!=null) {con.close();}
			
		}
		
		return totalCount;
	}
	
	
	public List<EmpVO> selectEmp(SearchDataVO sdVO) throws SQLException {
		
		List<EmpVO> list=new ArrayList<EmpVO>();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
		//1. JNDI 사용객체 생성
		//2. DataSource 얻기
		//3. Connection  얻기
			con=DbcpDAO.getInstance().getConn();
		//4. PreparedStatement 얻기
			StringBuilder selectEmp=new StringBuilder();
			
			selectEmp
			.append("select empno, ename, deptno, mgr, hiredate")
			.append(" from (select empno, ename, deptno, mgr, hiredate, row_number() over (order by hiredate desc) rank from cp_emp1 ");
			
			if(sdVO.getKeyword() !=null) {
				selectEmp
					.append(" where ").append(sdVO.getFieldName()).append(" like '%'||?||'%' ");
			}
					
			selectEmp
			.append(") where rank between ? and ?");
			
			pstmt=con.prepareStatement(selectEmp.toString());
			
		//5. 바인드 변수 값 설정
			
			int bindCnt=0;
			if(sdVO.getKeyword()!=null) {
				pstmt.setString(++bindCnt, sdVO.getKeyword());
			}
			
			pstmt.setInt(++bindCnt, sdVO.getStartNum());
			pstmt.setInt(++bindCnt, sdVO.getEndNum());
			
		//6. 쿼리문 수행 후 결과 얻기
			
			rs=pstmt.executeQuery();
			
			EmpVO eVO=null;
			
			while(rs.next()) {
				eVO=new EmpVO(rs.getInt("empno"), rs.getInt("deptno"), rs.getInt("mgr"),
						rs.getString("ename"), rs.getDate("hiredate"));
				
				list.add(eVO);
			}
			
		}catch(NamingException ne) {
			ne.printStackTrace();
		}finally {
		//7. 연결 끊기
			if(rs!=null) {rs.close();}
			if(pstmt!=null) {pstmt.close();}
			if(con!=null) {con.close();}
			
		}
		return list;
	}//selectEmp
	
	
}//EmpDAO
