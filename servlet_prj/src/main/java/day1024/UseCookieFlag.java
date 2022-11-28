package day1024;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class UseCookieFlag extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		boolean saveFlag =false;
		String cookieId="";
		
		Cookie[] cookies=request.getCookies();
		if( cookies != null ) {
			for( Cookie cookie : cookies) {
				if( "saveFlag".equals(cookie.getName())) {
					saveFlag= true;
				}//end if
				if( "saveId".equals(cookie.getName())) {
					cookieId= cookie.getValue();
				}//end if
			}//end for
		}//end if
		
		request.setAttribute("saveFlag", saveFlag);
		request.setAttribute("saveId", cookieId);
		
		RequestDispatcher rd=request.getRequestDispatcher("day1024/login.jsp");
		rd.forward(request, response);
	}//doGet

}//class
