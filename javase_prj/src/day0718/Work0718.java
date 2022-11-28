package day0718;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Work0718 extends JFrame{

	public Work0718() {

		super("키패드");
		
		JButton[] j=new JButton[12];
		String[] number={"1","2","3","4","5","6","7","8","9","*","0","#"};
		
		for(int i=0; i<j.length; i++) {
			j[i]=new JButton(number[i]);
			add(j[i]);
		}//end for
		
		setLayout(new GridLayout(4,3));

		setSize(250, 350);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//Work0718
	
	
	public static void main(String[] args) {

		new Work0718();
		
	}//main

}//class
