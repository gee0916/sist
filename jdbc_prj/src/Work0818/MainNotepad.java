package Work0818;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MainNotepad extends JFrame {
	private JLabel jlblName;
	private JTextField jtfName;
	private JButton jbtnNameAdd;
	public MainNotepad() {
		//사용할 컴포넌트 설정
		jlblName = new JLabel("이름");
		jtfName = new JTextField(10);
		jbtnNameAdd = new JButton("입력");
				
		JPanel jpCenter = new JPanel();
		//패널에 일반 컴포넌트를 배치
		jpCenter.add(jlblName);
		jpCenter.add(jtfName);
		jpCenter.add(jbtnNameAdd);
		
		add("Center", jpCenter);
		//배치관리자 설정
		
		///////////////////////이벤트 처리//////////////////////////
		UseStatementService uss = new UseStatementService(this);
		addWindowListener(uss);//윈도우 이벤트
		//버튼 이벤트
		jbtnNameAdd.addActionListener(uss);
		//4. 윈도우 크기설정
		setSize(300, 100);
		//5. 사용자에게 보여주기
		setVisible(true);
	}//MainNotepad
	
	public JTextField getJtfName() {
		return jtfName;
	}
	
	public JButton getJbtnNameAdd() {
		return jbtnNameAdd;
	}

	public static void main(String[] args) {
		new MainNotepad();
	}//main
}//class
