package day0721;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
//1. WindoeListener를 구현
public class UseWindowListener extends JFrame implements WindowListener {

	public UseWindowListener() {
		
		super("윈도우 이벤트 연습");
		
		//윈도우 이벤트를 등록
		addWindowListener(this);
		
		new Work0720();
		
		setBounds(500,0,400,300);
		setVisible(true);
		
	}//UseWindowListener
	
//	추상method를 Override
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}//windowOpened
	
	@Override
	public void windowClosing(WindowEvent e) {
		//윈도우가 종료 중일때 처리해야할 일 정의
		System.out.println("windowClosing");
		dispose();//windowClosed 현재 윈도우만 종료
		System.exit(0); //실행중인 JVM의 모든 인스턴스를 강제종료
	}//windowClosing
	
	@Override
	public void windowClosed(WindowEvent e) {
		//윈도우가 온전히 종료되었을때 처리해야할 일
		System.out.println("windowClosed");
	}//windowClosed
	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}//windowIconified
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}//windowDeiconified
	
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}//windowActivated
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}//windowDeactivated
	
	public static void main(String[] args) {
		
		new UseWindowListener();

	}//main

}//class
