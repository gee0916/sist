package day1021;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ForwardA extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Servlet은 JSP보다 처리 속도가 빠르다. 화면 디자인 만들기 어렵다
		//Servlet에서는 업무로직에 집중하고, JSP에서는 View에 집중한다.
		List<TestVO> list=new ArrayList<TestVO>();
		list.add(new TestVO("차차",26));
		list.add(new TestVO("정주은",25));
		list.add(new TestVO("정현지",25));
		list.add(new TestVO("송성우",27));
		
		//scope객체에 넣어 JSP로 보낸다
		request.setAttribute("personData", list);
		
		//1. 이동할 페이지 설정
		RequestDispatcher rd=request.getRequestDispatcher("day1021/forward_b.jsp");
		
		//2. 이동
		rd.forward(request, response); //서블릿이 요청될 때 생성된 request와 response가 전달된다.
		
	}//doGet

}
