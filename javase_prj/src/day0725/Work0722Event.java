package day0725;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class Work0722Event extends WindowAdapter implements ActionListener {
	private List<String> listGroupOne;
	private List<String> listGroupTwo;
	private List<String> listGroupThree;
	private String[] groupOne = { "차승주", "정주은", "홍아람", "정현지", "이유리", "송성우" };
	private String[] groupTwo = { "최정민", "김강현", "정선홍", "정예은", "하지윤", "유원준" };
	private String[] groupThree = { "유설빈", "남상민", "홍다영", "송인화", "김태규", "김소현", "김도희" };

	private Work0722Design wd;

	public Work0722Event(Work0722Design wd) {
		this.wd = wd;
		// 리스트를 생성하고
		listGroupOne = new ArrayList<String>();
		listGroupTwo = new ArrayList<String>();
		listGroupThree = new ArrayList<String>();

		// 배열에 있는 것을 리스트에 추가
		setListData(listGroupOne, groupOne);
		setListData(listGroupTwo, groupTwo);
		setListData(listGroupThree, groupThree);

	}// Work0722Event

	private void setListData(List<String> list, String[] data) {
		for (String item : data) {
			list.add(item);
		} // end for
	}// setListData

	@Override
	public void windowClosing(WindowEvent e) {
		wd.dispose();
	}// windowClosing

	/**
	 * 리스트를 받아서 JTextArea에 설정
	 * 
	 * @param list
	 */
	public void setMemberData(List<String> list) {
		StringBuilder setData = new StringBuilder();
		for (String name : list) {// 리스트 element에 모든 값을 StringBuilder에 설정
			setData.append(name).append("\n");
		} // end for
			// JTextArea에 List에서 값을 가져와 설정한 데이터를 보여준다.
		wd.getJta().setText(setData.toString());
	}// setMamberData

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == wd.getJbtnOne()) {// 1조버튼 클릭
			setMemberData(listGroupOne);
		} // end if
		if (ae.getSource() == wd.getJbtnTwo()) {// 2조버튼 클릭
			setMemberData(listGroupTwo);
		} // end if
		if (ae.getSource() == wd.getJbtnThree()) {// 3조버튼 클릭
			setMemberData(listGroupThree);
		} // end if
		if (ae.getSource() == wd.getJbtnClose()) {// 종료버튼 클릭
			wd.dispose();
		} // end if
	}// actionPerformed

}// class
