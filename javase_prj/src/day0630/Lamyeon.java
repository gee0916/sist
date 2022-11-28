package day0630;

public class Lamyeon {

	private String color;
	private String body;
	private int soupBase;
	
	public void setColor(String color) {
		if(!(color.equals("빨간색")||color.equals("파란색")||color.equals("검은색")||color.equals("노란색"))) {
			color ="빨간색";
		}//end if
		this.color=color;
	}//setColor
	
	public void setBody(String body) {
		if(!(body.equals("봉지")||body.equals("컵"))) {
			body = "봉지";
		}//end if
		this.body=body;
	}//end body
	
	public void setSoupBase(int soupBase) {
		this.soupBase=soupBase;
	}//end soupBase
	
	
	public String getColor() {
		return color;
	}//getColor
	
	public String getBody() {
		return body;
	}//getBody
	
	public int getSoupBase() {
		return soupBase;
	}//getSoupBase
	
	
	public String eat (String message) {
		return "스프가 " + soupBase + "개 들어있는 " + color+" "+ body + "라면을 " + message;
	}

	
	

}//class
