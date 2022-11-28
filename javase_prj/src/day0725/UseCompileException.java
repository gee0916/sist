package day0725;

/**
 * CompileException : 코드작성 시 발생되는 예외를 JVM이 처리하지 않는 예외.
 *  개발자가 반드시 try~catch 예외상황에 대한 처리를 해야한다.
 *   ( 코드 작성에 에러가 발생하기 때문에 개발자가 놓칠 수 없다.)
 * @author user
 */
public class UseCompileException {
	
	@SuppressWarnings("rawtypes")
	public UseCompileException() {
		//다른 클래스를 로딩하여 사용.
			try {
				//Class obj=Class.forName("java.lang.String");
				Class obj=Class.forName("day0722.EventCompare2");
				System.out.println(obj+"로딩성공");
			} catch (ClassNotFoundException cnfe) {
				System.err.println("클래스가 존재하지 않습니다. 패키지명 또는 클래스명을 확인해 주세요.");
				cnfe.printStackTrace();
			} catch(Exception e) {
				System.err.println("개발자가 인지하지못한 예외");
			}finally {
				System.out.println("반드시 실행되어야할 코드");
			}//end finally
		
	}//UseCompileException

	public static void main(String[] args) {
		new UseCompileException();
	}//main

}//class
