package day1025;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * DD에 정의된 특정 서블렛만 사용할 수 있는 값 (init-param 사용)
 * @author user
 *
 */
@SuppressWarnings("serial")
public class TestInitParam extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//<init-param> 정의된 값 받기
		//1. HttpServlet에서 ServletConfig를 얻는다
		ServletConfig sc=getServletConfig();
		
		//2. ServletConfig에서 이름을 넣어 init-param에 정의된 값을 얻는다.
		String name=sc.getInitParameter("name");
		String age=sc.getInitParameter("age");
	
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		
		RequestDispatcher rd=request.getRequestDispatcher("day1025/servlet_config.jsp");
		rd.forward(request, response);
		
	}//doGet

}//TestInitParam
