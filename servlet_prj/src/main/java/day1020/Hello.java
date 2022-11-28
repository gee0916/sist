package day1020;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. HttpSerblet을 상속
@SuppressWarnings("serial")
public class Hello extends HttpServlet {

	//요청방식을 처리할 수 있는 method를 Override
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//3. 응답방식 설정 (MIME-types 설정)
		response.setContentType("text/html;charset=UTF-8");
		
		//4. 출력스트림 얻기
		PrintWriter out= response.getWriter();
		
		//5. 응답할 내용을 만들어, 출력스트림에 기록
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>안녕Servlet</title>");
		out.println("<meta charset='UTF-8'>");
		out.println("</head>");
		out.println("<body>");
		String name="정현지";
		out.print("<strong>");
		out.print(name);
		out.println("</strong>님 안녕하세요?<br>");
		out.println("Hello Servlet<br>");
		out.println("오늘은 2022-9-22일 목요일입니다");
		out.println("</body>");
		out.println("</html>");
		
	}//doGet

}//class

//6. Servlet을 web service하기위해 DD(web.xml)에 등록해야한다 => mapping 필요
