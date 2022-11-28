package day0718;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
//1.윈도우 컴포넌트 상속
@SuppressWarnings("serial")
public class UseGridLayout extends JFrame{
	
	public UseGridLayout() {
		super("GridLayout 연습");
		
		//2. 컴포넌트 생성
		JLabel jlblHobby=new JLabel("취미");
		JLabel jlblGender=new JLabel("성별");
		JCheckBox jcbHobby=new JCheckBox("등산");
		JCheckBox jcbHobby2=new JCheckBox("낚시");
		
		JRadioButton jrbGender=new JRadioButton("남자");
		JRadioButton jrbGender2=new JRadioButton("여자");
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(jrbGender);
		bg.add(jrbGender2);
		
		//배치관리자 변경
		setLayout(new GridLayout(2,3));
		
		//3. 컴포넌트 배치
		add(jlblHobby);
		add(jcbHobby);
		add(jcbHobby2);
		add(jlblGender);
		add(jrbGender);
		add(jrbGender2);

		//4. 윈도우 크기 설정
		setSize(400, 150);
		//5. 사용자에게 보여주기
		setVisible(true);
		//종료이벤트처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseGridLayout

	public static void main(String[] args) {
		new UseGridLayout();
	}//main

}//class
