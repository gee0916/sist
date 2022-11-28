package day0720;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//1. Window Component 상속받고, 이벤트를 처리할때 사용할 XxxListener를 구현한다.
@SuppressWarnings("serial")
public class TestEvent extends JFrame implements ActionListener{
	//2. 이벤트 처리와 관련있는 컴포넌트를 선언한다.
	private JButton jbtn; //클래스안에 다른 method에서 사용할 필요가 없다면 필드에 선언할 필요 없음.
	
	public TestEvent() {
		super("Event Handling 연습");
		//3.컴포넌트 생성.
		jbtn=new JButton("클릭해주세요.");
		
		//4. 리쓰너( 사용자가 컴포넌트를 클릭했는지 JVM에서 감시 )에 등록
		jbtn.addActionListener(this);
	
		//5. 배치관리자 사용

		JPanel jpCenter=new JPanel();
		jpCenter.add(jbtn);
		//6.배치
		add("Center", jpCenter);
		//7.윈도우 작업
		setBounds(100,200,400,250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//TestEvent
	
	@Override
	//abstract method를 Override하고, 이벤트가 발생했을때 제공할 코드를 작성.
	public void actionPerformed(ActionEvent ae) {
//		System.out.println("버튼 클릭하셨습니다.");
		String name=JOptionPane.showInputDialog("이름을 입력해주세요");
		String hobby=JOptionPane.showInputDialog(name+"님의 취미를 입력해주세요!");
		System.out.println( hobby );
	}//actionPerformed

	public static void main(String[] args) {
		new TestEvent();
	}//main

}//class
