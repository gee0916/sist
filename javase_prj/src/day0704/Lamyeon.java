package day0704;

public class Lamyeon {

	private String color, body, name;
	private int soupBase;
	
	public Lamyeon() {
		this("빨간색", "봉지", 3);
	}
	
	public Lamyeon(String color, String body, int soupBase) {
		this.color=color;
		this.body=body;
		this.soupBase=soupBase;
	}
	
	public void setColor(String color) {
		//라면에 색을 비교하지 않으셔도 될 것 같아요. 색은 너무 다양하게 나올 수 있습니다.
//		if(!(color.equals("빨간색")||color.equals("파란색")||color.equals("검은색")||color.equals("노란색"))) {
//			color ="빨간색";
//		}//end if
		this.color=color;
	}//setColor
	
	public void setBody(String body) {
		if(!(body.equals("봉지")||body.equals("컵"))) { //오! 컵라면 봉지라면 의 비교
			body = "봉지";
		}//end if
		this.body=body;
	}//end body
	
	public void setSoupBase(int soupBase) {
		this.soupBase=soupBase;
	}//end soupBase
	
	public void setName(String name) {
		this.name=name;
	}//setName
	
	public String getColor() {
		return color;
	}//getColor
	
	public String getBody() {
		return body;
	}//getBody
	
	public int getSoupBase() {
		return soupBase;
	}//getSoupBase
	
	public String getName() {
		return name;
	}//getName
	
	public String eat() { //잘하셨습니다. 
		return name+body + "라면을 먹는다";
	}//eat
	
	public String eat (int num, String how) {
		return name+"라면을 "+num+"개 "+how+"먹는다";
	}

	
	

}//class
