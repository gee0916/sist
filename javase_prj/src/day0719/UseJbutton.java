package day0719;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
//1. 윈도우컴포넌트 상속
public class UseJbutton extends JFrame {
	
	public UseJbutton() {
		super("JButton 사용");
		//2.컴포넌트 생성.
		//이미지 아이콘은 절대경로로 사용.
		ImageIcon ii=new ImageIcon("E:/dev/workspace/javase_prj/src/day0719/images/img1.png");
		ImageIcon ii2=new ImageIcon("E:/dev/workspace/javase_prj/src/day0719/images/img2.png");
		ImageIcon ii3=new ImageIcon("E:/dev/workspace/javase_prj/src/day0719/images/img3.png");
		ImageIcon ii4=new ImageIcon("E:/dev/workspace/javase_prj/src/day0719/images/img4.png");
		
		JButton jbtn=new  JButton("라이언",ii);
		JButton jbtn2=new  JButton("무지",ii2);
		JButton jbtn3=new  JButton("어피치",ii3);
		
		Font font=new Font("맑은 고딕", Font.BOLD, 15);
		jbtn.setFont(font);
		jbtn2.setFont(font);
		jbtn3.setFont(font);
		
		//텍스트의 위치변경.
		///수직위치
		jbtn.setVerticalTextPosition(JButton.TOP);
		jbtn2.setVerticalTextPosition(JButton.BOTTOM);
		jbtn3.setVerticalTextPosition(JButton.BOTTOM);
	
		//수평위치
		jbtn3.setHorizontalTextPosition(JButton.LEFT);
		
		//풍선 도움말
		jbtn.setToolTipText("사자를 모티브로 한 라이언");
		
		//롤오버 : 마우스 포인터가 올라갔을 때 이미지를 변경하는 것.
		jbtn3.setRolloverIcon(ii4);
		
		//레이아웃 변경
		setLayout(new GridLayout(1, 3));
		
		//3.배치
		add( jbtn );
		add( jbtn2 );
		add( jbtn3 );

		//4.윈도우 크기 설정
		setSize(800, 300);
		//5.가시화
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJbutton

	public static void main(String[] args) {
		new UseJbutton();
	}//main

}//class
