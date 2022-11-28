package kr.co.sist.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.sist.dao.EmpDAO;
import kr.co.sist.vo.EmpVO;
import kr.co.sist.vo.SearchDataVO;

/**
 * 업무로직 처리
 * 단순처리
 * DB처리
 * @author user
 */
public class EmpSearchService {

	/**
	 * 전체 게시물의 수
	 * @return
	 */
	public int totalCount(SearchDataVO sdVO) {
		int totalCount=0;
		EmpDAO eDAO=EmpDAO.getInstance();
		
		try {
			totalCount=eDAO.totalCount(sdVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return totalCount;
	}
	
	public int pageScale() {
		int pageScale=10;
		return pageScale;
	}
	
	
	/**
	 * 한 화면에 10개씩 보여줄 때 총 페이지 수
	 * @param totalCount - 총 게시물의 수
	 * @param pageScale - 한 화면에 보여줄 게시물의 수
	 * @return
	 */
	public int totalPage(int totalCount, int pageScale) {
		int totalPage=0;
		
	/*	if(totalCount % pageScale !=0) {
			totalPage = (totalCount/pageScale) + 1;
		}else {
			totalPage = totalCount/pageScale;
			
		} */
		
	/*	totalPage = totalCount/pageScale;
		if(totalCount % pageScale !=0) {
			totalPage++;
		} */
		
		totalPage=(int)Math.ceil( (double)totalCount/pageScale);
		
		
		return totalPage;
	}//totalPage
	
	/**
	 * 현재 페이지 별로 시작 번호는 변경
	 * 1 => 1, 2 => 11, 3=> 21, 4 =>31
	 * @param currentPage 현재페이지 번호
	 * @return
	 */
	public int startNum(int currentPage, int pageScale) {
		int startNum=1;
		
		if(currentPage<1) {
			currentPage=1;
		}//end if
		
		startNum=currentPage*pageScale-pageScale+1;
		
		return startNum;
	}
	
	/**
	 * @param startNum
	 * @param pageScale
	 * @return
	 */
	public int endNum (int startNum, int pageScale) {
		int endNum=startNum+pageScale-1;
		return endNum;
	}
	
	public List<EmpVO> searchEmp(SearchDataVO sdVO) {
		List<EmpVO> list=null;
		
		EmpDAO eDAO=EmpDAO.getInstance();
		
		try {
			list=eDAO.selectEmp(sdVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
}
