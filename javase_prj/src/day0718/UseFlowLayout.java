package day0718;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//1. 윈도우 컴포넌트를 상속
@SuppressWarnings("serial")
public class UseFlowLayout extends JFrame {
	
	public UseFlowLayout() {
		
		 super("FlowLayout 연습");
		 //2. 컴포넌트 생성
		 JLabel jlblName=new JLabel("이름");
		 JTextField jtfName=new JTextField(10);
		 JCheckBox jcbFlag=new JCheckBox("저장");
//		 JLabel jlblSave=new JLabel("저장");
		 JButton jbtnAdd=new JButton("추가");
		 
		 //배치관리자 사용 BorderLayout => FlowLayout 변환
		 setLayout(new FlowLayout());
		 //3. 배치
		 add(jlblName);
		 add(jtfName);
		 add(jcbFlag);
//		 add(jlblSave);
		 add(jbtnAdd);
		 //4. 크기설정
		 setSize(400,400);
		 //5. 사용자에게 보여주기
		 setVisible(true);
		 
		//윈도우 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseFlowLayout

	public static void main(String[] args) {

		new UseFlowLayout();
		
	}//main

}//class
