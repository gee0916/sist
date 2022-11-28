package day0721;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class HasADesign extends JFrame{
	
	public HasADesign() {
		
		super("has a 관계로 이벤트 처리");
		
		//1. has a 관계의 클래스를 객체화
		HasAEvent hae=new HasAEvent(this);
		
		//2. 이벤트 등록
		addWindowListener(hae);
		
		setSize(500,500);
		setVisible(true);
		
	}//HasADesign

	public static void main(String[] args) {
		
		new HasADesign();

	}//main

}//class
