package day0711;

public abstract class abstrackCats {

	private int eye, nose, mouth, tail;
	private String name, type;
	
	public abstrackCats() {
		this(2,1,1,1);
	}//abstrackCats
	
	public abstrackCats(int eye, int nose, int mouth, int tail) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
		this.tail=tail;
	}//abstrackCats

	public int getEye() {
		return eye;
	}//getEye
	
	public void setEye(int eye) {
		this.eye = eye;
	}//setEye
	
	public int getNose() {
		return nose;
	}//getNose
	
	public void setNose(int nose) {
		this.nose = nose;
	}//setNose
	
	public int getMouth() {
		return mouth;
	}//getMouth
	
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}//setMouth
	
	public int getTail() {
		return tail;
	}//getTail
	
	public void setTail(int tail) {
		this.tail = tail;
	}//setTail
	
	public String getName() {
		return name;
	}//getName
	
	public void setName(String name) {
		this.name = name;
	}//setName
	
	public String getType() {
		return type;
	}//getType
	
	public void setType(String type) {
		this.type = type;
	}//setType
	
	public abstract String favoritePlay(String play);
	
	public abstract String favoriteSnack(String snack);
	
}//class
