package day0725;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Work0722Design extends JFrame {
	
	private JButton jbtnOne;
	private JButton jbtnTwo;
	private JButton jbtnThree;
	private JButton jbtnClose;
	
	private JTextArea jta;
	
	public Work0722Design() {
		
		//버튼 생성
		jbtnOne=new JButton("1조");
		jbtnTwo=new JButton("2조");
		jbtnThree=new JButton("3조");
		jbtnClose=new JButton("종료");
		
		jta=new JTextArea(80,80);
		
		JPanel jpNorth=new JPanel();
		jpNorth.add(jbtnOne);
		jpNorth.add(jbtnTwo);
		jpNorth.add(jbtnThree);
		jpNorth.add(jbtnClose);
		
		
		//배치
		add("North",jpNorth);
		add("Center",jta);
		
		//이벤트객체 생성
		Work0722Event we = new Work0722Event(this);
		//리스너에 등록
		addWindowListener(we);
		jbtnOne.addActionListener(we);
		jbtnTwo.addActionListener(we);
		jbtnThree.addActionListener(we);
		jbtnClose.addActionListener(we);
		
		setSize(400,300);
		setVisible(true);
		
	}//Work0722
	
	public JTextArea getJta() {
		return jta;
	}

	public JButton getJbtnOne() { 
		return jbtnOne;
	}

	public JButton getJbtnTwo() {
		return jbtnTwo;
	}

	public JButton getJbtnThree() {
		return jbtnThree;
	}

	public JButton getJbtnClose() {
		return jbtnClose;
	}

	public static void main(String[] args) {
		new Work0722Design();
	}//main
}//class
