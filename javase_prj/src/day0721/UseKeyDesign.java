package day0721;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseKeyDesign extends JFrame {

	//이벤트처리와 관계있는 컴포넌트 선언
	private JTextField jtfData;
	private JLabel jlblOutput;
	
	public UseKeyDesign() {
		
		super("키보드 이벤트 연습");
		
		jtfData=new JTextField();
		jlblOutput=new JLabel();
		
		
		jtfData.setBorder(new TitledBorder("입력"));
		jlblOutput.setBorder(new TitledBorder("출력"));
		
		setLayout(new GridLayout(2,1));
		
		add(jtfData);
		add(jlblOutput);
		
		//이벤트클래스를 has a 관계로 생성하고
		UseKeyEvent uke=new UseKeyEvent(this);
		
		//윈도우 이벤트에 등록
		addWindowListener(uke);
		
		//JTextField에 KeyEvent에 등록
		jtfData.addKeyListener(uke);
		
		setSize(300,300);
		
		setVisible(true);
		
	}//UseKeyDesign
	
	public JTextField getJtfData() {
		return jtfData;
	}//getJtfData


	public JLabel getJlblOutput() {
		return jlblOutput;
	}//getJlblOutput


	public static void main(String[] args) {

		new UseKeyDesign();
		
	}//main

}//class
