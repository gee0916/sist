package day0719;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. Window Component 상속
public class MultiLayout extends JFrame {
	
	public MultiLayout() {
		super("여러개의 복합 레이아웃");//타이틀바에 메시지 설정
		//2. 사용할 컴포넌트를 생성.
		JLabel jlblName=new JLabel("이름");
		JTextField jtfName=new JTextField(10);
		JButton jbtnNameAdd=new JButton("추가");
		
		JTextArea jtaNameDisplay=new JTextArea();
		
		//색설정 ( Non-Visual Component)
		//글자색(전경색)
		jlblName.setForeground(Color.BLUE);
		Color c=new Color(0x1DDB16);
		jtfName.setForeground( c );
		jbtnNameAdd.setForeground( c );
		
		//바닥색
		//라벨은 투명도가 설정되어있어 어디에 올라가든 바닥색이 보여진다.
		jlblName.setOpaque(true);//불투명도를 true로 설정한 후 
		//바닥색을 설정한다. 
		jlblName.setBackground(new Color(0xF15F5F));
		
		jtfName.setBackground(new Color(0xF15F5F));
		jtaNameDisplay.setBackground(new Color(0xFCEBAF));
		
		//글꼴
		jbtnNameAdd.setFont(new Font("휴먼편지체", Font.BOLD,15));
		
		Font f=new Font("MD개성체",Font.ITALIC, 20);
		jtaNameDisplay.setFont(f);
		jlblName.setFont(f);
		
		
		//여러개의 컴포넌트를 배치하기위해 Container 컴포넌트를 생성.
		JPanel jpNorth=new JPanel();// FlowLayout 기본
		//패널에 일반 컴포넌트를 배치
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnNameAdd);
		
		//배치관리자 설정
		setLayout(new BorderLayout());
		
		//3. 배치
//		add("North",jlblName);// 하나의 영역에는 하나의 컴포넌트만 배치된다. 
//		add("North",jtfName);
//		add("North",jbtnNameAdd);
		add("North", jpNorth);// 여러개의 컴포넌트를 가진 JPanel을 배치
		
		add("Center",jtaNameDisplay);
		
		//4.윈도우 크기설정
		setSize(400,300);
		//5.사용자에게 보여주기
		setVisible(true);
		
		//윈도우 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//MultiLayout
	
	public static void main(String[] args) {
		new MultiLayout();
	}//main

}//class
