package day0707;

/**
 * 면, 행, 열로 구성된 배열
 * @author user
 */
public class TestArray3 {
	
	/**
	 * 참조형 형식으로 사용
	 */
	public void useArray1() {
//		1. 선언) 데이터형[][][] 배열명=null;
		int[][][] arr=null;
		
//		2. 생성) 배열명=.new 데이터형[면의수][행의수][열의수];
		arr=new int[3][2][3];
		System.out.printf("면의 수 %d , 행의 수 %d , 열의수 %d\n",
				arr.length, arr[0].length, arr[0][0].length);
		
//		3. 값할당) 배열명[면의번호][행의번호][열번호]=값;
		arr[0][0][0]=2022;
		arr[1][1][1]=7;
		arr[2][1][2]=6;

//		4. 값사용) 
		System.out.println(arr[0][0][0]+"/"+arr[0][0][1]);
		
//		5. 일괄처리
		for(int i=0; i<arr.length; i++) { //면: 면의수: 배열명.length
			System.out.printf("%d면 시작\n",i);
			for(int j=0; j<arr[i].length; j++) { //행: 행의수: 배열명[면의번호].length
				System.out.printf("%d행 시작\n",j);
 				for(int k=0; k<arr[i][j].length; k++) { //열: 열의수: 배열명[면의번호][행의번호].length
 					System.out.printf("arr[%d][%d][%d]=%d\t",i,j,k,arr[i][j][k]);
				}//end for
 				System.out.printf("\n%d행 끝\n",j);
			}//end for
			System.out.printf("%d면 끝\n",i);
		}//end for
		
	}//useArray1
	
	/**
	 * 기본형 형식으로 사용
	 */
	public void useArray2() {
//	1. 선언) 데이터형[][][] 배열명={값,,,,}; 면구분괄호와 행구분 괄호를 넣어야한다
		int[][][] arr= {
				{{1,2,3},{4,5,6}},
				{{7,8,9},{10,11,12}}
				};
		System.out.printf("%d면 %d행 %d열\n",arr.length,arr[0].length,arr[0][0].length);
		
//		일괄처리
		int sum=0;
		for(int i=0;i<arr.length;i++ ) { //면
 			for(int j=0;j<arr[i].length;j++ ) { //행
				for(int k=0;k<arr[i][j].length;k++ ) { //열
					if(i==0 && j==1) {
						sum += arr[0][1][k];
					}//end if
					System.out.printf("arr[%d][%d][%d]=%d\t",i,j,k,arr[i][j][k]);
				}//end for
				System.out.println();
			}//end for
 			System.out.println();
		}//end for
		
		System.out.println("배열에 0면 1행의 모든 방의 값을 합하여 출력"+sum);
		
		
		
	}//useArray2

	public static void main(String[] args) {

	TestArray3 ta=new TestArray3();
	ta.useArray1();
	System.out.println("------------------------");
	ta.useArray2();
	
	}//main

}//class
