package day0718;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * 자동배치관리자와 Component의 사용
 * @author user
 */
@SuppressWarnings("serial")
//1. JFrame을 상속받는다
public class UseBorderLayout extends JFrame {

	public UseBorderLayout() {

		super("BorderLayout 연습");
		//2-1. 컴포넌트 생성
		//hungarian Notation(헝가리안 네이밍)
		//컴포넌트명+하는일로 이름을 구성할 수 있다 => 이 컴포넌트가 이런일을 하는 구나
		JButton jbtnNorth=new JButton("북쪽(North)");
		JButton jbtnEast=new JButton("동쪽(East)");
		JLabel jlblSouth=new JLabel("남쪽(South)");
		JLabel jlblWest=new JLabel("서쪽(West)");
		JTextArea jtaCenter=new JTextArea("가운데(Center)");
		
		//배치관리자 생성(기본 배치관리자가 생성된 배치관리자로 변환)
		setLayout(new BorderLayout());
		
		//2-2. 생성된 컴포넌트 배치
		//add method를 사용하는데 Overload되어있어 다양하게 사용할 수 있다
		//add("배치위치",컴포넌트);
		add("North",jbtnNorth);
		add("West",jlblWest);
		//add(컴포넌트, BorderLayout.Constant);
		add(BorderLayout.CENTER,jtaCenter);
		add(BorderLayout.SOUTH,jlblSouth);
		add(jbtnEast,BorderLayout.EAST);
		
		
		//2-3. 윈도우 크기 설정
		setSize(500,500);
		
		//2-4. 사용자에게 보여주기
		setVisible(true);
		
		//윈도우 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseBorderLayout
	
	public static void main(String[] args) {

		new UseBorderLayout();
		
	}//main

}//class
