package day0714;

/**
 * 일을 제공받는 쪽(사용하는 쪽)
 * @author user
 */
public class UseWork0713 {
	
//	생성된 비밀번호를 사용하는 일
	public void useCreatePassword() {
		
//		3. 비밀번호를 생성하는 일(Work0713.cratePassword)을 사용하여 비밀번호를 받아 출력
		Work0713 work=new Work0713();
//		비밀번호를 생성하는 일을 사용하여 비번을 받았음
		char[] tempPass=work.createPassword();
//		콘솔 출력
//		for(int i=0; i<tempPass.length;i++) {
//			System.out.print(tempPass[i]);
//		}//end for
//		배열중에 char 배열은 출력하면 주소가 아니라 문자열로 출력된다
		System.out.println(tempPass);
		
	}//useCreatePassword

	
	public void useCreateLotto() {

//		3. 로또번호를 생성하는 일(Work0713.createLotto)을 사용하여 로또번호를 받아 콘솔 출력
		Work0713 work=new Work0713();
		int[] lotto=work.createLotto();
		
		int temp=0;
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto.length; j++) {
				if (lotto[i]<lotto[j]) { //앞방의 값이 뒷방의 값보다 작다면 => 오름차순 정렬
					temp=lotto[i]; //앞방의 값을 임시변수에 넣고
					lotto[i]=lotto[j]; //뒷방의 값을 앞방에 넣고
					lotto[j]=temp; //임시변수에 값을 뒷방에 넣는다
				}//end if
			}// end for
		}//end for
		
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		
	}//useCreateLotto
	
	
//	1. 실행하여 제공하는 일들을 사용하는 일
	public static void main(String[] args) {

		UseWork0713 uw=new UseWork0713();
//		2. 비밀번호를 사용하는 일
		uw.useCreatePassword();
		System.out.println("------------");
		uw.useCreateLotto();
	
	}//main

}//class
