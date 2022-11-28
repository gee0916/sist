package day0727;

import java.io.File;

/**
 * 디렉토리 생성
 * @author user
 */
public class CreateDirectory {
	public CreateDirectory() {
//		File file=new File("e:/dev/temp/test");
//		boolean flag=file.mkdir();
		
		File file=new File("e:/kwak/wooshin");
//		boolean flag=file.mkdir();//부모디렉토리가 존재하지 않으면 하위 디렉토리가 생성되지 않는다.
		boolean flag=file.mkdirs();//부모디렉토리가 존재하지 않으면 부모디렉토부터 생성된다. 
											//하위 디렉토리가 생성되지 않는다.
		System.out.println("디렉토리 생성 : " +flag);
	}//CreateDirectory
	
	public static void main(String[] args) {
		new CreateDirectory();
	}//main
	
}//class
