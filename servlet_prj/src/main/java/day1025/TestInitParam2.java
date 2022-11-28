package day1025;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.util.cipher.DataEncrypt;

/**
 * DD에 정의된 특정 서블렛만 사용할 수 있는 값 (init-param 사용)
 * @author user
 *
 */
@SuppressWarnings("serial")
public class TestInitParam2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//<init-param> 정의된 값 받기
		//1. HttpServlet에서 ServletConfig를 얻는다
		ServletConfig sc=getServletConfig();
		
		//2. ServletConfig에서 이름을 넣어 init-param에 정의된 값을 얻는다.
		String name=sc.getInitParameter("name");
		String age=sc.getInitParameter("age");
	
		System.out.println("다른 서블렛: "+name+"/"+age);
		
		DataEncrypt de=new DataEncrypt("abcdefjiklmn12345");
		try {
			System.out.println(de.encryption("scott"));
			System.out.println(de.encryption("tiger"));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (GeneralSecurityException e) {
			e.printStackTrace();
		}
		
	}//doGet

}//TestInitParam
