package kr.co.sist.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.service.EmpFormService;

/**
 * cmd=E0001일때 사용되는 Action
 * 사원정보 입력 폼에 입력값을 받는 일
 * @author user
 */
public class EmpFormAction implements Action {

	private boolean forwardFlag;
	private String url;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//1. 웹 ㅠ파라메터 처리
		//2. 관꼐유지
		//3. 이동방식의 처리
		//4. Service객체를 사용하고 결과가 있다면 scope객체에 넣는다
		EmpFormService efs=new EmpFormService();
		List<Integer> list=efs.deptType();
		
		
		request.setAttribute("deptData", list);
		
		forwardFlag=true;
		url="emp/emp_add_form.jsp";
	
	}
	
	@Override
	public boolean isForward() {
		return forwardFlag;
	}
	
	@Override
	public String moveURL() {
		return url;
	}
	
}
