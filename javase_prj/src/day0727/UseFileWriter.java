package day0727;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 *  JVM의 내용을 HDD 파일로 쓰기.
 * @author user
 */
public class UseFileWriter {

	public UseFileWriter()throws IOException {
		File path=new File("e:/dev1/temp/");
		//디렉토리가 존재하지 않으면 생성.
		if( !path.exists() ) {
			path.mkdirs();
		}//end
		File file=new File(path.getAbsolutePath()+"/write.txt");
//		System.out.println(file );
		boolean createFlag=false;
		//////////////////////////////////제어시작///////////////////////////////////////////////////////////////////
	//디렉토리에 파일이 없다면 파일을 생성하고, 디렉토리에 파일이 있다면 덮어쓸것인지 묻자.
		if( file.exists()) {//덮어쓸것인지?
			int selectFlag=JOptionPane.showConfirmDialog(null, 
					file.getAbsolutePath()+"가 존재합니다. 덮어쓰시겠습니까?","앗! 중복파일입니다."
					,JOptionPane.OK_CANCEL_OPTION);
			switch (selectFlag) {
			case JOptionPane.OK_OPTION: // 덮어씀
				createFlag=true;
//				break;
//			case JOptionPane.NO_OPTION:// 파일을 만들지 않음
//				createFlag=false;
			}//end catch
		}else {//파일을 만듬
			createFlag=true;
		}//end else
		/////////////////////////////////////제어 끝////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////제어에 의해 실행 되는 작업////////////////////////////////////////////////////////////////
		if( createFlag ) {
			FileWriter fw=null;
			try {
				//1. 파일에 스트림 연결.
				fw=new FileWriter(file); //해당경로에 파일이 없다면 파일을 생성하고, 
				//파일이 있다면 덮어쓴다.
				//2.스트림에 데이터를 쓰고
	//			fw.write(97); // 스트림에 숫자(데이터)를 쓰고
				String data="오늘은 27일 수요일 입니다.111111111";
				fw.write(data);
				//3.스트림에 내용을 목적지로 분출
				fw.flush(); //스트림의 내용을 목적지로 분출
			}finally {
				//4.연결끊기
				if( fw != null ) { fw.close(); }//스트림의 내용을 목적지로 분출하고 스트림을 끊는다.
			}//end finally
		}//end if
		/////////////////////////////////////제어에 의해 실행 되는 작업끝////////////////////////////////////////////////////////////////
	}//UseFileWriter
	
	public static void main(String[] args) {
		try {
			new UseFileWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
