package day0713;

/**
 * 확장자가 없는 파일명인 경우에는 "파일명_backup"이 되어야 한다
 * 문자열의 길이가 1자 이상 부터 처리한다
 * null인 경우에는 ""로 반환되어야한다
 * @author user
 */
public class Work0712 {
	
	public String backupFileName(String fileName) {
		String createName=""; //empty
		
		if(fileName!=null) { //heap주소가 없니? 객체가 생성되지 않았니? => 기능을 사용할 수 있다
			//앞뒤공백을 제거한 후 StringBuilder를 생성 (whitespace 상태가 제거된다)
			StringBuilder sbTenpFile=new StringBuilder(fileName); 
			
			if(sbTenpFile.length()>0) { //문자열의 길이가 한자 이상
				
				if(fileName.contains(".")) { //확장자가 있니? => . 자리에 "_backup"을 넣는다 => insert method
//					. 자리를 찾아 _backup을 넣는다
					sbTenpFile.insert(sbTenpFile.lastIndexOf("."), "_backup");
				}else { //확장자가 없니? => 가장 마지막에 _backup을 추가한다 => append method
					sbTenpFile.append("_backup");
				}//end else
//				처리된 파일명을 반환하기 위해서 StringBuilder의 값을 String변수에 할당
				createName=sbTenpFile.toString();
			}//end if
		}//end if
		
		return createName;
	}//backupFileName

}
