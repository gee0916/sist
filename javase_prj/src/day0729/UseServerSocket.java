package day0729;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ServerSocket : PORT열고 접속자 소켓(클라이언트)이 접속하기를 기다렸다가(accept)
 *    접속자 소켓이 들어오면 접속자소켓을 받아 저장(반환)하는 일 
 *     
 * @author user
 */
public class UseServerSocket {

	public UseServerSocket() {
		//1.서버소켓을 생성하여 PORT(0~65535)를 연다. 
		try {
			ServerSocket server=new ServerSocket(5555);
			System.out.println("서버가 열렸습니다.");
			//3.접속자가 접속하기를 기다렸다가, 접속자가 들어오는 것을 허가하여 받는다.
			Socket client=null;
			while(true) {
			 client=server.accept();
			 System.out.println("접속자가 접속하였습니다. "+client);
			}//end while
			
//			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//UseServerSocket

	public static void main(String[] args) {
		new UseServerSocket();
	}//main

}//class
