package Work0818;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Work0818Event extends WindowAdapter implements ActionListener {
	
	private Work0818 w;
	private String name;
	
	public Work0818Event(Work0818 w) {
		this.w=w;
	}//UseWork0818

	@Override
	public void windowClosing(WindowEvent e) {
		w.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==w.getJb()) {
			addWorkJdbc();
			w.getJtf().setText(null); //초기화
		}//end if
		
	}//actionPerformed
	
	public void addWorkJdbc() throws NullPointerException{
		
		Work0818DAO wd=new Work0818DAO();
		name=w.getJtf().getText().trim();
		
		int errorCode=0;

		if (name.isEmpty()) {
			JOptionPane.showMessageDialog(w, "이름을 입력해주세요.");
			return;
		}//end if
		
		try {
			wd.insertWorkJdbc(name);
			JOptionPane.showMessageDialog(w, "입력하신 이름 "+name+"(이)가 등록되었습니다.");
		
		}catch (SQLException se) {
			errorCode=se.getErrorCode();
			se.printStackTrace();
			
			if(errorCode==12899) {
				JOptionPane.showMessageDialog(w, "입력가능한 글자 수를 초과하셨습니다.\n한글로 10자, 영어로 30자까지 입력하실 수 있습니다.");
			}//end if
			
		}//end catch
		
	}//addWorkJdbc

}//Work0818Event
