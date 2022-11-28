package day0725;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SubWork0725Event extends WindowAdapter implements ActionListener, ListSelectionListener {
	
	private SubWork0725 sw;
	
	public SubWork0725Event(SubWork0725 sw) {
		this.sw=sw;
	}//SubWork0725Event
	
	@Override
	public void windowClosing(WindowEvent e) {
		sw.dispose();
	}//windowClosing

	@Override
	public void valueChanged(ListSelectionEvent ie) {

	
		if(ie.getSource()==sw.getListFont()) {
			sw.getJtfFont().setText(sw.getDlmFont().getElementAt(sw.getListFont().getSelectedIndex()));
//			fontSet();
		}//end if 
		
		if(ie.getSource()==sw.getListStyle()) {
			sw.getJtfStyle().setText(sw.getDlmStyle().getElementAt(sw.getListStyle().getSelectedIndex()));
//			fontSet();

		}//end if 
		
		if(ie.getSource()==sw.getListSize()) {
			sw.getJtfSize().setText(sw.getDlmSize().getElementAt(sw.getListSize().getSelectedIndex()));
//			fontSet();
			
		}//end if 
		
		try {
			sw.getJlblView().setFont(new Font((String)(sw.getListFont().getSelectedValue()),
					sw.getListStyle().getSelectedIndex(),Integer.parseInt((String)(sw.getListSize().getSelectedValue()))));
		} catch (Exception e) {
		}//end catch
		
		
	}//itemStateChanged
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sw.getJbOkay()) {
			jtaFontSet();
		}//end id
		
		//취소 버튼 클릭시 종료
		if(e.getSource()==sw.getJbCancel()) {
			sw.dispose();
		}//end if
		
	}//actionPerformed
	
	public void jtaFontSet() {
		
		sw.getW().getJta().setFont(sw.getJlblView().getFont());
		sw.dispose();
		
	}//jtaFontSet
	

}//class
