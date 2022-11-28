package day1024;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RemoveCookie extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//1. 쿠키 생성
	Cookie cookie = new Cookie("dataCookie","");		
	
	//2. 생존시간 설정
	cookie.setMaxAge(0);
	
	//3. 쿠키심기
	response.addCookie(cookie);
	
	//페이지 이동
	response.sendRedirect("day1024/remove_cookie.jsp");
	
	}//doGet

}//RemoveCookie
