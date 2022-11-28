package day0711;

public class Child extends Parent {

	int i; //부모와 같은 이름의 변수
	int k;
	
	public int getI() {
		return i;
	}
	public void setI(int i) { //부모와 같은 이름의 method
		this.i = i;
//		setI(100); //재귀호출(recursive call)
		super.setI(100); //재귀호출(recursive call)에서 부모의 method를 호출
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
		
	}
	
	public void useSuper() {
		
//		자식에 유일한 변수의 사용
		System.out.println("자식: "+k+", this: "+this.k);
		
//		부모자식에 겹치는 변수 사용
		i=2022; //this가 생략되어있다
		super.i=7;
		System.out.println("같은 변수 자식: "+i+", 부모: "+super.i);
		
//		부모에 유일한 변수 사용
		j=10;
		System.out.println("부모: "+j+", super: "+super.j+", this: "+this.j);
	
		setI(11);
		
	}//useSuper
	
}//class
