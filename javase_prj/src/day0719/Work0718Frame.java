package day0719;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Work0718Frame extends JFrame{

	public Work0718Frame() {
		super("숫자키패드");
		setLayout(new GridLayout(4,3));
		
		String[] keyPad= {"1","2","3","4","5","6","7","8","9","*","0","#"};
		JButton[] btnArr=new JButton[ keyPad.length ];
		
		for(int i= 0 ; i < keyPad.length ; i++) {
			btnArr[i]=new JButton( keyPad[i] );
			add( btnArr[i]);
		}//end for
		
		btnArr[4].setFont(new Font("궁서체",Font.BOLD, 20));
				
//		for(String key:keyPad) {
//			add(new JButton(key));
//		}
		
		setSize(300,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Work0718Frame();
	}
}
