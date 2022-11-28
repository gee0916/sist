package day0722;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJOptionPane extends JFrame implements ActionListener {

	private JButton jbtnInput;
	private JButton jbtnMessage;
	private JButton jbtnConfirm;
	private JLabel jlblOutput;
	
	public UseJOptionPane() {
		super("다이얼로그 사용");
		
		jbtnInput=new JButton("입력");
		jbtnMessage=new JButton("메시지");
		jbtnConfirm=new JButton("컨펌");
		jlblOutput=new JLabel("출력창");
		jlblOutput.setBorder(new TitledBorder("출력창"));
		
		//컨테이너 컴포넌트에 일반 컴포넌트 배치
		JPanel jpCenter=new JPanel();
		jpCenter.add( jbtnInput );
		jpCenter.add( jbtnMessage );
		jpCenter.add( jbtnConfirm );
		
		//윈도우 컴포넌트에 컨테이너 컴포넌트와 일반 컴포넌트 배치
		add("Center", jpCenter);
		add("South", jlblOutput);
		
		//이벤트 등록
		jbtnInput.addActionListener(this);
		jbtnMessage.addActionListener(this);
		jbtnConfirm.addActionListener(this);
		
		setBounds(100, 100, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseJOptionPane
	
	public void useInputDialog() {
		String name=JOptionPane.showInputDialog(this,"당신의 이름을 입력해주세요.","홍길동",JOptionPane.PLAIN_MESSAGE);
		jlblOutput.setText("입력된 이름 : " + name);
	}//useInputDialog
	
	public void useMessageDialog() {
//		JOptionPane.showMessageDialog(this, "오늘은 금요일 입니다.");
		JOptionPane.showMessageDialog(this, "오늘은 금요일 입니다.","오늘의 요일",JOptionPane.ERROR_MESSAGE);
		
	}//useMessageDialog
	
	public void useConfirmDialog() {
	//	int flag=JOptionPane.showConfirmDialog(this, "오늘은 불금입니까?");
		int flag=JOptionPane.showConfirmDialog(this, "오늘은 불금입니까?","화르륵화르륵",
				JOptionPane.YES_NO_CANCEL_OPTION );
		//JOptionPane.DEFAULT_OPTION, JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION or JOptionPane.OK_CANCEL_OPTION
//		jlblOutput.setText( String.valueOf( flag ) );
		
		switch ( flag ) {
		case JOptionPane.OK_OPTION:
			JOptionPane.showMessageDialog(this, "화상에 유의하세요~");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(this, "편안한 주말 되세요");
			break;
		default:
			JOptionPane.showMessageDialog(this, "취소를 누르셨습니다.");
			break;
		}
	}//useConfirmDialog
	
	@Override
	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource()== jbtnInput) {//입력 버튼 이 눌렸을 때
			useInputDialog();
		}//end if
		
		if(ae.getSource()== jbtnMessage) {//메시지 버튼이 눌렸을 때
			useMessageDialog();
		}//end if
		
		if(ae.getSource()== jbtnConfirm) {//컨펌 버튼이 눌렸을 때
			useConfirmDialog();
		}//end if
		
	}//actionPerformed

	public static void main(String[] args) {
		new UseJOptionPane();
	}//main

}//class
