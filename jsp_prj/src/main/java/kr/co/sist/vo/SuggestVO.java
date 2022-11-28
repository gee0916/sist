package kr.co.sist.vo;

public class SuggestVO {

	private int num;
	private String keyword;
	
	public SuggestVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SuggestVO(int num, String keyword) {
		super();
		this.num = num;
		this.keyword = keyword;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	@Override
	public String toString() {
		return "SuggestVO [num=" + num + ", keyword=" + keyword + "]";
	}
	
}
