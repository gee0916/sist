package day0706;

/**
 * 일차원 배열 사용
 * @author user
 */
public class TestArray1 {
	public void useArray() {
//		1. 선언) 데이터형[] 배열명=null;
		int[] arr=null;
		System.out.println(arr);
//		2. 생성) 배열명=new 데이터형[방의 수]; 모든 방의 값은 자동초기화가된다
		arr=new int[5];
		System.out.println(arr);
//		3. 값 입력) 배열명[방의 번호]=값;
		arr[0]=2022;
		arr[1]=7;
		arr[2]=6;
		arr[3]=11;
		arr[4]=48;
//		4. 갑 사용) 배열명{방의번호]
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		System.out.println("배열의 방의 수: "+arr.length);
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			sum+=arr[i];
		}//end for
		System.out.println("배열에 끝 방 까지의 합 "+sum);
		System.out.println("------------------------------");
		
//		배열의 마지막 방에서부터 처음 방의 순서까지 모든 방의 값을 출력
		for(int i=arr.length-1; i>-1; i--) {
			System.out.println(arr[i]);
		}//end for
		
	}//useArray
	
		public void useArray2() {
//			영어 대문자 A~Z까지 char형으로 배열을 만들고 0번째 방부터 추가 후 출력
//			1. 선언
			char[] alpha=null;
//			2. 생성
			alpha=new char[26];
//			3. 값 할당
			for(int i=0; i<alpha.length; i++) { //0,1,2, ...25
				alpha[i]=(char)(i+65);
//				4. 값 사용
				System.out.print(alpha[i]+" ");
			}//end for
			System.out.println();
//			선언과 생성을 한번에
//			1. 선언 + 2. 생성
			char[] lowerCase=new char[alpha.length];
//			3. 값 할당
			for(int i=0; i<lowerCase.length; i++) { //0,1,2, ...25
				lowerCase[i]=(char)(i+97);
//				4. 값 사용
				System.out.print(lowerCase[i]+" ");
			}//end for
			
		}//useArray2
	
		public void useArray3() {
//			일차원 배열에 기본형형식의 사용
//			데이터형[] 배열명={값,,,};
//			int[] javaScore= {94,80,77,99,100,87};
//			기본형 형식으로 사용하면 Compiler가 "new데이터형[]}을 붙여준다
			int[] javaScore= new int[]{94,80,77,99,100,87};
			System.out.printf("응시인원수[%4d]\n",javaScore.length);
			System.out.println("번호\t점수");
			System.out.println("===========");
			int totalScore=0;
			for(int i=0; i<javaScore.length; i++) {
				System.out.printf("%d\t%d\n",i+1,javaScore[i]);
				totalScore+=javaScore[i];
			}//end for
			System.out.println("============");
			System.out.printf("총점: %d점",totalScore);
			System.out.printf("\n평균: %.1f점",(float)totalScore/javaScore.length); //평균은 소수점 이하 1자리까지만 출력
		}//useArray3
	
		public void useArray4() {
//			String[] addr= {"서울시 강남구 역삼동","서울시 동대문구 등대문등","서울시 구로구 대림동",
//					"서울시 중구 필동","경기도 수원시 인계동","인천시 마계동","제주특별자치도 이도동",
//					"서울시 동작구 상도동"};
			String[] addr= new String[] {"서울시 강남구 역삼동","서울시 동대문구 등대문등","서울시 구로구 대림동",
					"서울시 중구 필동","경기도 수원시 인계동","인천시 마계동","제주특별자치도 이도동",
			"서울시 동작구 상도동"};
//			모든 주소를 출력
			int seoulCnt=0;
			for(int i=0; i<addr.length; i++) {
//				주소에 마계동이 있다면 마포동으로 변경
				if(addr[i].contains("마계동")) {
					addr[i]=addr[i].replaceAll("마계동", "마포동");
				}//end if
				
//				주소가 10자이상이라면 9자까지만 보여주고 나머지는 ...으로 처리하여 출력하고 
//				그렇지 않다면 모든 주소를 출력하세요
				if(addr[i].length()>10) {
					System.out.println(addr[i].substring(0,9)+"...");
				} else {
					System.out.println(addr[i]);
				}//end else if
				
				if(addr[i].startsWith("서울시")) {
					seoulCnt++;
				}
			}//end for
			System.out.printf("서울시는 [%d]개가 존재합니다.",seoulCnt);
			
		}//useArray4
		
		
		
	public static void main(String[] args) {
		System.out.println(args);
//		new TestArray1().useArray(); //method chain 문법
		TestArray1 ta=new TestArray1();
		ta.useArray();
		System.out.println("---------------------------------------");
		ta.useArray2();
		System.out.println("\n---------------------------------------");
		ta.useArray3();
		System.out.println("\n---------------------------------------");
		ta.useArray4();
		
		
	}//main

}//class
