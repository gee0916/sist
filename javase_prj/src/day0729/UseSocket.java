package day0729;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

/**
 * 클라이언트 자신의 임의의 PORT를 열고, 지정한 서버로 접속을 시도
 * @author user
 */
public class UseSocket {
	
	public UseSocket() {
		//2. 서버의 주소와 포트를 설정하여 클라이언트 소켓을 생성한다.
		try {
			String ip=JOptionPane.showInputDialog
					("접속할 서버 ip address\n가용 ip adress : 130,132,133,134,154,137,139,140,141,142,143,144,145,148,149,150,151,152,153");
			Socket client=new Socket("211.63.89."+ip, 5555);
			System.out.println("서버로 접속하였습니다. ");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//UseSocket

	public static void main(String[] args) {
		new UseSocket();
	}//main

}//class
