package day0728;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileCopyEvent extends WindowAdapter implements ActionListener {

	private FileCopy fc;
	
	public FileCopyEvent( FileCopy fc) {
		this.fc=fc;
	}//FileCopyEvent
	
	@Override
	public void windowClosing(WindowEvent e) {
		fc.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		fileCopy();
	}//actionPerformed
	
	private void fileCopy() {
		String path=openFileDialog();
		if( path != null ) { //파일을 선택했다면
			File originalFile=new File(path);// 선택한 경로로 파일 객체 생성
			
			int jobFlag=JOptionPane.showConfirmDialog(fc, originalFile.getName()+"을 복사하시겠습니까?");
			switch(jobFlag) {
			case JOptionPane.OK_OPTION :
				if( originalFile.exists() ) { //선택한 경로에 파일이 존재하면
					//복사할 파일명을 생성 : 복사할 파일명은 originalFile명 _bak 들어간 이름으로생성
					StringBuilder backupName=new StringBuilder( originalFile.getAbsolutePath() );
					backupName.insert(backupName.lastIndexOf("."), "_bak");
					
					File copyFileName=new File( backupName.toString() );
					
					//예) 원본 test.xt => 복사본 test_bak.txt
					StringBuilder copyResult=new StringBuilder();
					copyResult.append(originalFile.getName());
					
					try {
						fileCopyProcess(originalFile, copyFileName);
						copyResult.append(" 파일을 복사하였습니다.");
							
					}catch(IOException ie) {
						copyResult.append(" 파일 복사 중 문제 발생. 잠시 후 다시 시도");
						ie.printStackTrace();
					}//end catch
					
					JOptionPane.showMessageDialog(fc,  copyResult.toString());
					
				}//end if
			}//end switch
		}//end if
		
	}//fileCopy
	
	//1. 파일을 선택하도록 다이얼로그를 띄우는 일.
	private String  openFileDialog() {
		String fileName=null;
		
		FileDialog fdOpen=new FileDialog(fc,"파일 선택",FileDialog.LOAD );
		fdOpen.setVisible(true);
		
		String path=fdOpen.getDirectory();//선택한 경로
		String name=fdOpen.getFile(); //선택한 파일명
		
		if( path != null && name != null ) {//파일 선택하고 확인
			fileName=path+name;
		}//end if
		
		return fileName;
	}//openFileDialog
	
	//2. 선택한 파일을 복사하는 일.
	private void fileCopyProcess(File originalFile, File copyFile)throws IOException {
		
		FileInputStream fis=null; //파일을 읽기위한 스트림
		FileOutputStream fos=null;//파일에 저장하기위한 스트림
		
		try {
			//1.스트림을 연결
			fis=new FileInputStream( originalFile);
			fos=new FileOutputStream(copyFile);
////////////HDD의 물리적인 동작을 이해하지 않고 만든 코드 => 동작은 하나 효율이 떨어짐./////////////////////////
			//2.연결된 스트림에서 데이터읽기
//			int byteData=0;
//			while( (byteData=fis.read()) != -1 ) {
//			//3.읽어들인 데이터를 쓰기
//				fos.write(byteData);
//			}//end while
			
			
////////////HDD의 물리적인 동작을 이해하고 만든 코드 => 효율향상/////////////////////////
			//HDD 헤드는 한번에 평균적으로 512 byte씩 읽어 들인다
			byte[] readData=new byte[512]; //512byte를 저장할 배열을 만든다.
			int readByteCount=0;// 읽어들인 byte의 수를 저장할 변수
			while( (readByteCount=fis.read(readData)) != -1 ) {
//				System.out.println("읽어들인 byte 수 : " + readByteCount);
				//readData배열에서 0번째 방부터 읽어들인 배열의 수만큼 F.O.S에 쓴다.
				fos.write(readData, 0, readByteCount); 				
			}//end while
			
			//4.스트림에 남아있는 데이터를 목적지로 분출
			fos.flush();
		}finally {
			//5.연결 끊기
			if( fis != null ) { fis.close(); }//end if
			if( fos != null ) { fos.close(); }//end if
		}//end finally
		
	}//fileCopyProcess
}//class
