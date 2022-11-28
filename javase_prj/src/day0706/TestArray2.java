package day0706;

public class TestArray2 {

	public void useArray() {
//		이차원 배열
		
//		1. 선언) 데이터형[][] 배열명=null;
		int[][] arr=null;
		
//		2. 생성) 배열=new 데이터형[행의번호][열번호]
		arr=new int[3][4];
		System.out.println("행의 수 "+arr.length);
		for(int i=0;i<arr.length; i++) { //행
			System.out.println(i+"행의 열의수 "+arr[0].length);
		}//end for
		
//		3. 값 할당) 배열명[행의번호][열의번호]=값;
//		이차원배열에서 행은 주소(일차원 배열의 주소)를 가진다
		arr[0][0]=2022;
		arr[1][2]=7;
		arr[2][3]=6;
		
//		4. 값 사용) 배열명[행의번호][열의번호]
		System.out.println(arr[0][0]+" / "+arr[0][1]+" / " +arr[0][2]);
		
//		일괄처리
		for(int i=0; i<arr.length; i++) { //행
			System.out.println(i+" 행 시작");
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%-6d",i,j,arr[i][j]);
			}//end for
			System.out.println("/n"+i+" 행 끝");
		}//end for
		
	}//useArray
	
	public void useArray2() {
		
//			기본형 형식의 사용
//		int[][]score= {
//				{87,78,89},{71,77,73},{99,100,95},{66,63,69},{88,40,91}
//		};
		int[][]score= new int[][]{
			{87,78,89},{71,77,73},{99,100,95},{66,63,69},{88,40,91}
		};
		String[] names= {"차승주","송성우","이유리","남상민","김강현"};
		System.err.println("번호\t이름\t자바\t오라클\tJSP\t총점\t평균");
		
			
		System.out.println("----------------------------------------------------");
		int totalScore=0;
		
		for(int i=0; i<score.length; i++) { //행
			
			System.out.printf("%d\t%s\t",i+1,names[i]);
			
			for(int j=0; j<score[i].length; j++) { // 열
				System.out.printf("%d\t", score[i][j]);
				totalScore+=score[i][j];
			}//end for
			
			System.out.printf("%d\t%.2f\n",totalScore,(double)totalScore/score[i].length);
			totalScore=0;
		}//end for
		System.out.println("----------------------------------------------------");
		System.out.printf("\t총점\t%d\t%d\t%d\n",0,0,0);
	
	}// useArray2

	public void useArray3() {
		int[][] arr=new int[6][9];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i==0 || i==arr.length-1 || j==0 || j==arr[i].length-1 ) {
//					처음행, 마지막행, 처음열, 마지막열
					arr[i][j]=1;
				}//end if
				System.out.printf("%-3d",arr[i][j]);
			}//end for
			System.out.println();
		}//end for
		
		
	}//end useArray3
	
	public static void main(String[] args) {
		TestArray2 ta=new TestArray2();
		ta.useArray();
		System.out.println("----------------------------");
		ta.useArray2();
		System.out.println("----------------------------");
		ta.useArray3();
		System.out.println("----------------------------");
		
		
	}//main

}//class
