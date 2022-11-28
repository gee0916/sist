package day0629;

/**
 * instance variable의 초기화 값
 * @author user
 *
 */

public class InstanceVariable {
	
//	기본형 데이터형
	int i; //0
	char c=' '; //\u0000
	double d; //0.0
	boolean b; //false
	
//	참조형 데이터형
	int[] arr; //배열 null
	InstanceVariable iv; //class null
	String str; //String null
	
	public static void main(String[] args) {
		
//  1. 객체화 : 클래스명 객체명=new 클래스명();
	InstanceVariable iv = new InstanceVariable();
	
//	2. 사용 : 객체명.변수명
	System.out.println("기본형 데이터 형");
	System.out.println("정수형 : " + iv.i);
	System.out.println("문자형 : " + iv.c);
	System.out.println("실수형 : " + iv.d);
	System.out.println("불린형 : " + iv.b);
	System.out.println();
	System.out.println("참조형 데이터 형");
	System.out.println("배열 : " + iv.arr);
	System.out.println("class : " + iv.iv);
	System.out.println("String : " + iv.str);
	
	}//main

}//class
