package day0721;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Work0720 extends JFrame implements ActionListener {
	
	// 이벤트 처리와 관련있는 컴포넌트를 선언 
	// (생성자안에서 생성된 컴포넌트를 actionPerformed method안에서 사용하기 위해) 
	
	private JTextField jtfName;
	private JPasswordField jpfAge;
	private JTextArea jta;
	
	// 생성자 선언
	public Work0720() {
		super("Event Handling 연습");

		JLabel name = new JLabel("이름");
		JLabel age = new JLabel("나이");

		jtfName = new JTextField(8);
		jpfAge = new JPasswordField(8);

		JButton add = new JButton("추가");
		jta = new JTextArea();
		jta.setText("이름\t나이");
		
		// JTextArea 스크롤 설정하기
		JScrollPane jsp = new JScrollPane(jta);

		// 리쓰너 생성
		add.addActionListener(this);
		// JPasswordfield 반향문자 설정
		jpfAge.setEchoChar('*');

		// 컴포넌트의 배치위치,크기 설정
		name.setBounds(25, 31, 60, 60);
		jtfName.setBounds(52, 53, 100, 20);
		age.setBounds(159, 31, 60, 60);
		jpfAge.setBounds(190, 53, 100, 20);
		add.setBounds(320, 53, 80, 20);
		jsp.setBounds(25, 80, 380, 178);

		// 배치
		add(name);
		add(jtfName);
		add(age);
		add(jpfAge);
		add(add);
		add(jsp);
		
		// 배치 관리자
		setLayout(null);

		// 윈도우 크기 설정
		setSize(450, 350);

		// 보여주는거
		setVisible(true);

		// 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}//Work0720
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//JButton에서 이벤트가 발생하면 
		//JTextField(이름), JPasswordField(나이)에 입력된 값을 받아와서
		//JTextArea에 설정한다
		
		//입력데이터를 얻어와서
		String name=jtfName.getText();
//		String age=jpfAge.getText(); //비추천 method
//		String age=new String(jpfAge.getPassword());
		String age=String.valueOf(jpfAge.getPassword());
		
		//텍스트에어리어에 추가
//		jta.append("\n"+name+"\t"+age);
		if(!(name.isEmpty()||age.isEmpty())) {
			StringBuilder sb=new StringBuilder();
			sb.append("\n").append(name).append("\t").append(age);
			jta.append(sb.toString());
		}
		
		//다음 입력을 편하게 하기 위해 jtfName과 jpfAge의 값을 삭제해야한다. (초기화)
		
		if(!(name.isEmpty()&&age.isEmpty())) {
			jtfName.setText("");
			jpfAge.setText("");
		}
		
	}//actionPerformed

	public static void main(String[] args) {
		new Work0720();
	}// main


}// class
