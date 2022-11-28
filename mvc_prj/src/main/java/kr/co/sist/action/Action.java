package kr.co.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	
	/**
	 * 웹 파라메터를 처리, 관계유지하기 위한 method
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;
	
	
	/**
	 * 이동방식의 정의
	 * true-forward, false-redirect
	 * @return
	 */
	public boolean isForward();
	
	
	/**
	 * 이동 URL	 * @return
	 */
	public String moveURL();
	
}
