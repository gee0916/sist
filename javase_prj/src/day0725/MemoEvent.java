package day0725;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MemoEvent extends WindowAdapter implements ActionListener {

	private Memo m;
	
	public MemoEvent(Memo m) {
		this.m=m;
	}//MemoEvent
	
	@Override
	public void windowClosing(WindowEvent e) {
		m.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent e) {
		m.dispose();
	}//actionPerformed

}//class
