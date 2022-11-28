package day0715;

public class UseWork0714 {

	public void useCsvProcess() {
		
		Work0714 w=new Work0714();
		String data="Java,Oracle,JDBC,HTML,CSS,JavaScript,Servlet,JSP";
		
		String[] returnData=w.csvProcess(data);
		
		String[] listStyle= {"-","*"};
		int cntJ=0;
		for(int i=0; i<returnData.length; i++) {
			if(returnData[i].startsWith("J")) {
				cntJ++;
			}//end if
			System.out.println(listStyle[i%2]+""+returnData[i]);
		}//end for
		
		System.out.println("--------------");
		System.out.println("J로 시작하는 과목 수: "+cntJ);
		
	}//useCsvProcess
	
	public void useDateProcess() {
		
		Work0714 w=new Work0714();
		int nationCode=-1;
		String nationDate=w.dateProcess(nationCode);
		System.out.println(nationDate);
		
	}//useDateProcess
	
	
	public static void main(String[] args) {

		UseWork0714 uw=new UseWork0714();
		uw.useCsvProcess();
		System.out.println("-----------------");
		uw.useDateProcess();
		
	}//main

}//class
