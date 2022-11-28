package day0714;

import java.util.StringTokenizer;

public class Work0714 {
	
	public String[] data(String strCsv) {
		
		StringTokenizer stk=new StringTokenizer(strCsv,",");
		String[] dataList=new String[stk.countTokens()];
		
				
		int i=0;
		int count=0;
		
		while (stk.hasMoreTokens()) {
			dataList[i]=stk.nextToken();
			System.out.println(dataList[i]);
			
			if(dataList[i].startsWith("J")) {
				count++;
				System.out.println(count);
			}
		}//while

		return dataList;
		
	}//data
	
	public String num(int i) {
		
		String number=Integer.toString(i);
		
		return number;
	}
	
	

}//class
