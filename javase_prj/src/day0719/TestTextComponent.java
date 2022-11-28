package day0719;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1.윈도우 컴포넌트 상속
public class TestTextComponent extends JFrame {

	public TestTextComponent() {
		super("텍스트 컴포넌트");
		//2. 컴포넌트를 생성
		JTextField jtf=new JTextField(10);//한글,영어,숫자,특문를 한줄로 입력.
		JPasswordField jpf=new JPasswordField(10);//영어,숫자,특문를 한줄로 입력.
		JTextArea jta=new JTextArea(15,40);//한글,영어,숫자,특문를 여러 줄로 입력. 스크롤바가 없음. 
		
		//JPasswordField에 반향문자 설정.
		jpf.setEchoChar('*');
		
		//자동 줄바꿈
		jta.setLineWrap(true);
		//단어 보호 (띄어쓰기로 구분)
		jta.setWrapStyleWord(true);
		
		//스크롤바만 존재하는 객체 JScrollPane 을 스크롤 바가 필요한 객체인
		//JTextArea와 has a 관계 설정.
		JScrollPane jsp=new JScrollPane( jta );
		
		//배치관리자 설정
		setLayout(new FlowLayout());//BorderLayout -> FlowLayout
		
		//3.배치
		add( jtf );
		add( jpf );
		add( jsp );
		
		//4. 윈도우 크기 설정
		setBounds(100, 100, 800, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//TestTextComponent
	
	public static void main(String[] args) {
		new TestTextComponent();
	}//main

}//class
