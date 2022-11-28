package day0715;

public class StudentData {
	
	String name, gender="";
	int javaScore, oracleScore, jspScore=0;
	
	public StudentData() {
		
	}//StudentData
	
	public StudentData(String name, String gender, int javaScore, int oracleScore, int jspScore) {
		
		this.name=name;
		this.gender=gender;
		this.javaScore=javaScore;
		this.oracleScore=oracleScore;
		this.jspScore=jspScore;
		
	}//StudentData
	
	public String getName() {
		return name;
	}//getName
	
	public void setName(String name) {
		this.name = name;
	}//setName
	
	public String getGender() {
		return gender;
	}//getGender
	
	public void setGender(String gender) {
		this.gender = gender;
	}//setGender
	
	public int getJavaScore() {
		return javaScore;
	}//getJavaScore
	
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}//setJavaScore
	
	public int getOracleScore() {
		return oracleScore;
	}//getOracleScore
	
	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	}//setOracleScore
	
	public int getJspScore() {
		return jspScore;
	}//getJspScore
	
	public void setJspScore(int jspScore) {
		this.jspScore = jspScore;
	}//setJspScore
	
	public String toString() {
		return String.format("%7s %4s %6d %5d %6d",name,gender,javaScore,oracleScore,jspScore);
 	}//toString
	
}//class
