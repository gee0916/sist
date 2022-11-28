package day0719;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
//1. Window Component 상속
public class ManualLayout extends JFrame {

	public ManualLayout() {
		super("수동배치");
		
		//2. 컴포넌트 생성
		JButton jbtn=new JButton("버튼 1");
		JButton jbtn2=new JButton("버튼 2");
		JButton jbtn3=new JButton("버튼 3");
		
		//배치관리자 해제
		setLayout( null );
		
		//3. 컴포넌트 배치위치 설정
		jbtn.setLocation(20, 40);
		jbtn2.setLocation(200, 150);
//		jbtn3.setLocation(300, 350);
		//4. 컴포넌트 크기 설정
		jbtn.setSize(80, 30);
		jbtn2.setSize(180, 60);
//		jbtn3.setSize(200, 80);
		
		//3+4 동시에)
		jbtn3.setBounds(300, 350, 200, 80);// 프레임의 좌상단이 시작점
		
		//5. 배치
		add(jbtn);
		add(jbtn2);
		add(jbtn3);
		
		//6.윈도우 크기 설정. setBounds(x,y,w,h)
//		setSize(600,600);
		setBounds(100, 200, 600, 600);//모니터의 좌상단이 시작점
		//7.가시화
		setVisible(true);
		
		//종료처리
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
	}//ManualLayout
	
	public static void main(String[] args) {
		new ManualLayout();
	}//main

}//class
