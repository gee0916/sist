package day0701;

public class Work0701 {

	public static void main(String[] args) {

//		for(int i=1;i==1;i++) {
//			System.out.printf("%d\t %d\t %d\t %d\t %d\t\n",i,i,i,i,i);
//			for(int j=0;j<3;j++) {
//				System.out.printf("%d\t %d\t %d\t %d\t %d\t\n",1,0,0,0,1);
//			}//end for
//			System.out.printf("%d\t %d\t %d\t %d\t %d\t\n",i,i,i,i,i);
//		}//end for
		
		
//		for(int i=1; i<6; i++) {
//			for(int j=1; j<6; j++) {
//				System.out.print(j);
//			}System.out.println();
//		}
	
		
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				if(i==1||i==5||j==1||j==5) {
					System.out.printf("1");
				} else 
					System.out.printf("0");
			} System.out.printf("\n"); 
		}//end for
	
	

		
	}//main

}//class
