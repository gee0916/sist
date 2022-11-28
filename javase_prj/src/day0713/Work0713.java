package day0713;

public class Work0713 {

	public String random(int leng) {
	
		char [] all =new char[] {
				'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
				'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
				'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 's', 'y', 'z'};
		
		String createPassword="";
		StringBuffer sb=new StringBuffer();
		for(int i =0; i < leng ; i++) {
			int index = (int)(all.length*Math.random());
			sb.append(all[index]);
			createPassword = sb.toString();
		}//end for
		return createPassword;
	}//random
	
	public int number(int[] numArr) {
		
		int numRandom=numArr[0];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = (int)((Math.random()*45+1));
			System.out.print("["+(i+1)+"번방] "+numArr[i]+"\n");
		}//end for
			
		return numRandom;
		
	}//number
		
		
}//class
