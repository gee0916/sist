package day0801;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * 1. 서버소켓을 열어서 (PORT열림)
 * 2. 접속자소켓을 받아 (accept)
 * 3. 출력스트림을 소켓에서 얻고
 * 4. 문자열을 보낼 수 있는 Stream을 확장하여
 * 5. 코드값으로 변환한 문자열을 Stream에 쓴다
 * 6. 스트림의 내용을 목적지(소켓)로 분출하면 회선, 확립된 접속자 소켓으로 전달된다
 * @author user
 *
 */
public class SimpleServer {

	public SimpleServer() throws IOException {
//		 * 1. 서버소켓을 열어서 (PORT열림)
		ServerSocket server=new ServerSocket(65500);
		System.out.println("서버 가동 중 ...");
		Socket someClient=null;
		DataOutputStream writeStream=null; //접속자에게 메시지를 보낼 스트림
		DataInputStream readStream=null; //접속자으 메시지를 받을 스트림
		String revMsg=""; //접속자가 보내오는 메시지를 저장하기 위한 변수
		while(true) {
//		 * 2. 접속자소켓을 받아 (accept)
			try {
				someClient=server.accept();
//		 * 3. 출력스트림을 소켓에서 얻고
//		 * 4. 문자열을 보낼 수 있는 Stream을 확장하여
				writeStream=new DataOutputStream(someClient.getOutputStream());
//		 * 5. 코드값으로 변환한 문자열을 Stream에 쓴다
				String msg="211.63.89.149번 정현지의 서버로 접속하였습니다";
				writeStream.writeUTF(msg);
//		 * 6. 스트림의 내용을 목적지(소켓)로 분출하면 회선, 확립된 접속자 소켓으로 전달된다
				writeStream.flush();
				///////////////////////////////////////////////////////	
				//접속자가 보내오는 메시지를 읽기위한 스트림을 소켓에서 얻는다
				readStream=new DataInputStream(someClient.getInputStream());
				//접속자가 보내오는 메시지 읽기
				revMsg=readStream.readUTF();
				//출력
				JOptionPane.showMessageDialog(null, "접속자의 메시지"+revMsg);
			}finally {
				if(someClient!=null) {
					someClient.close();
				}//end if
			}//end finally
		} //end while	
			
	}//SimpleServer
	
	public static void main(String[] args) {
		try {
			new SimpleServer();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}//main	

}//class
