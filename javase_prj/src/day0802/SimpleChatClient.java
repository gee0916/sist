package day0802;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
//1. Runnable을 구현
public class SimpleChatClient extends JFrame implements ActionListener, Runnable {

	private JTextArea jtaTalkDisplay;
	private JScrollPane jspTalkDisplay;
	private JTextField jtfTalk;
	private JButton jbtnConnect;
	
	private Socket client; //서버에 연결할 소켓
	private DataInputStream readStream; //서버에서 제공하는 메시지를 읽어들이기위한 스트림
	private DataOutputStream writeStream; //서버로 메시지를 보내기 위한 스트림
	
	private String nick;
	
	private Thread thread;
	public SimpleChatClient() {
		super(":::::::::::::::::채팅클라이언트:::::::::::::::::::::::::::::::::::");
		
		jtaTalkDisplay=new JTextArea();
		jspTalkDisplay=new JScrollPane( jtaTalkDisplay );
		jtaTalkDisplay.setEditable(false);
		jtaTalkDisplay.setBorder(new TitledBorder("대화"));
				
		jtfTalk=new JTextField();
		jtfTalk.setBorder(new TitledBorder("입력"));
		
		jbtnConnect=new JButton("서버접속");
		
		JPanel jpNorth=new JPanel();
		jpNorth.add(jbtnConnect);
		
		jbtnConnect.addActionListener(this);
		jtfTalk.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				//스트림 닫고, 소켓을 닫기
				try {
					if(readStream!=null) {readStream.close();}//end if
					if(writeStream!=null) {writeStream.close();}//end if
					if(client!=null) {client.close();}//end if
				}catch(IOException ie) {
					ie.printStackTrace();
				}finally {
					dispose();
				}//end finally
			}//windowClosing

			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(JFrame.ABORT);
			}//windowClosed
			
			
			
		});
	
		add("North",jpNorth);
		add("Center",jspTalkDisplay);
		add("South",jtfTalk);
		
		jtfTalk.requestFocus();
		setBounds(100, 100, 600, 700);
		setVisible(true);
		
	}//SimpleChatClient
	
//	private void readMsg() throws IOException {
	@Override
//	2. run method를 Override
	public void run() {
		String revMsg="";
		try {
			while(true) {
				//3. Thread로 처리되어야할 코드 작성
				//서버에서 보내오는 메시지를 무한 루프로 읽는다
				revMsg=readStream.readUTF();
				//대화창에 메시지를 출력한다
				jtaTalkDisplay.append(revMsg+"\n");
			}//end while
		} catch (IOException ie) {
			JOptionPane.showMessageDialog(this, "접속자가 접속을 종료하였습니다");
			ie.printStackTrace();
		}
	}//readMsg
	
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
		jtfTalk.setText("");
	}//sendMsg
	
	private void connectToServer() throws UnknownHostException, IOException {
		if(thread==null) { //서버에 접속되지 않은 상태
			String ip=JOptionPane.showInputDialog
					("접속할 서버 ip address\n가용 ip adress : 130,132,133,134,154,137,139,140,141,142,143,144,145,148,149,150,151,152,153");
			nick=JOptionPane.showInputDialog("대화명 입력");
			//1. 소켓을 열어서 서버에 연결시도
			client=new Socket("211.63.89."+ip,50000);
			//2. 스트림을 소켓으로 부터 얻기
			readStream=new DataInputStream(client.getInputStream());
			writeStream=new DataOutputStream(client.getOutputStream());
			//3. 서버에서 보내는 메시지를 무한 루프로 읽기
	//		readMsg();
			//4. Thread를 현재 클래스와 has a 관계로 객체 생성
			thread=new Thread(this);
			//5. run() 호출
			thread.start();
			} else { //서버에 접속한 상태
			JOptionPane.showMessageDialog(this, "서버에 접속하였습니다.");
		}//end else
		
	}//connectToServer
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==jbtnConnect) { //서버접속버튼 클릭
			try {
				connectToServer();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
		}//end if
		
		if(ae.getSource()==jtfTalk) { // 대화가 입력되었을 때
			try {
				sendMsg();
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
		}//end if
	}//actionPerformed

	public static void main(String[] args) {
		new SimpleChatClient();
	}//main

}//class
