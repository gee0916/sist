package day1024;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class SetSession extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramName=request.getParameter("paramName");
		
		if(paramName!=null) { //파라메터가 존재하면, 세션에 값 넣기
			//1. 세션 얻기
			HttpSession session=request.getSession();
			//2. 세션에 interval 설정 (모든 페이지에 인터벌 값이 설정=> 코드, DD)
			session.setMaxInactiveInterval(60); //DD보다 코드로 정의하는 것이 우선한다
			//3. 세션 값 설정
			session.setAttribute("userName", paramName);
			
		}//end if
		
		//forward 방식으로 view 페이지 이동
		
		RequestDispatcher rd=request.getRequestDispatcher("day1024/use_session_a.jsp");
		rd.forward(request, response);
		
	}//doGet

}//SetSession
