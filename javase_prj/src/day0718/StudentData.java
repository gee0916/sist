package day0718;

/**
 * 학생의 정보를 저장하는 클래스 ( 사용자 정의 자료형 =>  출력했을 때 값을 보여주는 것이 좋다.-관리)
 * @author user
 */
public class StudentData {
	private String name, gender;
	private int javaScore, oracleScore,jspScore;
	
	public StudentData() {
	}

	public StudentData(String name, String gender, int javaScore, int oracleScore, int jspScore) {
		this.name = name;
		this.gender = gender;
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
		this.jspScore = jspScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public int getOracleScore() {
		return oracleScore;
	}

	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	}

	public int getJspScore() {
		return jspScore;
	}

	public void setJspScore(int jspScore) {
		this.jspScore = jspScore;
	}

	
	/**
	 *객체가 출력될 때 주소가 아닌 객체가 가진 모든 
	 *값을 출력하도록 Override
	 */
	@Override
	public String toString() {
		return "StudentData [name=" + name + ", gender=" + gender + ", javaScore=" + javaScore + ", oracleScore="
				+ oracleScore + ", jspScore=" + jspScore + "]";
	}
	
}
