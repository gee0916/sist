package day0722;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 * 이벤트처리 디자인 클래스를 has a 관계로 사용
 * @author user
 */
public class Work0721Event extends WindowAdapter implements ItemListener{
	
	private Work0721Design wd;
	
	//디자인과 has a 관계 설정할 수 있는 생성자
	public Work0721Event(Work0721Design wd) {
		this.wd=wd;
	}//Work0721Event

	@Override
	public void windowClosing(WindowEvent e) {
		wd.dispose();
	}//windowClosing

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		//아이템이 변경될 때마다 동작: 같은 아이템이 다시 설정되지 않는다
		//1. 선택한 아이템의 인덱스를 View에서 얻고
		JComboBox<String> jbcSubject=wd.getJbcSubject();
		
		//2. 인덱스에 해당하는 값을 Model에 얻는다
		DefaultComboBoxModel<String> dcbmSubject=wd.getDcbmSubject();
		
		//3. JTextField에 설정
		JTextField jtfMsg=wd.getJtfMsg();
		jtfMsg.setText("아이템: "+dcbmSubject.getElementAt(jbcSubject.getSelectedIndex()));
		System.out.println(jbcSubject.getSelectedIndex());
		
	}//itemStateChanged

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		//클릭할 때마다 동작: 같은 아이템을 다시 설정
//		//1. 선택한 아이템의 인덱스를 View에서 얻고
//		JComboBox<String> jbcSubject=wd.getJbcSubject();
//		
//		//2. 인덱스에 해당하는 값을 Model에 얻는다
//		DefaultComboBoxModel<String> dcbmSubject=wd.getDcbmSubject();
//		
//		//3. JTextField에 설정
//		JTextField jtfMsg=wd.getJtfMsg();
//		jtfMsg.setText("액션: "+dcbmSubject.getElementAt(jbcSubject.getSelectedIndex()));
//		System.out.println(jbcSubject.getSelectedIndex());
//	
//	}//actionPerformed
	
}//Work0721Event
