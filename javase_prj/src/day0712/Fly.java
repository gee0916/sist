package day0712;

/**
 * 날기위한 일의 목록을 정의하는 것
 * 일의 목록: 날려면 양력과 추진력이 있어햐한다
 * @author user
 */
public interface Fly {

	/**
	 * 양력
	 * @return
	 */
	public String lift();
	
	/**
	 * 추진력
	 * @return
	 */
	public abstract String divingForce();
	
}//class
