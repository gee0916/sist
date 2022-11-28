package kr.co.sist.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.action.Action;
import kr.co.sist.action.EmpFormAction;
import kr.co.sist.action.EmpFormProcessAction;
import kr.co.sist.action.EmpSearchAction;
import kr.co.sist.action.MainAction;

/**
 * 진입점: 
 * 1. 모든 요청을 받고 - 진입점 설정
 * 2. 요청에 맞는 Action을 찾고 - interface와 Map을 사용
 * 3. Action의 method를 호출 - Override
 * 4. method가 반환하는 값을 받아
 * 5. JSP로 이동한다 - 페이지 이동
 * @author user
 */
@SuppressWarnings("serial")
public class DispatcherServlet extends HttpServlet {
	
	private static Map<String, Action> map;
	
	/*class field = > 변수, method 정의
			method - 호출해야 일을 해요
			{} - 영역 area
			{method 내 자바 코드 } - instance 영역 : 클래스가 객체화 될때 생성자 보다 먼저 호출되어 실행되는 영역
			static {method 내 자바 코드 } - static 영역 : 클래스가 사용되면 먼저 호출되어 실행되는 영역 */
 	
	static { //호출되지 않아도 클래스가 사용되면 가장 처음 자동으로 실행되는 영역 - static 영역
				DispatcherServlet ds;
		map=new HashMap<String,Action>();
		map.put("Main", new MainAction());
		map.put("E0001", new EmpFormAction());
		map.put("E0002", new EmpFormProcessAction());
		map.put("S0001", new EmpSearchAction());
	}//init

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //POST방식의 한글 처리: 모든 POST방식의 요청에서는 한글 처리를 하지 않아도 된다.
		
		String cmd=request.getParameter("cmd");
		if(cmd==null || !map.containsKey(cmd) ) { //최초요청이거나, cmd가 외부에서 삭제 되거나 외부에서 훼손된 경우에는
			cmd="Main";
		}//end if
		
		Action action=map.get(cmd);
		
		//파라메터에 대한 처리
		action.execute(request, response);
		
		//액션에서 가져온 값을 가지고 JSP페이지로 이동 수행
		move(request, response, action.isForward(), action.moveURL());
		
	}//doPost
	
	public void move(HttpServletRequest request, HttpServletResponse response, boolean forwrdFlag, String url) throws ServletException, IOException {
		
		if(forwrdFlag) { //forward로 이동
			RequestDispatcher rd=request.getRequestDispatcher(url);
			rd.forward(request, response);
		}else { //redirect로 이동
			response.sendRedirect(url);
		}
		
	}
		

}
