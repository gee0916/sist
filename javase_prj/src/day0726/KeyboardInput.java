package day0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Keyboard Buffer에 입력된 값을 받기위해 IOStream 중 InputStream 사용.
 * InputStream은 8bit 읽기전용스트림.
 * @author user
 */
public class KeyboardInput {
	
	public KeyboardInput() {
		
		System.out.println("아무키나 누르고 엔터를 치세요.");
		try {
//			int value=0;
//			while(value != 13) {
//				value=System.in.read();
////				System.out.println("입력값 : "+ value);
//				System.out.print((char)value);
//			}//end while
			
			//스트림 연결
//			//8bit Stream 얻기
//			InputStream is=System.in;
//			//8bit Stream과 16bit Stream 연결
//			InputStreamReader isr=new InputStreamReader(is);
//			//16 bit stream과 16 bit stream 연결
//			BufferedReader br=new BufferedReader(isr);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			String msg=br.readLine();// 16bit Stream을 사용하여 줄 단위로 읽어들인다.
			System.out.println( msg );
			
		} catch (IOException e) {
			System.err.println("키보드에서 입력받을 수 없습니다.");
			e.printStackTrace();
		}
		
	}//KeyboardInput

	public static void main(String[] args) {
		new KeyboardInput();
	}//main

}//class
