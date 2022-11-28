package day0720;

import java.awt.Font;
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

	JTextField nameField;
	JPasswordField ageField;
	JTextArea print;
	
	public Work0720() {
		
		super("Event Handling 연습");
		
		JLabel name=new JLabel("이름");
		JLabel age=new JLabel("나이");
		nameField=new JTextField();
		ageField=new JPasswordField();
		JButton plus=new JButton("추가");
		print=new JTextArea();
		
		setLayout(null);
		
		JScrollPane jsp=new JScrollPane(print);
		
		plus.addActionListener(this);

		name.setBounds(50,50,70,30);
		nameField.setBounds(90,50,70,30);
		age.setBounds(170,50,70,30);
		ageField.setBounds(210,50,70,30);
		plus.setBounds(300,50,70,30);
		jsp.setBounds(50,100,325,200);
		
		add(name);
		add(nameField);
		add(age);
		add(ageField);
		add(plus);
		add(jsp);
		
		Font font=new Font("맑은 고딕", Font.PLAIN,17);
		name.setFont(font);
		age.setFont(font);
		plus.setFont(font);
		nameField.setFont(font);
		ageField.setFont(font);
		print.setFont(font);
		
		setBounds(0,0,450,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//Work0720
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nameText=nameField.getText();
		String ageText=String.valueOf(ageField.getPassword());
		char num='\u0000';
		
		
		
		if(!(nameText.isEmpty()||ageText.isEmpty())) {
			for(int i=0; i<ageText.length(); i++) {
				num=ageText.charAt(i);
				if(!('0'<=num&&num<='9')) {
					System.out.println("[나이] 입력란에 숫자를 입력하세요");
					return;
				}
			}
			print.append("이름: "+nameText+"\t나이: "+ageText+"\n");
		}else {
			return;
		}//end if
		
	}//actionPerformed

	public static void main(String[] args) {

		new Work0720();
		
	}//main


}//class
