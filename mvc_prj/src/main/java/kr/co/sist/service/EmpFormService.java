package kr.co.sist.service;

import java.util.ArrayList;
import java.util.List;

/**
 * business logic 정의
 * @author user
 */
public class EmpFormService {

	public List<Integer> deptType() {
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		return list;
	}
	
}
