package day0721;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Work0721 extends JFrame {
	
	private JComboBox<String> jcbBox;
	private JTextField jtfOutput;
	
	public Work0721() {
		
		super("사원관리");
		
		DefaultComboBoxModel<String> dcbm=new DefaultComboBoxModel<String>();
		jcbBox=new JComboBox<String>(dcbm);
		jtfOutput=new JTextField(10);
		
		dcbm.addElement("Java");
		dcbm.addElement("Oracle");
		dcbm.addElement("JDBC");
		dcbm.addElement("HTML");
		
		setLayout(new FlowLayout());
		
		Work0721Event we=new Work0721Event();
		addWindowListener(we);
		jcbBox.addItemListener(we);
		
		add(jcbBox);
		add(jtfOutput);
		
		setSize(300,150);
		setVisible(true);
		
	}//Work0721
	
	public JComboBox<String> getJcbBox() {
		return jcbBox;
	}//getJcbBox

	public JTextField getJtfOutput() {
		return jtfOutput;
	}//getJtfOutput
	
	public class Work0721Event extends WindowAdapter implements ItemListener {
		
		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
		}//windowClosing
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			String list=String.valueOf(getJcbBox().getSelectedItem());
			getJtfOutput().setText(list);
		}//itemStateChanged
		
	}//Work0721Event

	public static void main(String[] args) {
		new Work0721();
	}//main

}//class
