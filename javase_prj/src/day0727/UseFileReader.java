package day0727;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 * File과 연결하여 파일의 내용을 줄 단위로 읽어 들일 수 있는  16bit스트림의 사용. 
 * @author user
 */
public class UseFileReader {
	
	public UseFileReader() throws FileNotFoundException, IOException{
		BufferedReader br=null;
		try {
			//1.파일과 연결
			br=new BufferedReader(new FileReader("e:/dev/temp/java_read.txt"));
			//2.파일의 내용 줄 단위로 읽기. (\n전까지)읽어들인 내용이 없다면 null이 나온다. null-(EOF)
			//System.out.println( br.readLine() );
			String readData="";
			int cnt=0;
			StringBuilder viewData=new StringBuilder();
			while( (readData=br.readLine()) != null ) {//읽어들인 라인이 존재한다면 반복.
				cnt++;
				System.out.println(cnt+" "+readData);
				viewData.append(readData).append("\n");
			}//end while
			
			JTextArea jta=new JTextArea(10,50);
			JScrollPane jsp=new JScrollPane( jta );
			jsp.setBorder(new TitledBorder("파일에서 읽은 내용"));
			jta.setText(viewData.toString());
			
			JOptionPane.showMessageDialog(null, jsp);

		}finally {
		//3.연결 끊기
				br.close();
		}//end finally
	}//UseFileReader

	public static void main(String[] args) {
		try {
			new UseFileReader();
			//예외를 날려 작업 코드와 예외처리 코드를 분리하였다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}//main

}//class
