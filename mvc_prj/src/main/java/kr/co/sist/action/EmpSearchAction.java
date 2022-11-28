package kr.co.sist.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.service.EmpSearchService;
import kr.co.sist.vo.EmpVO;
import kr.co.sist.vo.SearchDataVO;

/**
 * cmd=S0001일때 사용되는 Action
 * 사원정보를 조회하는 일 
 * @author user
 */
public class EmpSearchAction implements Action {

	private boolean forwardFlag;
	private String url;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		//현재 페이지를 받는다.
		String paramCurrentPage=request.getParameter("current_page");
		//검색키워드, 컬럼
		String fieldName=request.getParameter("fieldName");
		String keyword=request.getParameter("keyword");
		
		if(paramCurrentPage==null) {//최초호출
			paramCurrentPage="1";
		}//end if
	
		int currentPage=Integer.parseInt(paramCurrentPage);
		
		SearchDataVO sdVO=new SearchDataVO();
		if(keyword!=null && !"".equals(keyword)) {
			
			if("1".equals(fieldName)) {
				fieldName="ename";
			}//end if
			if("2".equals(fieldName)) {
				fieldName="deptno";
			}//end if
			if("3".equals(fieldName)) {
				fieldName="mgr";
			}//end if
			
			sdVO.setFieldName(fieldName);
			sdVO.setKeyword(keyword);
		}
		
		EmpSearchService ess=new EmpSearchService(); //업무로직을 처리
		int totalCount=ess.totalCount(sdVO);
		int pageScale=ess.pageScale();
		int totalPage=ess.totalPage(totalCount, pageScale);
		int startNum=ess.startNum(currentPage, pageScale);
		int endNum=ess.endNum(startNum, pageScale);
		
		sdVO.setStartNum(startNum);
		sdVO.setEndNum(endNum);
		

		
		List<EmpVO> empList=ess.searchEmp(sdVO);
		
		//JSP에서 사용할 값을 scope 객체 설정
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("totalCount", totalCount);
		request.setAttribute("pageScale", pageScale);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("startNum", startNum);
		request.setAttribute("endNum", endNum);
		
		request.setAttribute("dataSize", empList.size());
		request.setAttribute("dataResult", empList.isEmpty());
		request.setAttribute("dataList", empList);
		
		forwardFlag=true;
		url="emp/emp_list.jsp";
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
