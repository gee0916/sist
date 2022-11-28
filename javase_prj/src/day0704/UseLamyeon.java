package day0704;

public class UseLamyeon {

	public static void main(String[] args) {

	Lamyeon l=new Lamyeon();
	
	l.setName("너구리");
	
	System.out.printf("라면포장지의 색: %s, 라면의 포장방식: %s, 내장된 스프의 개수: %d \n",
			 l.getColor(), l.getBody(), l.getSoupBase());
	
	System.out.println(l.eat());
	System.out.println(l.eat(2,"끓여"));
	
	}//main

}//class
