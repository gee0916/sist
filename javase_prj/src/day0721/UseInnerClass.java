package day0721;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * inner class로 Window Event 처리하기
 * @author user
 */
@SuppressWarnings("serial")
public class UseInnerClass extends JFrame {

	public UseInnerClass() {
		
		super("inner class를 사용한 이벤트 처리");
		
		
		//inner class의 객체화
		UseInnerClass.innerEvent ie=new innerEvent();
		//innerEvent를 이벤트가 발생했을 때 처리할 클래스로 설정한다
		addWindowListener(ie);
		
		setSize(400,400);
		setVisible(true);
		
	}//UseInnerClass
	
	//////////////////////inner class 시작//////////////////////////////////////

	public class innerEvent extends WindowAdapter {

		//WindowAdapter class에 일반 method를 Override
		@Override
		public void windowClosing(WindowEvent e) {
			
			System.out.println("WindowAdapter를 상속받은 inner class의 windowClosing");
			dispose(); //안쪽 클래스는 바깥클래스의 자원을 마음대로 사용할 수 있다
			
		}//windowClosing
		
	}//innerEvent class
	
	//////////////////////inner class 끝//////////////////////////////////////
	
	public static void main(String[] args) {

		new UseInnerClass();
		
	}//main

}//class
