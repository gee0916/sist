package day0725;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class SubWork0725 extends JDialog {

	private Work0725 w;

	private JList<String> listFont;
	private JList<String> listStyle;
	private JList<String> listSize;
	private JTextField jtfFont;
	private JTextField jtfStyle;
	private JTextField jtfSize;
	private JLabel jlblView;
	private JButton jbOkay;
	private JButton jbCancel;
	
	private DefaultListModel<String> dlmFont;
	private DefaultListModel<String> dlmStyle;
	private DefaultListModel<String> dlmSize;

	public SubWork0725(Work0725 w) {
		
		super(w,"글꼴",true);
		
		this.w=w;
		
		JLabel jlblFont=new JLabel("글꼴");
		JLabel jlblStyle=new JLabel("글꼴 스타일");
		JLabel jlblSize=new JLabel("크기");
		
		dlmFont=new DefaultListModel<String>();
		dlmStyle=new DefaultListModel<String>();
		dlmSize=new DefaultListModel<String>();
		
		listFont=new JList<String>(dlmFont);
		listStyle=new JList<String>(dlmStyle);
		listSize=new JList<String>(dlmSize);
		
		dlmFont.addElement("돋음");
		dlmFont.addElement("맑은 고딕");
		dlmFont.addElement("궁서체");
		dlmFont.addElement("Serif");
		dlmFont.addElement("SansSerif");
		
		dlmStyle.addElement("일반");
		dlmStyle.addElement("굵게");
		dlmStyle.addElement("기울임꼴");
		dlmStyle.addElement("굵은 기울임꼴");
		
		int i=0;
		for(i=8;i<=80;i++) {
			if(10<i&&i<=80) { 
				i+=1;
			}
			dlmSize.addElement(String.valueOf(i));
		}//end for
		
		JScrollPane jspFont=new JScrollPane(listFont);
		JScrollPane jspSize=new JScrollPane(listSize);
		JScrollPane jspStyle=new JScrollPane(listStyle);
		
		jtfFont=new JTextField();
		jtfStyle=new JTextField();
		jtfSize=new JTextField();
		
		jlblView=new JLabel("AaBbYyZz");
		jlblView.setBorder(new TitledBorder("보기"));
		
		jbOkay=new JButton("확인");
		jbCancel=new JButton("취소");
		
		setLayout(null);
		
		jlblFont.setBounds(20,10,30,20);
		jtfFont.setBounds(20,30,100,20);
		jspFont.setBounds(20,50,100,100);
		
		jlblStyle.setBounds(135,10,100,20);
		jtfStyle.setBounds(135,30,100,20);
		jspStyle.setBounds(135,50,100,100);
		
		jlblSize.setBounds(250,10,50,20);
		jtfSize.setBounds(250,30,50,20);
		jspSize.setBounds(250,50,50,100);
		
		jlblView.setBounds(40,160,250,100);
		
		jbOkay.setBounds(80,300,80,30);
		jbCancel.setBounds(180,300,80,30);
		
		add(jlblFont);
		add(jtfFont);
		add(jspFont);
		
		add(jlblStyle);
		add(jtfStyle);
		add(jspStyle);
		
		add(jlblSize);
		add(jtfSize);
		add(jspSize);
		
		add(jlblView);
		
		add(jbOkay);
		add(jbCancel);
		
		
		SubWork0725Event swe=new SubWork0725Event(this);
		addWindowListener(swe);
		listFont.addListSelectionListener(swe);
		listStyle.addListSelectionListener(swe);
		listSize.addListSelectionListener(swe);
		jbOkay.addActionListener(swe);
		
		setBounds(getX()+300,getY()+70,350,400);
		setVisible(true);
		
	}//SubWork0725
	
	public Work0725 getW() {
		return w;
	}//getW

	public DefaultListModel<String> getDlmFont() {
		return dlmFont;
	}//getDlmFont
	
	public DefaultListModel<String> getDlmStyle() {
		return dlmStyle;
	}//getDlmStyle

	public DefaultListModel<String> getDlmSize() {
		return dlmSize;
	}//getDlmSize

	public JList<String> getListFont() {
		return listFont;
	}//getListFont

	public JList<String> getListStyle() {
		return listStyle;
	}//getListStyle

	public JList<String> getListSize() {
		return listSize;
	}//getListSize

	public JTextField getJtfFont() {
		return jtfFont;
	}//getJtfFont

	public JTextField getJtfStyle() {
		return jtfStyle;
	}//getJtfStyle

	public JTextField getJtfSize() {
		return jtfSize;
	}//getJtfSize

	public JLabel getJlblView() {
		return jlblView;
	}//getJlblView

	public JButton getJbOkay() {
		return jbOkay;
	}//getJbOkay

	public JButton getJbCancel() {
		return jbCancel;
	}//getJbCancel
	
}//class
