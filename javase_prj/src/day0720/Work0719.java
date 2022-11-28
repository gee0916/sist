package day0720;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Work0719 {
	private List<String> list;

	public static final String INPUT = "0";
	public static final String OUTPUT = "1";
	public static final String EXIT = "2";

	public Work0719() {
		list = new ArrayList<String>();
	}// Work0719

	public void menu() { // 메뉴를 입력받는다.
		boolean exitFlag = false;
		String inputMenuNum = "";

		do {
			inputMenuNum = JOptionPane.showInputDialog("메뉴\n 0-입력  1- 출력  2 - 종료");

			if (inputMenuNum != null) {
				switch (inputMenuNum) {
				case Work0719.INPUT:
					inputData();
					break;
				case Work0719.OUTPUT:
					printData();
					break;
				case Work0719.EXIT:
					exitFlag = true;
					break;
				}// end switch
			} else {
				exitFlag = true;
			} // end if
		} while (!exitFlag);
		System.out.println("사용해주셔서 감사합니다.");
	}// menu

	public void inputData() {// 이름을 입력받아 리스트 추가한다.
		String name = JOptionPane.showInputDialog("이름을 입력해 주세요.", "홍길동");
		if (name != null && !name.equals("")) {// 취소가 아니면서 ""가 아니라면
			list.add(name);// 리스트에 이름을 넣자
		} // end if
	}// inputDate

	public void printData() {// 리스트이름을 출력 한다.
		if (list.isEmpty()) {
			System.out.println("입력된 이름이 엄서용!");
		} // end if

		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + " " + list.get(i));
		} // end if
	}// printData

	public static void main(String[] args) {
		Work0719 work = new Work0719();
		work.menu();
	}// main

}// class
