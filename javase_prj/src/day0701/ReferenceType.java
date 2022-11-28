package day0701;

/**
 * 참조형 데이터형
 * 값은 메모리에 다른 곳(heap)에 저장되고 그 시작주소를 stack에서 가지는 데이터형
 * @author user
 */
public class ReferenceType {
	@SuppressWarnings("unused")
	private int i;
	@SuppressWarnings("unused")
	private int j;
	
	public static void main(String[] args) {

		ReferenceType rt=new ReferenceType();
		ReferenceType rt2=new ReferenceType();
		System.out.println(rt);
		System.out.println(rt2);
		
		//객체 생성
		rt=new ReferenceType();
		rt2=new ReferenceType();
		System.out.println(rt);
		System.out.println(rt2);
		
		rt.i=10;
		rt2.i=20;
		
	}//main

}//class
