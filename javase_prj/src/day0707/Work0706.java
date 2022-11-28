package day0707;

/**
 * 일을 하는 쪽.(서비스를 제공하는 쪽)
 * @author user
 */
public class Work0706 {

	/**
	 * 메일을 입력받아, 메일의 유효성 검증을 수행하고 검증 결과를 내보낸다 <br>
	 * 검증. 메일은 5자 이상이면서 @과 .이 있어야하고 @은 .보다 먼저 나와야 한다
	 * @param mail 유효성검증할 메일
	 * @return 검증결과 유효 - true, 무효 - false
	 */
	public boolean mailCheck(String mail) {
		boolean flag=false;
		
		int leng=mail.length(); //글자수
		int at=mail.indexOf("@"); //@의 여부
		int dot=mail.indexOf("."); //.의 여부
		
		if(leng>5 && at != -1 && dot !=-1 && at<dot) { 
			//글자수는 5자 이상, @이존재?, .이 있어, @은 .보다 앞에 나와야한다
			flag=true;
		}else {
			flag=false;
		}//end else
		
		return flag;
	}//mail
	
	
	/**
	 * 배열을 입력받아 최고 점수를 찾아내서 반환하는
	 * @param score 모든 점수의 데이터
	 * @return 모든 데이터의 점수 중 최고점수
	 */
	public int bestScore(int[] score) {
		int bestScore=score[0]; //처음방의 값이 최고 점수임 
		
		for(int i=0; i <score.length; i++) {//처음 방 이후 방부터 끝 방까지 반복
			System.out.print(score[i]+" ");
			if(bestScore<score[i]) { //앞방의 값이 뒷방보다 크면 뒷방의 값을 저장
				bestScore=score[i]; //뒷방이 크므로 뒷방의 값으로 최고 값을 변경
			}//end if
		}//end for
		
		return bestScore;
	}//bestScore
	

}//class
