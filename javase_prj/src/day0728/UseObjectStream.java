package day0728;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UseObjectStream {

	public void useObjectOutputStream() throws  IOException {
		//객체를 파일로 내보기위해서  ObjectOutputStream, FileOutputStream생성
		ObjectOutputStream oos=null;
		try {
			//1. 목적에 맞는 스트림생성
			oos=new ObjectOutputStream(new FileOutputStream("e:/dev/temp/obj.dat"));

			MyData md=new MyData("김강현", 25, 182.5, 72.4);
			//2.스트림 사용.
			oos.writeObject(md);
			
			//3. 스트림의 내용을 목적지로 분출
			oos.flush();
			System.out.println("객체가 JVM외부의 파일에 저장되었습니다.");
		}finally {
			//4. 스트림 닫기
			if( oos != null ) { oos.close(); }//end if
		}//end finally
	}//useObjectOutputStream
	
	public void useObjectInputStream() throws IOException, ClassNotFoundException {
		ObjectInputStream ois=null;
		
		try {
		//1.목적에 맞는 스트림 생성 => 파일에 기록된 객체를 읽어 들이는 것
		ois=new ObjectInputStream( new FileInputStream("e:/dev/temp/obj.dat"));
		//2. 스트림사용.
		MyData md=(MyData)ois.readObject();	
		System.out.println("읽어들인 객체 : "+ md);
		}finally {
		//3. 스트림닫기
			if( ois != null) { ois.close(); }//end if
		}//end finally
	}//useObjectInputStream
	
	public static void main(String[] args) {
		UseObjectStream uos=new UseObjectStream();
		
//		try {
//			uos.useObjectOutputStream();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			uos.useObjectInputStream();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//main

}//class
