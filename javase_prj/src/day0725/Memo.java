package day0725;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Memo extends JDialog {
	
	private JButton jb;
	
	public Memo(Work0725 w) {
		
		super(w,"메모장 정보",true);
		
		JLabel jl=new JLabel("메모장 정보");
		
		JTextArea jta=new JTextArea();
		jta.append("이 메모장은 자바언어로 만들어진 메모장으로"+"\n"+"License는 PL(Public License)로"+
				"\n"+"자유롭게 배포하고 사용하실 수 있습니다"+"\n"+"작성자 정현지");
		jta.setEditable(false);
		
		jb=new JButton("닫기");
		
		JPanel jpSouth=new JPanel();
		jpSouth.add(jb);
	
		jl.setFont(new Font("",Font.BOLD,20));
		jta.setFont(new Font("",Font.PLAIN,15));
		
		add("North",jl);
		add("Center",jta);
		add("South",jpSouth);
		
		MemoEvent me=new MemoEvent(this);
		addWindowFocusListener(me);
		jb.addActionListener(me);
		
		setBounds(getX()+100,getY()+100,300,200);
		setVisible(true);
		
	}//Memo

	public JButton getJb() {
		return jb;
	}//getJb
	
}//class
