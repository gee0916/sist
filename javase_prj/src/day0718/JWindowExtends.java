package day0718;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JWindow;

/**
 * JWindow를 상속받으면 Frame이 올라가는 빈 영역이 생성
 * JWindow는 일반 컴포넌트를 가질 수 없다
 * @author user
 */
@SuppressWarnings("serial")
//1. 윈도우 컴포넌트를 상속
public class JWindowExtends extends JWindow {

	public JWindowExtends(JFrame jfr) {
		//2. 일반 컴포넌트 생성
		JButton jbtn=new JButton("일반컴포넌트");
		// JFrame에 일반 컴포넌트를 배치
		jfr.add(jbtn);;
		//4. JFrame 크기 설정
		jfr.setSize(200,200);
		//5. JFrame 크기 설정
		jfr.setVisible(true);
		
	}//JWindowExtends
	 
	public static void main(String[] args) {

		JFrame jfr=new JFrame();
		new JWindowExtends(jfr); //JFrame과 has a 관계
		
	}//main

}//class
