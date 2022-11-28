package kr.co.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * cmd=Main일때 사용되는 Action
 * @author user
 */
public class MainAction implements Action {

	private boolean forwardFlag;
	private String url;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//Web Parameter 처리
		//관계유지
		//View 페이지에 보내줄 값 설정
		//이동방식 설정
		forwardFlag=true;
		url="main/index.jsp";
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
