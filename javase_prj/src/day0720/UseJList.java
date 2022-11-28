package day0720;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 * MVC Pattern이 도입되어 개발된 Component의 사용.
 * @author user
 */
@SuppressWarnings("serial")
//1.윈도우 컴포넌트 상속
public class UseJList extends JFrame {

	public UseJList() {
		 super("JList 사용");
		 //2. 컴포넌트 생성
		 // 데이터를 관리하는 클래스를 생성.
		 DefaultListModel<String> dlm=new DefaultListModel<String>();
		 DefaultComboBoxModel<String> dcbm=new DefaultComboBoxModel<String>();
		 
		 //데이터를 보여줄 클래스를 생성.
		 JList<String> jl=new JList<String>(dlm);
		 JComboBox<String> jcb=new JComboBox<String>(dcbm);
		 
		 //값 추가 ( Model 클래스를 사용 )
		 dlm.addElement("김강현");
		 dlm.addElement("김도희");
		 dlm.addElement("김소현");
		 dlm.addElement("김태규");
		 dlm.addElement("남상민");
		 dlm.addElement("송성우");
		 dlm.addElement("송인화");
		 
		 //DefaultComboBoxModel에 데이터를 추가
		 dcbm.addElement("유설빈");
		 dcbm.addElement("유원준");
		 dcbm.addElement("이유리");
		 dcbm.addElement("전선홍");
		 dcbm.addElement("정예은");
		 dcbm.addElement("정주은");
		 
		 //JList의 크기보다 데이터의 양이 많기 때문에 모든 데이터를 보여주기위해
		 //Container Component인 JScrollPane이 필요
		 //JList와 has a 관계로 JScrollPane 생성
		 JScrollPane jsp=new JScrollPane(jl);
		 
		 //배치관리자
		 setLayout( null );
		 
		 //크기와 좌표를 설정.
		 jsp.setBounds(10, 20, 200, 100);
		 jcb.setBounds(10, 210, 200,20);
		 
		 //배치
		 add(jsp);
		 add(jcb);
		 
		//윈도우 크기 설정
		 setBounds(100, 100, 300, 400);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseJList
	public static void main(String[] args) {
		new  UseJList();
	}//main

}//class
