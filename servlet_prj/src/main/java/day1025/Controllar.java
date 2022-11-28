package day1025;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 진입점에 대한 설정: 어떤 요청이 있더라도 하나의 서블렛이 요청이 모아서 받기 위해설정
 * 서블렛 요청명이 제각각이면 처리가 될수 없기 때문에 하나로 모아서 처리할 수 있는 방안 생각
 * => 확장자!!!
 * @author user
 */
@SuppressWarnings("serial")
public class Controllar extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response); //GET방식의 요청이 들어오면 doPost method로 처리
	}//doGet
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청방식은 그대로 유지된다
		System.out.println("요청"+request.getRequestURL());
		
		//Map에 XxxAction을 넣고 찾아서 파라메터를 처리한 후 결과를 가지고 온다.
		List<String> list=new ArrayList<String>();
		list.add("자바");
		list.add("오라클");
		list.add("JDBC");
		list.add("HTML,CSS,JavaScript");
		list.add("JSP");
		
		request.setAttribute("subjectList", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("day1025/index.jsp");
		rd.forward(request, response);
		
	}//doPost

}
