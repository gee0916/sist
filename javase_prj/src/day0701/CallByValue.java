package day0701;

/**
 * 값 복사:
 * method의 매개변수가 기본형 데이처형이라면 입력되는 값은 복사되어 들어간다
 * @author user
 *
 */
public class CallByValue {
	
	public void swap(int i, int j) {
		
		int temp=0;
		temp=i;
		i=j;
		j=temp;
		System.out.println("swap method 안 i = "+i+", j = "+j);
		
	}//swap
	

	public static void main(String[] args) {

		CallByValue cbv = new CallByValue();
		int i=7;
		int j=1;
		System.out.println("swap 전 i = "+i+", j = "+j);
		cbv.swap(i,j);
		System.out.println("swap 후 i = "+i+", j = "+j);
		
	}//main

}//class
