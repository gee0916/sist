package day0801;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

/**
 * 1. 소켓을 생성하여 서버에 연결하여
 * 2. 읽기스트림을 사용하여
 * 3. 소켓에 저장된 서버의 메시지 읽고
 * @author user
 */
public class SimpleClient {

	public SimpleClient() throws UnknownHostException, IOException {
		String ip=JOptionPane.showInputDialog
				("접속할 서버 ip address\n가용 ip adress : 130,132,133,134,154,137,139,140,141,142,143,144,145,148,149,150,151,152,153");
//		* 1. 소켓을 생성하여 서버에 연결하여
		Socket client = null;
		DataInputStream dis=null; //서버의 메시지를 읽기위한 스트림
		DataOutputStream dos=null; //서버로 메시지를 보내기 위한 스트림
		String sendMsg="";
		try{
			client=new Socket("211.63.89."+ip,65500);
//		* 2. 읽기스트림을 사용하여
			dis=new DataInputStream(client.getInputStream());
//		* 3. 소켓에 저장된 서버의 메시지 읽고
			String revMsg=dis.readUTF();
//		* 4. 읽어들인 메시지를 출력한다
//			JOptionPane.showMessageDialog(null, revMsg);
			////////////////////////////////////////////////
			//서버로 메시지를 보내기위한 스트림을 소켓에서 얻기
			dos=new DataOutputStream(client.getOutputStream());
			//읽어들인 메시지를 출력하고, 입력한 메시지를 받는다
			sendMsg=JOptionPane.showInputDialog(revMsg);
			//입력받을 메시지를 출력 스트림에 쓰기
			dos.writeUTF(sendMsg);
			//목적지 소켓으로 분출 (서버에서 연결하고 있는 소켓)
			dos.flush();
		}finally {
			if(client!=null) {
				client.close();
			}//end if
		}//end finally
		
	}//SimpleClient
	
	public static void main(String[] args) {
		try {
			new SimpleClient();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}//main

}//class
