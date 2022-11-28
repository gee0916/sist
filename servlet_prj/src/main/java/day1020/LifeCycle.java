package day1020;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycle extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("최초 요청자에 의해 한번만 호출 된다");
	}//init

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 모든 접속자에 의해 계속 호출된다"+request.getRemoteAddr());
	}//service
	
	public void destroy() {
		System.out.println("destroy() WAS가 종료되면 한번만 호출된다.");
	}//destroy

}