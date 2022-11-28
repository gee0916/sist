package day0718;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * JFrame과 is a 관계
 * @author user
 */
@SuppressWarnings("serial")
//1. JFrame 상속
public class JFrameExtends extends JFrame {

	public JFrameExtends() {
		//2. 일반 컴포넌트 생성
		JButton jbtn=new JButton("일반컴포넌트");
		//3. 일반 컴포넌트를 배치 
		add(jbtn);
		//4. 프레임의 크기 설정
		setSize(400,400);
		//5. 윈도우 보여주기
		setVisible(true);
		
//		윈도우 종료 이벤트 처리
//		addWindowListener(new WindowAdapter() {
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}
//			
//		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//JFrameExtends
	
	
	public static void main(String[] args) {

		new JFrameExtends(); //자식 클래스가 객체화되면 부모클래스가 먼저 생성된다
		
	}//main

}//class
