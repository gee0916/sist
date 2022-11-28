package day0629;


public class Work0629 {

//	1. 고정일: 내이름
	public void name() {
		System.out.println("정현지");
	}//name
	
//	2. 고정값(char): 이름 이니셜 첫 글자만	
	public char eName() {
		return 'J';
	}//eName
	
//	3. 가변일: 점수 입력 받아 점수의 판정을 출력
	public void socre(int i) {
	 if(0<=i&&i<40) {
		System.out.println(i+"점은 과락");
			}else if(40<=i&&i<60){
				System.out.println(i+"점은 다른 과목 참조");
			}else	if(60<=i&&i<=100) {
					System.out.println(i+"점은 합격");
			}else {
				System.out.println(i+"점은 잘못된 점수");
			}
	}//score
	
//	4. 가변일: 문자를 입력받아 해당 문자가 '대문자' '소문자' '숫자' 인지 판단출력

	 public void letter(char c) {
			if('A'<=c&&c<='Z') {
				System.out.println(c+" - 대문자");
			}else if('a'<=c&&c<='z'){
				System.out.println(c+" - 소문자");
			}else if('0'<=c&&c<='9') {
				System.out.println(c+" - 숫자");
			}
	 }//letter
	
//	5. 가변값(int): 태어난 해를 입력받아 나이를 반환
	public int bornYear (int nowyear,int i) {
		return nowyear-i+1;
	 }//bornYear
	
//	6. 가변값: 두 개의 수를 입력 받아 둘 중 큰 수를 반환, 같은 수라면 처음 수를 반환
	public int num (double n1, double n2) {
		double d=0.0;
		if(n1<n2) {
			d=n2;
		}else if(n2<n1) {
			d=n1;
		}else if(n1==n2) {
			d=n1;
		}//end if
		return (int)d;
	 }

	
	public static void main(String[] args) {

		Work0629 w=new Work0629(); //객체화
		
/*1*/		w.name();
		
/*2*/		char c=w.eName();
			System.out.println("이름 이니셜 첫 글자: "+c); 
		
/*3*/		w.socre(26);

/*4*/		w.letter('d');

			int nowyear=2022;
/*5*/		int i=w.bornYear(nowyear,1998);
			System.out.println("나이 : "+(i));

/*6*/ 		int n1=w.num(50,5);
			System.out.println(n1);
			

	}//main
		

}//class
