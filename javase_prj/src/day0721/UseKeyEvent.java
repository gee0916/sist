package day0721;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UseKeyEvent extends WindowAdapter implements KeyListener {

	private UseKeyDesign ukd;

	public UseKeyEvent(UseKeyDesign ukd) {
		this.ukd = ukd;
	}// UseKeyEvent

	@Override
	public void windowClosing(WindowEvent e) {
	}// windowClosing

	@Override
	public void keyTyped(KeyEvent ke) {
		System.out.println("keyTyped");
		// JTextField에 값 얻기
	}// keyTyped

	@Override
	public void keyPressed(KeyEvent ke) {
		System.out.println("keyPressed");
		// 눌린키 키코드 얻기
//		System.out.println("키코드"+ke.getKeyCode());
//		System.out.println("키문자"+ke.getKeyChar());
		if (ke.getKeyCode() == KeyEvent.VK_ESCAPE) {
			ukd.dispose();
		}//end if
	}// keyPressed

	@Override
	public void keyReleased(KeyEvent ke) {
		System.out.println("keyReleased");
		String text = ukd.getJtfData().getText();
		System.out.println("---" + text);

		switch(ke.getKeyCode()) {
			case KeyEvent.VK_ENTER:
				ukd.getJlblOutput().setText(text);
		}//switch
		
	}// keyReleased

}// class
