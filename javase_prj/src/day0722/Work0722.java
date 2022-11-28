package day0722;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Work0722 extends JFrame {

	private JButton team1;
	private JButton team2;
	private JButton team3;
	private JButton close;
	private JTextArea jta;
	
	List<String> list1;
	List<String> list2;
	List<String> list3;
	
	public Work0722() {
		
		super("0722숙제");
		
		String[] team1List={"차승주","정주은","홍아함","정현지","이유리","송성우"};
		String[] team2List={"최정민","김강현","정선홍","정예은","하지윤","유원준"};
		String[] team3List={"유설빈","남상민","홍다영","송인화","김태규","김소현", "김도희"};
		list1=new ArrayList<String>(Arrays.asList(team1List));
		list2=new ArrayList<String>(Arrays.asList(team2List));
		list3=new ArrayList<String>(Arrays.asList(team3List));

		team1=new JButton("1조");
		team2=new JButton("2조");
		team3=new JButton("3조");
		close=new JButton("종료");
		jta=new JTextArea();
		
		JScrollPane jsp=new JScrollPane(jta);
		JPanel jpNorth=new JPanel();
		
		jpNorth.add(team1);
		jpNorth.add(team2);
		jpNorth.add(team3);
		jpNorth.add(close);
		
		add("North",jpNorth);
		add("Center",jsp);
		
		jta.setFont(new Font("맑은 고딕",Font.PLAIN,17));
		
		Work0722Event we=new Work0722Event(this);
		addWindowListener(we);
		team1.addActionListener(we);
		team2.addActionListener(we);
		team3.addActionListener(we);
		close.addActionListener(we);
		
		setSize(300,220);
		setVisible(true);

	}//Work0722
	
	public JButton getTeam1() {
		return team1;
	}//getTeam1

	public JButton getTeam2() {
		return team2;
	}//getTeam1

	public JButton getTeam3() {
		return team3;
	}//getTeam1

	public JButton getClose() {
		return close;
	}//getClose

	public JTextArea getJta() {
		return jta;
	}//getJta
	
	public List<String> getList1() {
		return list1;
	}//getList1

	public List<String> getList2() {
		return list2;
	}//getList2

	public List<String> getList3() {
		return list3;
	}//getList3

	public static void main(String[] args) {
		new Work0722();
	}//main

}//class
