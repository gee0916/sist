package day0719;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class TestBorder extends JFrame {

	public TestBorder() {
		super("테두리 연습");
		
		JLabel jlbl=new JLabel("라벨");
		JTextField jtf=new JTextField(10);
		JPasswordField jpf=new JPasswordField(10);
		
		JLabel jlbl2=new JLabel("라벨2");
		JTextField jtf2=new JTextField(10);
		JPasswordField jpf2=new JPasswordField(10);
		
		JPanel jp=new JPanel(); //FlowLayout
		JPanel jp2=new JPanel();
		
		setLayout(null);//수동배치
		
		jp.add(jlbl);
		jp.add(jtf);
		jp.add(jpf);
		
		jp2.add(jlbl2);
		jp2.add(jtf2);
		jp2.add(jpf2);
		
		//테두리 설정
		jp.setBorder(new LineBorder(Color.BLUE));
		
		TitledBorder tb=new TitledBorder("로그인 정보");
		tb.setTitleColor(Color.MAGENTA);
		tb.setTitleFont(new Font("궁서체",Font.PLAIN,13));
		jp2.setBorder(tb);
		
		jtf2.setBorder(new TitledBorder("아이디"));
		jpf2.setBorder(new TitledBorder("비번"));
		
		jp.setBounds(10, 20, 400, 40);
		jp2.setBounds(10, 80, 400, 60);
		
		//컨테이너 컴포넌트를 윈도우컴포넌트에 배치
		add( jp );
		add( jp2 );
		
		setBounds(100, 100, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//TestBorder
	
	public static void main(String[] args) {
		new TestBorder();
	}//main

}//class
