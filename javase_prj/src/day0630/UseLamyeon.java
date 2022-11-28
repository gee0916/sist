package day0630;

public class UseLamyeon {

	public static void main(String[] args) {

	Lamyeon l=new Lamyeon();

	l.setColor("빨간색");
	l.setBody("봉지");
	l.setSoupBase(2);
	
	String color=l.getColor();
	System.out.println("이 라면 포장의 색깔은 "+ color + "이다");

	String body=l.getBody();
	System.out.println("이 라면은 "+ body + "라면이다");
	
	int soupBase=l.getSoupBase();
	System.out.println("내장되어 있는 라면 스프의 갯수는 "+ soupBase + "개다");
	
	System.out.println(l.eat("끓여서 먹는다"));
	
	}//main

}//class
