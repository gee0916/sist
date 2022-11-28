package kr.co.sist.vo;

public class SearchDataVO {

	private int startNum, endNum;
	private String fieldName, keyword;
	

	public SearchDataVO() {
		super();
	}

	public SearchDataVO(int startNum, int endNum) {
		super();
		this.startNum = startNum;
		this.endNum = endNum;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "SearchDataVO [startNum=" + startNum + ", endNum=" + endNum + ", fieldName=" + fieldName + ", keyword="
				+ keyword + "]";
	}
	
	/*public void test() {
		//숫자 형태의 문자 별다른 일 없이 숫자로만 받기 (변환 후 추후일이 없음)
		int i=Integer.parseInt("10");
	
		//숫자 형태의 문자열 받아서 다양한 일을 처리 (변환 후 추후 연속적 일이 없음)
		Integer ii=Integer.valueOf("10");
		ii.floatValue();
		ii.doubleValue();
	}*/
	
}
