package day0722;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextArea;

public class Work0722Event extends WindowAdapter implements ActionListener {

	private Work0722 w;
	
	public Work0722Event(Work0722 w) {
		this.w=w;
	}//Work0722Event
	
	@Override
	public void windowClosing(WindowEvent e) {
		w.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JTextArea jta=w.getJta();
		
		jta.setText("");//잘하셨습니다. ( 액션이벤트가 발생하면 JTextArea를 초기화 해주는 작업이 동일하게 일어나잖아요?) 그럼 이렇게 줄이실수 있어여
		if(e.getSource()==w.getTeam1()) {
			for(int i=0; i<w.getList1().size(); i++) {
				jta.append(w.getList1().get(i)+"\n");
			}//end for
		}//end if
		
		if(e.getSource()==w.getTeam2()) {
			for(int i=0; i<w.getList2().size(); i++) {
				jta.append(w.getList2().get(i)+"\n");
			}//end for
		}//end if
		
		if(e.getSource()==w.getTeam3()) {
			for(int i=0; i<w.getList3().size(); i++) {
				jta.append(w.getList3().get(i)+"\n");
			}//end for
		}//end if
		
		if(e.getSource()==w.getClose()) {
			w.dispose();
		}//end if
		
	}//actionPerformed

}//Work0722Event
