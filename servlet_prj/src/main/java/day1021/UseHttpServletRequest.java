package day1021;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. HttpServlet 상속
@SuppressWarnings("serial")
public class UseHttpServletRequest extends HttpServlet {

	//2. 요청을 처리할 수 있는 method Override
	public void service(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException {
		
		//3. 응답방식 설정 (접속자에게 보내줄 형실 설정 ==> HTML)
		response.setContentType("text/html;charset=UTF-8");
		
		//4. 출력 스트림 얻기
		PrintWriter out=response.getWriter();
		
	      //5.출력 내용 작성 ( HTML )
	       out.write("\r\n");
	         out.write("<!DOCTYPE html>\r\n");
	         out.write("<html>\r\n");
	         out.write("<head>\r\n");
	         out.write("<meta charset=\"UTF-8\">\r\n");
	         out.write("<title>Insert title here</title>\r\n");
	         out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://211.63.89.148/servlet_prj/common/css/main_v1_220901.css\"/>\r\n");
	         out.write("<style type=\"text/css\">\r\n");
	         out.write("\r\n");
	         out.write("</style>\r\n");
	         out.write("<!-- jQuery google CDN -->\r\n");
	         out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
	         out.write("<!-- Bootstrap Css -->\r\n");
	         out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
	         out.write("<!-- Bootstrap Js -->\r\n");
	         out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\r\n");
	         out.write("\r\n");
	         out.write("<script type=\"text/javascript\">\r\n");
	         out.write("\r\n");
	         out.write("</script>\r\n");
	         out.write("\r\n");
	         out.write("</head>\r\n");
	         out.write("<body>\r\n");
	         
	         out.println("<strong>HttpServletRequest를 사용한 접속자 정보 받기</strong>");
	         out.println("<div>");
	         
	         out.println("<ul>");
	         
	         out.print("<li><strong>요청 URL</strong> : ");
	         out.print(request.getRequestURL());
	         out.println("</li>");
	         
	         out.print("<li><strong>요청 프로토콜</strong> : ");
	         out.print(request.getProtocol());
	         out.println("</li>");
	         
	         out.print("<li><strong>요청 서버명</strong> : ");
	         out.print(request.getServerName());
	         out.println("</li>");
	         
	         out.print("<li><strong>요청 서버 포트</strong> : ");
	         out.print(request.getServerPort());
	         out.println("</li>");
	         
	         out.print("<li><strong>요청 URI</strong> : ");
	         out.print(request.getRequestURI());
	         out.println("</li>");
	         
	         out.print("<li><strong>요청 Servlet경로</strong> : ");
	         out.print(request.getServletPath());
	         out.println("</li>");
	         
	         out.print("<li><strong>요청 방식</strong> : ");
	         out.print(request.getMethod());
	         out.println("</li>");
	         
	         out.print("<li><strong>QueryString</strong> : ");
	         out.print(request.getQueryString());  //POST방식은 쿼리스트링이 없음
	         out.println("</li>");
	         
	         out.print("<li><strong>Parameter</strong> : ");
	         out.print(request.getParameter("name"));
	         out.println("</li>");
	         
	         out.print("<li><strong>ParameterValues</strong> : ");
	         String[] age=request.getParameterValues("age");
	         if(age!=null) {
	            for(String ageValue:age) {
	               out.print(ageValue);
	               out.print(" ");
	            }//end for
	         }//end if
	         out.println("</li>");
	         
	         out.print("<li><strong>접속자 IP</strong> : ");
	         out.print(request.getRemoteAddr());
	         out.println("</li>");
	         
	         out.print("<li><strong>접속자 PORT</strong> : ");
	         out.print(request.getRemotePort());
	         out.println("</li>");

	         out.println("</ul>");
	         out.println("</div>");
	         
	         out.println("<a href='use_request?name=test&age=20&age=30'>QueryString</a>");
	         out.println("<form action='use_request' method='GET'>");
	         out.println("<input type='submit' value='GET요청' class='inputBtn'>");
	         
	         out.println("</form>");
	         out.println("<form action='use_request' method='POST'>");
	         out.println("<input type='submit' value='POST요청' class='inputBtn'>");
	         out.println("</form>");
	         
	         out.write("</body>\r\n");
	         out.write("</html>");
	      
	   }//service
	   
	   
	}//class