package day0722;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Work0721Design extends JFrame {

	private JComboBox<String> jbcSubject; //디자인처리
	private DefaultComboBoxModel<String> dcbmSubject; //데이터 처리
	private JTextField jtfMsg;

	public Work0721Design() {
		
		super("숙제");
		//1.원천데이터
		String[] subject = { "Java", "Oracle", "JDBC", "HTML" };
		//2.원천데이터를 모델에 설정
		dcbmSubject=new DefaultComboBoxModel<String>(subject);
		//3.모델을 뷰에 설정한다
		jbcSubject = new JComboBox<String>(subject);

		JLabel jlblmsg = new JLabel("선택과목");
		jtfMsg = new JTextField(10);

		setLayout(null); // 배치관리자 설정은 배치하기 전 설정한다
		
		jbcSubject.setBounds(20, 35, 100, 30);
		jlblmsg.setBounds(144, 35, 100, 30);
		jtfMsg.setBounds(215, 35, 100, 30);

		add(jbcSubject);
		add(jlblmsg);
		add(jtfMsg);
		
		//이벤트 객체를 생성
		Work0721Event we=new Work0721Event(this);
		//윈도우 이벤트를 처리하기 위해 리스너에 등록
		addWindowListener(we);
		//콤보박스 이벤트를 처리하기 위해 리스너 등록
		//같은 아이템이 선택되더라도 일을 수행
//		jbcSubject.addActionListener(we);
		//같은 아이템이 선택되더라도 일을 수행하지 않는다
		jbcSubject.addItemListener(we);
		
		setSize(400, 200);
		setVisible(true);

	}// Work0721Design

	public JComboBox<String> getJbcSubject() {
		return jbcSubject;
	}//getJbcSubject
	
	public DefaultComboBoxModel<String> getDcbmSubject() {
		return dcbmSubject;
	}//getDcbmSubject

	public JTextField getJtfMsg() {
		return jtfMsg;
	}//getJtfMsg

	public static void main(String[] args) {
		new Work0721Design();
	}// main

}// class
