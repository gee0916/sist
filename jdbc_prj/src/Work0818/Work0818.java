package Work0818;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Work0818 extends JFrame {
	
	private JButton jb;
	private JTextField jtf;
	
	public Work0818() {
		
		super("숙제");
		
		JLabel jlbl=new JLabel("이름");
		jtf=new JTextField();
		jb=new JButton("입력");
		
		setLayout(new GridLayout(1,3));
		
		add(jlbl);
		add(jtf);
		add(jb);
		
		Work0818Event uw=new Work0818Event(this);
		addWindowListener(uw);
		jb.addActionListener(uw);
		
		setSize(300,70);
		setVisible(true);
		
	}//Work0818

	public JTextField getJtf() {
		return jtf;
	}//getJtf

	public JButton getJb() {
		return jb;
	}//getJb

	public static void main(String[] args) {
		new Work0818();
	}//main

}//class
