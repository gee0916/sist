package day0706;

public class Work0706 {

//	1번.입력받은 이메일의 유효성을 검사 boolean으로 반환 -> boolean 사용하면 자자꾸 오류가 나서 못했습니다 ㅠㅠ
//	1-1) 메일은 5자 이상, @과 .이 있어야함 @은 .보다 먼저
//	1-2) 배열을 반복하여 유효성의 결과 출력
	 public void num1() {
		 
		 String[] email= {"test.com", "test.test.com", "honggil@sist",
					"honggildong@sist.co.kr", "mydata.co.kr"};
		 
		 for(int i=0; i<email.length; i++) {
//				
				if(email.length>=5 && email[i].indexOf('@')!=-1 && email[i].indexOf('.')!=-1
						&& (email[i].indexOf('@') < email[i].indexOf('.'))) {
					System.out.println(email[i]+" - 유효");
				} else {
					System.out.println(email[i]+" - 무효");
				}//end else
		 }//end for
		 
	 }//num1
	
//	2번. 최고점수 찾아서 반환 
//	최고점수 99점
	public void num2() {
		int[] number= { 89, 77, 89, 91, 95, 71, 99, 85 };
		int max=number[0];
		
		for(int i=1; i<number.length;i++) {
			if(number[i]>max) {
				max=number[i];
			}//end if
		}//end for
		
		System.out.println("최고점수 "+max+"점");
		
	}//num2
	
	public static void main(String[] args) {
		
		Work0706 w=new Work0706();
		w.num1();
		w.num2();
		
	}//main
	
}//class
