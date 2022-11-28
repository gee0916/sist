package day0722;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 부모창 => Frame
 * @author user
 */
@SuppressWarnings("serial")
public class MainWindow extends JFrame  {
	private JButton jbtnCreateDialog;
	
	public MainWindow() {
		super("Main Window");
		
		jbtnCreateDialog=new JButton("자식창 열기");
		
		JPanel jpCenter=new JPanel();
		jpCenter.add(jbtnCreateDialog);
		
		add("Center",jpCenter);
		//has a
		MainWindowEvent mwe=new MainWindowEvent(this);
		
		addWindowListener( mwe );//윈도우 이벤트
		//버튼 이벤트
		jbtnCreateDialog.addActionListener(mwe);
		
		setSize(800, 600);
		setVisible(true);
				
	}//MainWindow

	public JButton getJbtnCreateDialog() {
		return jbtnCreateDialog;
	}//getJbtnCreateDialog

	public static void main(String[] args) {
		new MainWindow();
	}//main

}//class
