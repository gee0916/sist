package day0713;

public class UseWork0713 {
	
	public void password () {
		
		Work0713 w=new Work0713();
		String password=w.random(8);
		System.out.println("비밀번호: "+password);
		
	}//password
	
	public void arr () {

		int[] numArr=new int[6];

		Work0713 w=new Work0713();
		@SuppressWarnings("unused")
		int randomNumArr=w.number(numArr);
		
	}//arr

	public static void main(String[] args) {

		UseWork0713 uw=new UseWork0713();
		uw.password();
		System.out.println("------------------");
		uw.arr();
		
		
	}//main

}//class
