package day0727;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 입력된 파일의 정보를 얻거나, 조작(rename, 삭제), 디렉토리를 생성 하는 일을 하는 클래스의 사용.
 * @author user
 */
public class UseFile {
	
	public UseFile() {
		//1. 생성
		File file=new File("e:/dev/temp/java_read.txt");
		System.out.println( file);// File 클래스가 Object클래스의 toString()를 Override해서.
		System.out.println("파일이 존재 함? "+ file.exists());
		if(file.exists()) {
			long leng=file.length();
			System.out.println("파일의 크기 : "+ leng +"byte");
			System.out.println("폴더인가?  "+ file.isDirectory() );
			System.out.println("파일인가?  "+ file.isFile() );
			System.out.println("읽기 가능?  "+ file.canRead() );//읽기 권한이 있는 파일인지
			System.out.println("쓰기 가능?  "+ file.canWrite() );//쓰기 권한이 있는 파일인지
			System.out.println("실행 가능?  "+ file.canExecute() );//실행 권한이 있는 파일인지
			System.out.println("숨김파일인가?  "+ file.isHidden() );
			
			try {
				//OS에서 파일에 접근하기위한 유일한 경로 : 드라이브명은 대문자로만 접근 가능
				System.out.println("규범경로 : "+file.getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
			//절대경로는 드라이브명이 대문자,소문자 모두 접근가능
			System.out.println("절대경로 : "+file.getAbsolutePath());
			System.out.println("경로 "+ file.getPath());
			System.out.println("경로명 "+ file.getParent());
			System.out.println("파일명 "+ file.getName());
			long lastModified=file.lastModified();
			System.out.println("마지막수정일 "+ lastModified);
			
			Date date=new Date( lastModified );
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("마지막수정일 :"+ sdf.format(date));
			
			//파일명 변경.
			//1. 변경할 이름을 가진 파일 객체 생성
//			File rename=new File("e:/dev/temp/a.txt");
//			//2. 변경 :  원본객체.renameTo( 변경할이름을가진 파일객체 )
//			boolean flag=file.renameTo( rename );
//			System.out.println("파일변경 "+ flag);
			
			//파일삭제.
			boolean flag=file.delete();
			System.out.println("파일삭제 : "+ flag);
			
		}else {
			System.out.println("경로와 파일명을 확인하세요.");
		}//end if
		
	}//UseFile

	public static void main(String[] args) {
		new UseFile();
	}//main

}//class
