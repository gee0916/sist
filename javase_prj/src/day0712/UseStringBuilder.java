package day0712;

public class UseStringBuilder {

	public void UseStirngBuffer() {
		
//		1. 객체화
		StringBuffer sb=new StringBuffer();
		System.out.println("sb 용량: "+sb.capacity());
		
//		2. 값 추가
		sb.append("안녕"); //문자열 -> 문자열 추가
		sb.append(2022); //
		sb.append('년'); //
		
		System.out.println(sb);
		
//		3. 값을 이전에 문자열 사이에 넣기
//		안녕2022년
//		0123456
//		
		sb.insert(2, "임인년 ");
		sb.insert(2," ");
		sb.insert(7,"범띠 ");
		
//		"범띠"를 삭제. sb.delete(시작인덱스,끝인덱스+1)
		sb.delete(7, 10);
//		문자열 뒤집기
		sb.reverse();
		System.out.println("sb 용량: "+sb.capacity());
		System.out.println(sb);
		
	}//UseStringBuilder
	
	public void UseStirngBuilder() {
//		1. 객체화
		StringBuilder sb=new StringBuilder();
		System.out.println("sb 용량: "+sb.capacity());
		
//		2. 값 추가
		sb.append("안녕"); //문자열 -> 문자열 추가
		sb.append(2022); //
		sb.append('년'); //
		
		System.out.println(sb);
		
//		3. 값을 이전에 문자열 사이에 넣기
//		안녕2022년
//		0123456
//		
		sb.insert(2, "임인년 ");
		sb.insert(2," ");
		sb.insert(7,"범띠 ");
		
//		"범띠"를 삭제. sb.delete(시작인덱스,끝인덱스+1)
		sb.delete(7, 10);
//		문자열 뒤집기
		sb.reverse();
		System.out.println("sb 용량: "+sb.capacity());
		System.out.println(sb);
		
		
	}//UseStringBuilder

	@Override
	public String toString() {
		return "이제부터 주소가 아닌 값이 출력됩니다. "+super.toString();
	}
	
	public static void main(String[] args) {
		
		UseStringBuilder usb=new UseStringBuilder();
		System.out.println(usb);
		usb.UseStirngBuffer();
		System.out.println("---------------------------");
		usb.UseStirngBuilder();

//		긴 문자열은 String을 사용하지 않고 StringBuilder를 사용한다
//		긴 문자열은 문자열을 +로 이어붙인 문자열. 컴파일을 하면 StringBuilder가 생성되어
//		문자열이 붙여진다
		String str="안녕하세요?";
		str+="오지고";
		System.out.println(str+"지리고,");
		
		StringBuilder sb=new StringBuilder();
		sb.append("오지고").append("지리고");
		System.out.println(sb);
		
	}//main

}//class
