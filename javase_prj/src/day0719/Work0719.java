package day0719;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Work0719 {

	List<String> list = new ArrayList<String>();

	public void menu() {

		String input;

		while(true) {
			input = JOptionPane.showInputDialog("메뉴\n0.입력 1.출력 2.종료");
			System.out.println("입력한 숫자 > "+input);
			if (input.equals("0")) {
				String input2 = JOptionPane.showInputDialog("입력");
				list.add(input2);
				continue;
			} else if (input.equals("1")) {
				this.inputData();
			} else if (input.equals("2")) {
				this.printData();
				break;
			} // end if
		} // end while

	}// menu

	public void inputData() {//inputData니까 이름을 입력하시는 일을 하면 됩니다. 

		for(int i=0; i<list.size();i++) {
			System.out.printf("%d번째 입력한 이름: [%s]\n",i+1,list.get(i));
		}//end for
		
	}// inputData

	public void printData() {
		//여기서 이름을 출력하시면 되요.
		System.out.println("프로그램을 종료합니다.");

	}// printData

	public static void main(String[] args) {

		Work0719 w = new Work0719();
		w.menu();

	}// main

}// class
