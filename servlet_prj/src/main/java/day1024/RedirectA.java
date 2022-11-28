package day1024;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1.  HttpServlet 상속 => 내가 만든 클래스가 웹서비스 가능
@SuppressWarnings("serial")
public class RedirectA extends HttpServlet {

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
	      
	      
	      String[] errMsg= {"a요청", "b요청", "li요청"};
	      if(new Random().nextBoolean()) { //true면 비정상적인 요청
	    	 // out.println("alert('정상적인 요청이 아닙니다');");
	    	 // out.println("location.href='redirect_b'");
	    	 
	    	 // return이 업다면 아랫줄의 코드가 실행 (error 가 출력)
	    	  response.sendRedirect("redirect_b?errMsg="+ URLEncoder.encode(errMsg[new Random().nextInt(errMsg.length)],"UTF-8"));
	    	  return;
	      }//end if
	      
	      out.write("</script>\r\n");
	      out.write("</head>\r\n");
	      out.write("<body>\r\n");
	      
	      out.print("오늘은 월요일입니다.");
	      
	      out.write("</body>\r\n");
	      out.write("</html>");
		
	}//do get

}//class
