package day0711;

public class Parent {

	int i=20000;
	int j;
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
		System.out.println("부모 setI: "+i);
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
}//class
