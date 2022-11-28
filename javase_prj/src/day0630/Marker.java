package day0630;

/**
 * 마카펜을 추상화하여 만드는 클래스.<br>
 * 명사적 특징: 색, 뚜껑의 갯수, 몸체 갯수. <br>
 * 동사적 특징: 쓴다. <br>
 * @author user
 */
public class Marker {

//	instance 변수는 값을 안전하게 보관하고 사용하기 위해 클래스 외부에서 직접 접근을 막는다
	private String color;
	private int cap;
	private int body;
	
	public Marker() {
		this("검은",1,1);
	}//Marker
	
	/**
	 * 뚜껑 n개, 몸체 n개. 원하는 색으로 마카펜을 생성할 때 사용하는 생성자 
	 * @param color 색
	 * @param cap 뚜껑
	 * @param body 몸체
	 */
	public Marker(String color, int cap, int body) {
		this.color=color;
		this.cap=cap;
		this.body=body;
	}//Marker
	
	/**
	 * 마카펜 객체에 색을 설정하는 일. <br>
	 * 색은 검은색, 빨간색, 파란색만 설정할 수 있고, 다른색이 입력되면 검은색으로 설정된다
	 * 색을 생략하고 검은, 파란, 빨간으로 만 입력해주세요 <br>
	 * 검은색 입력의 예) <br>
	 * 객체명.setColor("검은")
	 * @param color 설정할 색
	 */
	public void setColor(String color) {
//		입력값에 대한 유효성 검증
		if(!(color.equals("검은")||color.equals("파란")||color.equals("빨간"))) {
			color ="검은";
		}//end if
//		유효성 검증된 값으로만 설정된다
		this.color=color;
	}//setColor
	
//	뚜껑의 갯수를 설정하는 method 생성
	/**
	 * 생성된 마카펜 객체의 뚜껑의 갯수를 설정하는 일
	 * @param cap 설정할 뚜껑의 갯수
	 */
	public void setCap(int cap) {
		this.cap=cap;
	}//setCap
	
//	마카펜 객체의 몸체의 갯수를 설정하는일
//	몸체의 갯수 최소 1부터 최대 10까지만 설정가능하고 그 이외의 값이 입력 된다면
//	1로 설정하는 method
	public void setBody(int body) {
		if(1<=body&&body<=100) {
			this.body=body;
		} else {
			this.body=1;
		}//end if
	}//setBody
	
	/**
	 * 생성된 마카펜 객체의 색을 반환하는 일
	 * @return 설정된 색
	 */
	public String getColor() {
		return color;
	}//gerColor
	

	/**
	 * 생성된 마카펜 객체에 설정된 뚜껑의 갯수를 반환하는 일
	 * @return
	 */
	public int getCap() {
		return cap;
	}//gerCap
	
	/**
	 * 생성된 마카펜 객체에 설정된 몸체의 갯수를 반환하는 일
	 * @return
	 */
	public int getBody() {
		return body;
	}//getBody
	
	/**
	 * 마카펜의 동사적인 특징 구현
	 * @param message 칠판에 쓸 메시지
	 * @return 생성된 색을 사용하여 메시지를 기록한 행동
	 */
	public String write(String message) {

		return message+"를 "+color+"색인 마카펜으로 칠판에 쓴다";
		
	}//write

}//class
