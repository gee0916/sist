package day1025;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.util.cipher.DataDecrypt;

@SuppressWarnings("serial")
public class TestContextParam extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//모든 서블렛, JSP에서 값을 받을 수 있는 <context-param>사용
		//1. HttpServlet에서부터 ServletContext얻기
		ServletContext sc=getServletContext();
		
		//값얻기
		String dba_id=sc.getInitParameter("dba_id");
		String dba_pass=sc.getInitParameter("dba_pass");
		
		DataDecrypt dd=new DataDecrypt("abcdefjiklmn12345");
		
		try {
			System.out.println(dd.decryption(dba_id));
			System.out.println(dd.decryption(dba_pass));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (GeneralSecurityException e) {
			e.printStackTrace();
		}
	
	}//doGet

}//TestContextParam
