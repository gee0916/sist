package day0722;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class EventCompare extends JFrame implements ActionListener {

	private JButton jbtn1;
	private JButton jbtn2;
	private JTextField jtf;
	
	public EventCompare() {
		super("동일한 이벤트 비교");
		
		jbtn1=new JButton("jbtn1");
		jbtn2=new JButton("jbtn2");
		jtf=new JTextField(5);
		
		System.out.println( jbtn1 );
		System.out.println( jbtn2 );
		
		JPanel jpCenter=new JPanel();
		jpCenter.add(jbtn1);
		jpCenter.add(jbtn2);
		jpCenter.add(jtf);
		
		add("Center", jpCenter);
		
		//컴포넌트에서 이벤트가 발생했을 때 JVM에서 감지할 수 있도록 리쓰너에 등록
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		jtf.addActionListener(this);
		
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//EventCompare
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//jbtn1이든 jbtn2든 ActionEvent라면 한곳으로 모여서 처리된다.
//		System.out.println("이벤트를 발생시킨 객체의 라벨 : " + ae.getActionCommand() );
//		String cmd=ae.getActionCommand(); //ActionEvent에서만 사용.
//		// jbtn1이 이벤트를 발생시키면 콘솔에 " 오늘은 금요일 입니다."
//		if( cmd.equals("jbtn1")) {
//			System.out.println(" 오늘은 금요일 입니다.");
//		}//end if
//		// jbtn2이 이벤트를 발생시키면 콘솔에 " 내일은 퇼 입니다."
//		if( cmd.equals("jbtn2")) {
//			System.out.println(" 내일은 퇼 입니다.");
//		}//end if
		// ae.getSource()는 모든 컴포넌트에서 사용하고 비교 할 수 있다.
		System.out.println( ae.getSource()==jbtn1 );
		if( ae.getSource()==jbtn1) {//이벤트를 발생시킨 객체의 주소가 jbtn1인가?
			System.out.println(" 오늘은 금요일 입니다.");
		}//end if
		
		// jbtn2이 이벤트를 발생시키면 콘솔에 " 내일은 퇼 입니다."
		if( ae.getSource()==jbtn2) {//이벤트를 발생시킨 객체의 주소가 jbtn2인가?
			System.out.println(" 내일은 퇼 입니다.");
		}//end if
		
		if( ae.getSource()==jtf) {//이벤트를 발생시킨 객체의 주소가 jtf인가?
			System.out.println(jtf.getText());
		}//end if
	}//actionPerformed

	public static void main(String[] args) {
		new EventCompare();
	}//main

}//class
