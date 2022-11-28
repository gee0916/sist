package day0721;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UseAnonymousClass extends JFrame {
	
	public UseAnonymousClass() {
		
		super("anonymous inner class");
		
		//anonymous inner class로 이벤트 처리
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent we) {
				System.out.println("WindowAdapter를 상속받은 annonymous inner class의 WindosClosing");
				dispose();
			}
			
		});
		
		setSize(400,400);
		setVisible(true);
		
	}//UseAnonymousClass

	public static void main(String[] args) {

		new UseAnonymousClass();
		
	}//main

}//class
