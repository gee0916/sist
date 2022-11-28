package day1024;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginAddCookie extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		String saveFlag=request.getParameter("saveFlag");

		Cookie cookieId=new Cookie("saveId", id);
		Cookie cookieSaveFlag=new Cookie("saveFlag", saveFlag);
		
		if( saveFlag != null ) { //저장이 눌려지면 아이디와 체크플래그를 쿠키에저장한다.
			cookieId.setMaxAge(60*60*24*30);
			cookieSaveFlag.setMaxAge(60*60*24*30);
		}else {//저장이 체크된 것이 아니라면 체크플래그를 쿠키에서 삭제한다.
			cookieId.setMaxAge(0);
			cookieSaveFlag.setMaxAge(0);
		}//end else 
		
		response.addCookie(cookieId);
		response.addCookie(cookieSaveFlag);
		
		RequestDispatcher rd=request.getRequestDispatcher("day1024/login_result.jsp");
		rd.forward(request, response);
		
	}//service

}//class
