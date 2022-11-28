package day0718;

import javax.swing.JFrame;
import javax.swing.JWindow;

/**
 * JWindow를 상속받은 클래스
 * @author user
 */
//public class UseJWindow extends JWindow
@SuppressWarnings({ "unused", "serial" })
public class UseJWindow extends JFrame {
	
	public UseJWindow() {

		// JWindow를 상속받으면 컴포넌트를 배치하고 보여줄 수 있는 JFrame 별도로 생성해야 한다.
//		JFrame jf=new JFrame();
//		add(jf);
		//JFrame을 상속받으면 Window가 자동생성되므로 윈도우를 생성할 수 있는 코드가 줄어든다
		setSize(300,300); //윈도우 크기설정
		setVisible(true); //사용자에게 보여주기
		
	}//UseJWindow

	public static void main(String[] args) {

		new UseJWindow();
		
	}//main

}//class
