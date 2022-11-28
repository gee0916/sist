package day0721;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * has a 관계로 디자인 클래스를 입력받아 디자인 클래스의 method를 사용
 * @author user
 *
 */
public class HasAEvent extends WindowAdapter {

	private HasADesign had;
	
	public HasAEvent(HasADesign had) {
		this.had=had;
	}
	
	@Override
	public void windowClosing(WindowEvent we) {
		
		System.out.println("has a 관계의 클래스에서 구현한 windowClosing");
		had.dispose(); //Window class에 존재하는 method
		
	}//windowClosing

}//class
