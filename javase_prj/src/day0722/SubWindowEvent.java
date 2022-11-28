package day0722;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SubWindowEvent extends WindowAdapter implements ActionListener {
	private SubWindow sw;
	
	public SubWindowEvent(SubWindow sw) {
		this.sw=sw;
	}//SubWindowEvent
	
	@Override
	public void windowClosing(WindowEvent e) {
			sw.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		//뷰 창에서 액션이벤트를 발생하는 컴포넌트가 하나 이므로 객체비교를 할 필요가 없다.
		sw.dispose();
	}//actionPerformed

}//class
