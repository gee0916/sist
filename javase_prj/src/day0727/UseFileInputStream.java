package day0727;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * HDD에 존재하는 파일과 JVM에 올라온 인스턴스(객체)를 연결하기위해서
 *   FileStream을 사용한다.
 *   8bit stream => FileInputStream 사용.
 * @author user
 */
public class UseFileInputStream {

	public UseFileInputStream()throws FileNotFoundException,IOException {
		FileInputStream fis=null;
		try {
			//1. HDD에 존재하는 파일과 연결.
			fis=new FileInputStream("e:/dev/temp/java_read.txt");
//			System.out.println( (char)fis.read() );
//			System.out.println( (char)fis.read() );
			
			//read() 읽어들인 데이터가 없다면 -1을 반환한다. -1 (EOF)
			int readData=0;
			//2. 파일을 1byte씩 읽기
			while( (readData=fis.read()) != -1 ) { //읽어들인 데이터가 존재한다면 반복한다.
				System.out.print( (char)readData );
			}//end while
			
		} finally {
			//스트림은 메모리 누수를 막기위해 반드시 끊어져야한다.
			//3. 연결끊기
			if(fis != null) { fis.close(); }//스트림 사용이 종료되었다면 메모리 누수를 막기위해 반드시 끊는다.
		}//end finally
		
	}//UseFileInputStream
	
	public static void main(String[] args) {
		try {
			new UseFileInputStream();
		} catch (FileNotFoundException fnfe) {
			 System.err.println("파일이 없어요");
			fnfe.printStackTrace();
		} catch (IOException ie) {
			System.err.println("입력에 대한 문제가 발생했어요");
			//생성자안에서 발생하는 모든 IOException을 모아서 처리할 수 있다.
			ie.printStackTrace();
		}
	}//main

}//class
