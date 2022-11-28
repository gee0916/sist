package day0725;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class TestMenu extends JFrame implements ActionListener{
	
	private JMenuItem jmiOpen;
	private JMenuItem jmiSave;
	private JMenuItem jmiFont;
	
	public TestMenu() {
		super("메뉴연습");
		
		//1. 메뉴바를 생성
		JMenuBar jmb=new JMenuBar();
		
		//2. 메뉴생성
		JMenu jmFile=new JMenu("파일");
		JMenu jmEdit=new JMenu("편집");
		
		//3. 메뉴아이템 생성
		jmiOpen=new JMenuItem("열기");
		jmiSave=new JMenuItem("저장");
		
		jmiFont=new JMenuItem("글꼴");
		
		//메뉴아이템을 메뉴에 배치
		jmFile.add(jmiOpen);
		//메뉴아이템을 구분하기위해  구분선 (Separator)을 설정할 수 있다.
		jmFile.addSeparator();
		jmFile.add(jmiSave);
		
		jmEdit.add(jmiFont);
		
		//메뉴를 메뉴바에 배치
		jmb.add( jmFile );
		jmb.add( jmEdit );

		//메뉴바를 Frame 배치
		setJMenuBar(jmb);
		
		
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		
		setBounds(100, 100, 600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//TestMenu

	@Override
	public void actionPerformed(ActionEvent ae) {
		if( ae.getSource() == jmiOpen) {
		//파일다이얼로그를 열기모드로 제공	
		}//end if
		
		if( ae.getSource() == jmiSave) {
			//파일다이얼로그를 저장모드로 제공	
			
		}//end if
	}//actionPerformed
	
	public static void main(String[] args) {
		new TestMenu();
	}//main


}//class
