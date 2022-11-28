package day0712;

//import java.io.*;

public class Work0712 {
	
	public String fileName(String name) {
		
		if (1<=name.length()) {
			if(name.endsWith(".txt")==false) {
				return name+"_backup";
			}
		} 
		return name;
	}//fileName
	
	public static void main(String[] args) {
		
		Work0712 w=new Work0712();
		String backupFile=w.fileName("abc.txt");
		System.out.println(backupFile);
	
	}//main

}//class
