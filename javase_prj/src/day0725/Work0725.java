package day0725;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Work0725 extends JFrame {

	private JTextArea jta;
	private JMenuItem jmiNew;
	private JMenuItem jmiOpen;
	private JMenuItem jmiSave;
	private JMenuItem jmiDifferentSave;
	private JMenuItem jmiClose;
	private JMenuItem jmiFontDialog;
	private JMenuItem jmiInformation;
	
	public Work0725() {
		
		super("메모장");
		
		jta=new JTextArea();
		
		JMenuBar jmb=new JMenuBar();
		JMenu jmFile=new JMenu("파일");
		JMenu jmForm=new JMenu("서식");
		JMenu jmHelp=new JMenu("도움말");
		
		jmiNew=new JMenuItem("새 글");
		jmiOpen=new JMenuItem("열기");
		jmiSave=new JMenuItem("저장");
		jmiDifferentSave=new JMenuItem("다른 이름을 저장");
		jmiClose=new JMenuItem("닫기");
		jmiFontDialog=new JMenuItem("글꼴");
		jmiInformation=new JMenuItem("메모장 정보");
		
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.add(jmiDifferentSave);
		jmFile.add(jmiClose);
		jmForm.add(jmiFontDialog);
		jmHelp.add(jmiInformation);
		
		jmb.add(jmFile);
		jmb.add(jmForm);
		jmb.add(jmHelp);
		
		JScrollPane jsp=new JScrollPane(jta);
		
		add(jsp);
		
		Work0725Event we=new Work0725Event(this);
		addWindowListener(we);
		jmiNew.addActionListener(we);
		jmiOpen.addActionListener(we);
		jmiSave.addActionListener(we);
		jmiDifferentSave.addActionListener(we);
		jmiClose.addActionListener(we);
		jmiFontDialog.addActionListener(we);
		jmiInformation.addActionListener(we);
		
		setJMenuBar(jmb);
		setSize(800,500);
		setVisible(true);
		
	}//Work0725

	public JTextArea getJta() {
		return jta;
	}//getJta

	public JMenuItem getJmiNew() {
		return jmiNew;
	}//getJmiNew

	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}//getJmiOpen

	public JMenuItem getJmiSave() {
		return jmiSave;
	}//getJmiSave

	public JMenuItem getJmiDifferentSave() {
		return jmiDifferentSave;
	}//getJmiDifferentSave

	public JMenuItem getJmiClose() {
		return jmiClose;
	}//getJmiClose

	public JMenuItem getJmiFontDialog() {
		return jmiFontDialog;
	}//getJmiFontDialog

	public JMenuItem getJmiInformation() {
		return jmiInformation;
	}//getJmiInformation

	public static void main(String[] args) {
		new Work0725();
	}//main

}//class
