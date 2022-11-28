package kr.co.sist.vo;

public class CounterVO {
	
	private int cnt;

	public CounterVO() {
		System.out.println("CounterVO 생성");
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt += cnt;
	}

	@Override
	public String toString() {
		return "CounterVO [cnt=" + cnt + "]";
	}
	
}
