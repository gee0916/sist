package day0707;

/**
 * 일을 사용하는 쪽. ( 서비스를 제공 받는 쪽 )
 * @author user
 */
public class UseWork0706 {
	
	public void useMailCheck() {
		//체크할 메일 데이터
		String[] mailData= { "test@test.com",   "test.test.com",   "honggil@sist",
				 "honggildong@sist.co.kr",   "mydata.co.kr","@.","a@b.c", "aa.bb@com"};
		
		Work0706 w=new Work0706();
		
		for( int i= 0 ; i < mailData.length; i++) {
			System.out.printf("%s - %s\n", mailData[i],
					w.mailCheck(mailData[i])?"유효":"무효") ;
		}//end for
		
	}//useMailCheck
	
	public void useBestScore() {
		int[] scoreData= {89,77,89,91,95,71,99,85};
		
		Work0706 w=new Work0706();
		int bestScore=w.bestScore(scoreData);
		
		System.out.println("최고 점수 "+ bestScore);
		
	}//useBestScore

	public static void main(String[] args) {
		UseWork0706 uw=new UseWork0706();
		uw.useMailCheck();
		System.out.println("-------------------------------");
		uw.useBestScore();
		
		
	}//main

}//class
