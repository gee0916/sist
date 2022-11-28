package day1024;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class RemoveSession extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//1. 세션 얻기
		HttpSession session=request.getSession();
	//2. 세션 삭제
		session.removeAttribute("userName");
	//3. 세션 무효화
		session.invalidate();
	//4. 이동할 페이지 설정
		RequestDispatcher rd=request.getRequestDispatcher("day1024/remove_session.jsp");
	//이동
		rd.forward(request, response);
	}//doGet

}//RemoveSession
