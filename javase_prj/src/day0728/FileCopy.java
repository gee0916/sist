package day0728;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class FileCopy extends JFrame {

	private JLabel jlblOutput;
	
	public FileCopy() {
		super("파일복사");
		
		JButton jbtnDialog=new JButton("복사할 파일 선택");
		jlblOutput=new JLabel("출력창");
		jlblOutput.setBorder(new TitledBorder("결과"));
		
		JPanel jpCenter=new JPanel();
		jpCenter.add(jbtnDialog);
		
		//이벤트 처리클래스를 has a 관계로 객체화
		FileCopyEvent fce=new FileCopyEvent( this );
		//버튼이 이벤트를 발생할 수 있도록 리스너에 등록
		jbtnDialog.addActionListener( fce );
		//윈도우가 이벤트를 발생할 수 있도록 리스너에 등록
		addWindowListener( fce );
		
		//배치
		add("Center", jpCenter);
		add("South", jlblOutput);
		
		setBounds(100, 100, 500, 400);
		setVisible(true);
		
	}//FileCopy
	
	public static void main(String[] args) {
		new FileCopy();
	}//main

}//class
