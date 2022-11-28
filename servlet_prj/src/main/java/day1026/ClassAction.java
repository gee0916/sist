package day1026;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 일반클래스를 사요하여 Web Parameter를 받기
 * @author user
 */
public class ClassAction {

	//1. HttpServletRequest와 HttpServletResponse를 매개변수로 선언한 method를 정의
	public void testParam(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("아이디:"+request.getParameter("id"));
		System.out.println("비밀번호:"+request.getParameter("password"));
	}
	
}
