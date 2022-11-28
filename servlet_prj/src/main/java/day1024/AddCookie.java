package day1024;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AddCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//쿠키는 문자열만 저장할 수 있다. 날짜 => 문자열로 변환
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
		
		//1.  쿠키생성
		Cookie dataCookie=new Cookie("dataCookie", sdf.format(new Date()));
		
		//2. 쿠키생존시간 설정
		dataCookie.setMaxAge(60*60*24*1);
		
		//3. 쿠키심기
		response.addCookie(dataCookie);
		
		response.sendRedirect("read_cookie");
		
	}//doGet

}//AddCookie
