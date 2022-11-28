package day0725;

/**
 *
 * @author user
 */
public class TestStackOverFlowError {
	int i;
	public void methodA() {
		System.out.println("methodA");
		System.out.println(i);
		i++;
		if(i < 12200) {// 에러가 발생하면 소스코드를 수정해야한다. 
			methodA();// method를 더이상 호출하지 못하는 에러가 발생할 수 있다.
		}
	}//methodA
	
	public void methodB() {
		System.out.println("methodB");
	}//methodB

	public static void main(String[] args) {
		TestStackOverFlowError tsofe=new TestStackOverFlowError();
		tsofe.methodA();
		tsofe.methodB();
	}//main

}//class
