package day0707;

/**
 * 행마다 열의 갯수가 다른 배열
 * @author user
 */ 
public class TestVariableArray {

	/**
	 * 참조형 형식
	 */
	public void useArray1() {
		
//		1. 선언) 데이터형[][] 배열명=null;
		int[][] arr=null;
		
//		2. 생성) 열의 수를 설정하지 않는다. 배열명=new 데이터형[행의수][];
		arr=new int [4][];
		
//		3. 행마다 열을 생성) 가변배열 배열명[행의번호]=new 데이터형[열의 갯수];
		arr[0] = new int[2]; //방의 값이 초기화
		arr[1] = new int[1];
		arr[2] = new int[] {1,2,3,4,5};
		arr[3] = new int[] {100,200,300,400};
		
//		4. 값 할당) 배열명[행의번호][열의번호]=값;
		arr[0][0]=2022;
		arr[0][1]=7;
		
		arr[1][0]=2;
		
//		5. 값 사용) 배열명[행의번호][열의번호];
		for(int i=0; i<arr.length; i++) {//행
			for(int j=0; j<arr[i].length; j++) { //열
				System.out.printf("arr[%d][%d]=%d\t",i,j,arr[i][j]);
			}//end for
			System.out.println();
		}//end for
		
	}//useArray1
	
	/**
	 * 기본형 형식
	 */
	public void useArray2() {
//		1.선언) 데이터형[][] 배열명={ {값},{,,}{,,,,} }; //행구분 괄호를 다르게 묶을 것
		int[][] arr= { {1,2,3,4},{5},{6,7,8},{9,10,11},{12} };
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]행의 열의 수 %d개 \n",i,arr[i].length);
		}//end for
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%d\t",i,j,arr[i][j]);
			}//end for
			System.out.println();
		}//end for
		
			
	}//useArray2
	
	public static void main(String[] args) {

		TestVariableArray tav=new TestVariableArray();
		tav.useArray1();
		System.out.println("--------------------");
		tav.useArray2();
		System.out.println("--------------------");
		System.out.println(tav.toString());
		
		
		
	}//main
}//class
