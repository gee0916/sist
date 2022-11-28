package kr.co.sist.service;

import java.sql.SQLException;

import kr.co.sist.dao.EmpDAO;
import kr.co.sist.vo.EmpVO;

public class EmpProcessService {

	public boolean chkRange(int num) {
		return num > 0 && num < 10000;
	}
	
	public boolean addEmp(EmpVO eVO) {
		boolean flag=false;
		
		//서비스에서 DB업무를 처리
		EmpDAO eDAO=EmpDAO.getInstance();
		
		try {
			eDAO.insertEmp(eVO);
			flag=true; //성공한 작업임을 설정한다.
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
}
