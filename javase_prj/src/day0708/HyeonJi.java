package day0708;

/**
 * 자신이 다른사람보다 잘하는 것을 생각한 후 Person을 상속받아 자신 클래스를 작성 후 객체 생성
 * @author user
 */
public class HyeonJi extends Person {

	public int bowl;
	
	public HyeonJi() {
		super(2,1,1);
		bowl=2;
	}//Hyeonji
		
	public String eating (int bowl) {
		String result = "";
		
		if( bowl < 2 ) {
			result= "부족한데?";
		}else if(bowl==2){
			result="잘먹었다~^_^b";
		}else {
			result="너무 배불러!!";
		}//end else
		return result;
	}//eating
	
	@Override
	public String eat() {
		return getName()+"가 집에서 불닭을 끓여먹는다";
	}//eat
	
	@Override
	public String eat(String m, int p) {
		return getName()+"가 친구들과 " + m +"을 " +p+ "개나 시켜서 먹는다";
	}
	
}//class
