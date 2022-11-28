package day1024;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
//DD에 정의하지 않고 annotation으로 처리
@WebServlet(name = "redirect_b", urlPatterns = { "/redirect_b" })
public class RedirectB extends HttpServlet {

	//2. 요청방식을 처리 할 수 있는 method Override
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. 응답방식 설정 => MIME => 접속자에게 응답할 형식
		response.setContentType("text/html;charset=UTF-8");
		//4. 출력스트림 얻기 => 접속자의 출력스트림을 얻음으로 접속자에게 응답할 수 있음
		PrintWriter out=response.getWriter();
		
		//5. 출력내용 생성
	      out.write("\r\n");
	      out.write("<!DOCTYPE html>\r\n");
	      out.write("<html>\r\n");
	      out.write("<head>\r\n");
	      out.write("<meta charset=\"UTF-8\">\r\n");
	      out.write("<title>Insert title here</title>\r\n");
	      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://211.63.89.149/servlet_prj/common/css/main_v1_220901.css\"/>\r\n");
	      out.write("<style type=\"text/css\">\r\n");
	      out.write("\r\n");
	      out.write("</style>\r\n");
	      out.write("<!-- jQuery google CDN -->\r\n");
	      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
	      out.write("<!-- Bootstrap Css -->\r\n");
	      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
	      out.write("<!-- Bootstrap Js -->\r\n");
	      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\r\n");
	      out.write("<script type=\"text/javascript\">\r\n");
	      
	      out.println("alert('"+request.getParameter("errMsg")+" 비정상적인 요청입니다');");
	      
	      out.write("</script>\r\n");
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      
	      out.print("비정상적인 요청이 발생 했을 때 응답 <br>");
	      out.print("<a href='redirect_a'>요청</a>");
	      
	      out.write("</body>\r\n");
	      out.write("</html>");

	}//doGet

}//RedirectB
