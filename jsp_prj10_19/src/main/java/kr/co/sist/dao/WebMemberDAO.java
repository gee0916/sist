package kr.co.sist.dao;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import kr.co.sist.util.cipher.DataEncrypt;
import kr.co.sist.vo.BeanMemberVO;
import kr.co.sist.vo.WebMemberVO;

public class WebMemberDAO {
	
	private static WebMemberDAO wmDAO;
	private WebMemberDAO() {
		
	}
	public static WebMemberDAO getInstance() {
		if(wmDAO == null) {
			wmDAO=new WebMemberDAO();
		}
		return wmDAO;
	}
	
	/**
	 * 아이디 중복확인
	 * @param paramId
	 * @return
	 * @throws SQLException
	 */
	public boolean selectId(String paramId)throws SQLException{
		boolean flag=false;
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
		//1.JDNI사용 객체 생성
		//2.DBCP에서 DataSource 얻기
		//3.Connection 얻기
			con=DbcpDAO.getInstance().getConn("jdbc/dbcp");
		//4.쿼리문생성객체얻기
			String selectId="select id from web_member where id=?";
			pstmt=con.prepareStatement(selectId);
		//5.바인드 변수에 값 할당
			pstmt.setString(1, paramId);
		//6.쿼리문 수행 후 결과얻기
			rs=pstmt.executeQuery();
			
			flag=rs.next();//검색결과 있음 true, 없음 false
				
		}catch(NamingException ne) {
			ne.printStackTrace();
		}finally {
		//7.연결끊기
			if(rs !=null ) {rs.close();}
			if(pstmt !=null ) {pstmt.close();}
			if(con !=null ) {con.close();}
		}
		return flag;
	}
	
	public void insertMember(BeanMemberVO bmVO) throws SQLException {
		//1. JNDI 사용객체 생성
		//2. DataSource 얻기
		//3 Connection 얻기
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DbcpDAO.getInstance().getConn("jdbc/dbcp");
			//4. 쿼리문 생성객체 얻기
			StringBuilder insertWebmember=new StringBuilder();
			insertWebmember
			.append("insert into web_member")
			.append("(id, pass,name,birth,phone,tel,tel_flag,email,email_flag,gender,zipcode,addr1,addr2,ip_addr)")
			.append("values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			String key="abcdfghijklmnop1234~";
			DataEncrypt de=new DataEncrypt(DataEncrypt.messageDigest("SHA-1", key));
			
			pstmt=con.prepareStatement(insertWebmember.toString());
			//5. 바인드 변수에 값할당
			pstmt.setString(1, bmVO.getId());
			pstmt.setString(2, DataEncrypt.messageDigest("MD5", bmVO.getPass()));
			pstmt.setString(3, de.encryption(bmVO.getName()));
			pstmt.setString(4, bmVO.getBirth());
			pstmt.setString(5, bmVO.getPhone());
			pstmt.setString(6, de.encryption(bmVO.getTel1()));
			pstmt.setString(7, bmVO.getTelFlag());
			pstmt.setString(8,  de.encryption(bmVO.getEmail1()+"@"+bmVO.getEmail2()));
			pstmt.setString(9, bmVO.getEmailFlag());
			pstmt.setString(10, bmVO.getGender());
			pstmt.setString(11, bmVO.getZipcode());
			pstmt.setString(12, bmVO.getAddr1());
			pstmt.setString(13, bmVO.getAddr2());
			pstmt.setString(14, bmVO.getIpAddr());
			
		//6. 쿼리수행 후 결과 얻기
			pstmt.executeQuery();
			
		}catch(NamingException ne) {
			ne.printStackTrace();
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}catch(GeneralSecurityException e) {
			e.printStackTrace();
		}finally {
		//7. 연결 끊기
			if(pstmt != null) {pstmt.close();} //end if
			if(con != null) {con.close();} //end if
		}//end finally
	}//insertMember
	
	
	public void insertMemberLana(BeanMemberVO bmVO)throws SQLException {
		int cnt=0;
		//1. JNDI사용객체 생성
		//2. DataSource 얻기
		Connection con=null;
		PreparedStatement pstmt=null;
		
		int dataCnt=0; //추가할 레코드의 수
		int processCnt=0; //추가된 레코드의 수
		
		try {
		//3. Connection 얻기
			con=DbcpDAO.getInstance().getConn("jdbc/dbcp");
			con.setAutoCommit(false);
		//4. 쿼리문 생성객체 얻기
			String insert_lang="insert into web_member_lang(id,lang) values(?,?)";
			pstmt=con.prepareStatement(insert_lang);
			String[] lang=bmVO.getLang();
			
			dataCnt=lang.length;
			
			for(int i=0; i<lang.length; i++) {
				//5. 바인드 변수에 값 설정
				pstmt.setString(1, bmVO.getId());
				pstmt.setString(2, lang[i]);
				
				//6. 쿼리문 수행 후 결과 얻기
				pstmt.executeQuery();
				processCnt++;
			}//end for
			
				if(dataCnt==processCnt) {
					con.commit();
				}else {
					con.rollback();
				}//end else
			
		}catch (NamingException ne) {
			ne.printStackTrace();
		}finally {
		//7. 연결끊기
			if(pstmt != null) {pstmt.close();} //end if
			if(con != null) {con.close();} //end if
		}//end finally
		
	}//insertMemberLana
	
	public  boolean insertPreMember(BeanMemberVO bmVO) {
		boolean flag=false;
		try {
			//하나의 transaction으로 묶일려면
			//커넥션 얻기
			//autoCommit 해제
			insertMember(bmVO); //회원정보 추가
			insertMemberLana(bmVO); //회원 언어정보 추가
			//method의 반환값을 받아서 목표한 행의 수라면
			//connection의 commit이나 rollback을 수행
			flag=true;
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return flag;//end catch
	}//insertPreMember
	
	public List<WebMemberVO> selectWebMember() throws SQLException {
		List<WebMemberVO> list=new ArrayList<WebMemberVO>();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			con=DbcpDAO.getInstance().getConn("jdbc/dbcp");
			
			String selectWebMamber="select id, pass, name, email from web_member";
			pstmt=con.prepareStatement(selectWebMamber);
			rs=pstmt.executeQuery();
			
			WebMemberVO wmVO=null;
			
			while(rs.next()) {
				wmVO=new WebMemberVO(rs.getString("id"), rs.getString("pass"), rs.getString("name"), rs.getString("email"));
				list.add(wmVO);
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
