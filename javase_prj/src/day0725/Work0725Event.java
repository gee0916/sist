package day0725;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Work0725Event extends WindowAdapter implements ActionListener {

	private Work0725 w;
	
	public Work0725Event(Work0725 w) {
		this.w=w;
	}//Work0725Event
	
	@Override
	public void windowClosing(WindowEvent e) {
		w.dispose();
	}//windowClosing

	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		// 글 초기화
		if(ae.getSource()==w.getJmiNew()) {
			w.getJta().setText("");
		}//end if
		
		// 파일다디얼로그 열기
		if(ae.getSource()==w.getJmiOpen()) {
			FileDialog fdOpen=new FileDialog(w, "파일열기", FileDialog.LOAD);
			fdOpen.setVisible(true);
		}//end if
		
		// 파일 저장
		if(ae.getSource()==w.getJmiSave()) {
			FileDialog fdSave=new FileDialog(w, "파일저장", FileDialog.SAVE);
			fdSave.setVisible(true);
		}//end if

		// 파일 다른이름으로 저장
		if(ae.getSource()==w.getJmiDifferentSave()) {
			FileDialog fdSave=new FileDialog(w, "파일저장", FileDialog.SAVE);
			fdSave.setVisible(true);
			
			String path=fdSave.getDirectory();
			String name=fdSave.getFile();
			
		}//end if
		
		// 윈도우 종료
		if(ae.getSource()==w.getJmiClose()) {
			w.dispose();
		}//end if
		
		//글꼴 다이얼로그 열기
		if(ae.getSource()==w.getJmiFontDialog()) {
			new SubWork0725(w);
		}//end if
		
		// 메모장 정보 열기
		if(ae.getSource()==w.getJmiInformation()) {
			w.setVisible(false);
			new Memo(w);
		}//end if
		
	}//actionPerformed

}//class
