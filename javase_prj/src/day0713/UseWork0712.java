package day0713;

/**
 * 백업파일명을 생성하는 일을 가진 클래스를 사용
 * @author user
 */
public class UseWork0712 {

	public void useBackupFileName() {
		
		String[] fileName={"original.txt", "", "original", "original.pptx"};

		Work0712 work=new Work0712();
		
//		String backupName=work.backupFileName(fileName);
		
		String backupName="";
		for(int i=0; i<fileName.length; i++) {
			backupName=work.backupFileName(fileName[i]);
		
		System.out.println("생성된 파일명: "+backupName);
		
		}
	}//useBackupFilName
	
	public static void main(String[] args) {
		
		new UseWork0712().useBackupFileName();

	}//main

}//class
