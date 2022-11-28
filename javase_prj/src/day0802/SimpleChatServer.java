package day0802;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * 메시지를 무한루프로 동시에 읽어들이기 위해  Thread를 도입
 * @author user
 *
 */
@SuppressWarnings("serial")
public class SimpleChatServer extends JFrame implements ActionListener, Runnable {

	private JTextArea jtaTalkDisplay;
	private JScrollPane jspTalkDisplay;
	private JTextField jtfTalk;
	private JButton jbtnServerStart;
	
	private String nick;
	
	private ServerSocket server; // 포트를 열고, 접속자 소켓을 받을 때
	private Socket client; // 접속하는 접속자 소켓을 저장하고, 스트림을 얻을 때
	private DataInputStream readStream; //접속자가 보내오는 메시지를 받을 때
	private DataOutputStream writeStream; //접속자에게 보낼 메시지를 쓸 때
	
	public SimpleChatServer() {
		super(":::::::::::::::::채팅서버:::::::::::::::::::::::::::::::::::");
		
		jtaTalkDisplay=new JTextArea();
		jspTalkDisplay=new JScrollPane( jtaTalkDisplay );
		jtaTalkDisplay.setEditable(false);
		jtaTalkDisplay.setBorder(new TitledBorder("대화"));
				
		jtfTalk=new JTextField();
		jtfTalk.setBorder(new TitledBorder("입력"));
		
		jbtnServerStart=new JButton("서버실행");
		
		JPanel jpNorth=new JPanel();
		jpNorth.add(jbtnServerStart);
		
		jbtnServerStart.addActionListener(this);
		jtfTalk.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				//윈도우가 종료되면 스트림을 닫고, 소켓을 닫고, 서버소켓을 닫아야한다
				try {
					if(readStream!=null) {readStream.close();}//end if
					if(writeStream!=null) {writeStream.close();}//end if
					if(client!=null) {client.close();}//end if
					if(server!=null) {server.close();}//end if
				}catch(IOException ie) {
					ie.printStackTrace();
				}finally {
					dispose();
				}//end finally
			}//windowClosing

			@Override
			public void windowClosed(WindowEvent e) {
				//실행중인 JVN에 관련있는 모든 인스턴스를 죽이고, JVM이 종료된다
				super.windowClosed(e);
			}
			
			
		});
		
		add("North",jpNorth);
		add("Center",jspTalkDisplay);
		add("South",jtfTalk);
		
		setBounds(100, 100, 600, 700);
		setVisible(true);
		
	}//SimpleChatServer
	
	/**
	 * 스트림에서 메시지를 무한루프로 읽어 들인다
	 * @throws IOException 
	 */
//	@SuppressWarnings("unused")
//	private void readMsg() throws IOException {
	@Override
//	2. run method를 Override
	public void run() {	
		String revMsg="";
		try {
			while(true) {
			//입력스트림을 사용하여 접속자가 보내오는 메시지를 읽어들여
				revMsg=readStream.readUTF();
			//채팅대화창에 출력한다
				jtaTalkDisplay.append(revMsg+"\n");
			} //end while
		}catch (IOException ie) {
			JOptionPane.showMessageDialog(this, "접속자가 접속을 종료했습니다");
			ie.printStackTrace();
		}
	}//readMsg
	
	/**
	 *  JTextfield에서 이벤트가 발생하면 출력스트림을 사용하여 메시지를 소켓에 분출한다
	 * @throws IOException 
	 */
	private void sendMsg() throws IOException {
		//대화가 입력되면 대화를 접속자에 보낸다
		String talk=jtfTalk.getText();
		if (!talk.trim().equals("")) {
			//내 대화창에 대화를 올린다
			jtaTalkDisplay.append(nick+" "+talk+"\n");
			//대화를 스트림에 기록하고
			writeStream.writeUTF(talk);
			//스트림의 내용을 목적지로 분출
			writeStream.flush();
		}//end if
		//대화 입력창을 초기화해준다
		jtfTalk.setText("");
	}//sendMsg
	
	/**
	 * 서버소켓을 생성하여 포트를 열고, 접속자 소켓을 받아, 스트림을 연결하고, 메시지를 무한루프로 읽어 들인다
	 * @throws IOException 
	 */
	private void startToServer() throws IOException {
		//1. 서버소켓 생성
		if(server==null) {
			server=new ServerSocket(50000);
			jtaTalkDisplay.setText("서버 가동 중 \n 접속자가 들어오기를 대기합니다 \n");
			
			nick=JOptionPane.showInputDialog("대화명을 입력해주세요");
			//2. 접속자 소켓 받기
			client=server.accept();
			//3. 스트림 연결 
			readStream=new DataInputStream(client.getInputStream()); //읽기 위한 스트림
			writeStream=new DataOutputStream(client.getOutputStream()); //쓰기 위한 스트림
			jtaTalkDisplay.append("채팅상대가 접속 하였습니다\n");
			//메시지를 무환루프로 읽어 들인다
//			readMsg();
			////////has a  관계로 Thread 실행/////////////////////////////////////
			//4. Thread 클래스를 has a 관계로 생성
			Thread t=new Thread(this);
			//start(); // 호출 
			t.start(); // run() 호출
		}else {
			JOptionPane.showMessageDialog(this, "서버가 이미 가동 중입니다");
		}
	}//startToServer
	
	@Override
	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource()==jbtnServerStart) { // 서버 가동 버튼이 클릭되면
			try {
				startToServer();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "서버에서 문제 발생");
				e.printStackTrace();
			}
		}//end if
		
		if(ae.getSource()==jtfTalk) { //대화입력 버튼에서 엔터키가 눌려지면
			try {
				sendMsg();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "접속자가 연결을 끊었습니다");
				e.printStackTrace();
			}
		}//end if
		
	}//actionPerformed

	public static void main(String[] args) {
		new SimpleChatServer();
	}//main

}//class
