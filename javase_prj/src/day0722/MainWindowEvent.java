package day0722;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindowEvent extends WindowAdapter implements ActionListener {
	private MainWindow mw;
	
	public MainWindowEvent(MainWindow mw) {
		this.mw=mw;
	}//MainWindowEvent
	
	@Override
	public void windowClosing(WindowEvent we) {
		mw.dispose();
	}//windowClosing
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//버튼이 눌렸다면 자식윈도우를 실행한다. 
		//이벤트를 발생시킨 객체가 jbtnCreateDialog 인지 비교하는 코드를 작성.
		if(ae.getSource() ==mw.getJbtnCreateDialog()) {
			//다이얼로그를 실행한다. 
			new SubWindow(mw);
		}//end if
	}//actionPerformed

}//class
