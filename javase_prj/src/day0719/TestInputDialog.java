package day0719;

import javax.swing.JOptionPane;

public class TestInputDialog {

	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("메뉴\n0.입력 1.출력 2.종료");
		System.out.println(input );
	}

}
