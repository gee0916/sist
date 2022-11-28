package day1024;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ReadCookie extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies=request.getCookies();
		
		if(cookies!=null) { //JSESSIONID가 존재하므로 null은 없다
			for(Cookie cookie : cookies) {
				if(!"JSESSIONID".equals(cookie.getName())) {
					//JSESSIONID가 아닌 다른 쿠키가 존재하는 지?
					if("dataCookie".equals(cookie.getName())) {
						//값이 존재한다면 Scope 객체에 값 할당
						request.setAttribute("cookie_value", cookie.getValue());
					}//end if
				}//end if
			}//end for
		}//end for
	
		RequestDispatcher rd=request.getRequestDispatcher("day1024/read_cookie.jsp");
		rd.forward(request, response);
		
	}//service

}//ReadCookie
