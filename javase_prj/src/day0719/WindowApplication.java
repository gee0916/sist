package day0719;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class WindowApplication extends JFrame{
	
	public WindowApplication() {
		
		super("사원관리");
		
		JLabel num=new JLabel("번호");
		JLabel name=new JLabel("이름");
		JLabel gender=new JLabel("성별");
		JLabel email=new JLabel("이메일");
		JTextField numField=new JTextField(10);
		JTextField nameField=new JTextField(10);
		JRadioButton genderMen=new JRadioButton("남");
		JRadioButton genderWomen=new JRadioButton("여");
		JTextField emailField=new JTextField(10);
		JButton plus=new JButton("추가");
		JButton del=new JButton("삭제");
		JButton change=new JButton("변경");
		JButton close=new JButton("닫기");
		JTextArea jta=new JTextArea(50,50);
		
		setLayout(null);
		
		jta.setLineWrap(true);
		jta.setWrapStyleWord(true);
		JScrollPane jsp=new JScrollPane(jta);
		
		num.setBounds(50,50,70,30);
		name.setBounds(50,100,70,30);
		gender.setBounds(50,150,70,30);
		email.setBounds(50,200,70,30);
		numField.setBounds(130,50,100,30);
		nameField.setBounds(130,100,100,30);
		genderMen.setBounds(130,150,50,30);
		genderWomen.setBounds(180,150,50,30);
		emailField.setBounds(130,200,100,30);
		plus.setBounds(50,270,80,30);
		del.setBounds(150,270,80,30);
		change.setBounds(250,270,80,30);
		close.setBounds(350,270,80,30);
		jsp.setBounds(250,50,180,180);
		
		add(num);
		add(name);
		add(gender);
		add(email);
		add(numField);
		add(nameField);
		add(emailField);
		add(genderMen);
		add(genderWomen);
		add(plus);
		add(del);
		add(change);
		add(close);
		add(jsp);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(genderMen);
		bg.add(genderWomen);
		
		Font font=new Font("맑은 고딕", Font.BOLD,20);
		num.setFont(font);
		name.setFont(font);
		gender.setFont(font);
		email.setFont(font);
		genderMen.setFont(font);
		genderWomen.setFont(font);
		plus.setFont(font);
		del.setFont(font);
		change.setFont(font);
		close.setFont(font);
		
		TitledBorder tb=new TitledBorder("데이터");
		tb.setTitleFont(new Font("맑은 고딕",Font.PLAIN,17));
		jsp.setBorder(tb);
		
		LineBorder lb=new LineBorder(Color.BLUE);
		num.setBorder(lb);
		name.setBorder(lb);
		gender.setBorder(lb);
		email.setBorder(lb);
		
		setBounds(0,0,500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//WindowApplication

	public static void main(String[] args) {

		new WindowApplication();
		
	}//main

}//class
