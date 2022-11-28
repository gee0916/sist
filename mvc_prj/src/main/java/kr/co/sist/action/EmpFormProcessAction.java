package kr.co.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.service.EmpProcessService;
import kr.co.sist.vo.EmpVO;

/**
 * cmd=E0002일때 사용되는 Action
 * 사원정보 입력 폼에 입력값을 받는 일
 * @author user
 */
public class EmpFormProcessAction implements Action {

	private boolean forwardFlag;
	private String url;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		//파라메터 처리
		EmpVO eVO=new EmpVO();
		eVO.setDeptno(Integer.parseInt(request.getParameter("deptno")));
		eVO.setEmpno(Integer.parseInt(request.getParameter("empno")));
		eVO.setMgr(Integer.parseInt(request.getParameter("mgr")));
		eVO.setEname(request.getParameter("ename"));
		
		EmpProcessService eps=new EmpProcessService();
		//사원번호와 매니저번호의 유효성 검증
		if(eps.chkRange(eVO.getEmpno()) && eps.chkRange(eVO.getMgr())) {
			
			forwardFlag=true;
			if(eps.addEmp(eVO)) { //입력값을 가지고 DB작없 수행
				url="emp/emp_success.jsp";
			}else {
				url="emp/emp_db_err.jsp";
			}
			
		}else {
			//redirect 연습
			url="day1026/err.html";
		}

	}//execute
	
	@Override
	public boolean isForward() {
		return forwardFlag;
	}
	
	@Override
	public String moveURL() {
		return url;
	}
	
}
