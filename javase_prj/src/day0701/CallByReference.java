package day0701;

/**
 * method의 매개변수가 참조형 데이터 형으로 되어있다면 객체의 주소는 하나이므로
 * 하나의 주소가 전달된다
 * @author user
 */
public class CallByReference {

	int i;
	int j;
	
	public void swap(CallByReference cbr) {
		int temp=0;
		temp=i;
		cbr.i=cbr.j;
		cbr.j=temp;
		System.out.println("swap method 내 i = "+cbr.i+", j = "+cbr.j);
	}//swap
	
	public static void main(String[] args) {

		CallByReference cbr=new CallByReference();
		cbr.i=7;
		cbr.j=1;
		System.out.println("swap method 전 i = "+cbr.i+", j = "+cbr.j);
		cbr.swap(cbr);
		System.out.println("swap method 후 i = "+cbr.i+", j = "+cbr.j);

		
		
		
	}//main

}//class
