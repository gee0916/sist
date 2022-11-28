package day0711;

public class UseSuper {

	public static void main(String[] args) {

		Child c=new Child(); //Object -> Parent -> Child (생성은 -> 순서, 읽는건 <- 뒤에서 부터 읽기)
		c.useSuper();
		
	}//main

}//class
