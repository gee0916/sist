package day0705;

/**
 * String(문자열)의 사용
 * 문자열의 문자열 저장소에 저장된다 (같은 문자열은 하나만 생성되고 참조한다) 
 * @author user
 */
public class UseSpring {

	public static void main(String[] args) {
//		기본형 형식의 사용 (new를 사용하지 않음 String str="문자열";)
		String str="ABCD";
//		참조형 형식의 사용 (new 사용함 String str=new String("문자열"))
		String str1=new String("ABCD");
//		참조형 데이터형이지만 주소가 나오지 않는다
		System.out.println(str+" / "+str1);
		
//		기본형 형식은 문자열 저장소의 주소를 직접 저장
		System.out.println("기본형 형식 " + (str=="ABCD"));
//		참조형 형식은 heap의 주소를 저장
		System.out.println("참조형 형식 " + (str1=="ABCD"));
		
		System.out.println("기본형 형식 " + (str.equals("ABCD")));
		System.out.println("참조형 형식 " + (str1.equals("ABCD")));
		
		System.out.println("---------------------------------------");
		
		String eMail="hgee9816@gmail.com"; //기본형 형식
		String str2=new String("ABcdEf"); //참조형 형식
		
//		java.lang.String 클래스에서 제공하는 method는 어떤 형식으로 생성하든 사용가능하다
		System.out.println(eMail+"의 길이 "+eMail.length());
		System.out.println(str2+"의 길이 "+str2.length());
		
		System.out.println(str2+"를 모두 대문자로 "+str2.toUpperCase());
		System.out.println(str2+"를 모두 소문자로 "+str2.toLowerCase());
		
//		intdexOf는 Overload되어있다
//		문자열을 넣으면 문자열에 해당하는 시작인덱스를 반환
//		"Bcd"를 넣으면 B의 인덱스를 반환
		System.out.println(str2+"에서 \"Bcd\"문자의 인덱스 "+str2.indexOf("Bcd"));
//		indexOf는 찾는 문자나 문자열이 없을 때 -1이 나온다
		System.out.println(str2+"에서 K문자의 인덱스 "+str2.indexOf('K'));
		String tempMail="abcde@daum.net";
//		이 메일의 유효성 검증을 수행하는 코드 작성
//		유효성: '@'과 '.'이 있어야한다
//		'@','.'이 있다면 "유효메일"을 출력하고, 크렇지 않다면 "무효메일" 출력
		if(tempMail.indexOf('@')!=-1 && tempMail.indexOf('.')!=-1) {
			System.out.println("유효메일");
		} else {
			System.out.println("무효메일");
		}//end if
		
		String temp="AbcdAEFAT";
		System.out.println("indexOf L->R 진행: "+temp.indexOf("A"));
		System.out.println("lastIndexOf R->L 진행: "+temp.lastIndexOf("A"));
//		indexOf("찾을 문자열", 지나갈 인덱스)
		System.out.println("indexOf 중간의 문자찾기 L->R 진행: "
				+temp.indexOf("A", temp.indexOf("A")+1 ));
		
//		특정인덱스의 문자얻기
		char ch=temp.charAt(2); //존재하지 않는 인덱스를 넣으면 Error
		System.out.println(ch);
		
		temp="AbdeEfG";
//		01234567 <- String index
		System.out.println(temp+"에서 2~4(+1)번째 인덱스에 해당하는 자식 문자열 "
				+temp.substring(2,5));
		System.out.println(temp+"에서 1부터 끝까지 자르기 "+temp.substring(1));
		
//		hgee9816@gmail.com 자신의 이메일에서 메일주소와 domain주소 분리해 얻기
		System.out.println("메일주소: "+eMail.substring(0,eMail.indexOf("@"))+
				", domain주소: "+eMail.substring(eMail.indexOf("@")+1));
		
		str="정현지";
		temp="정희지";
		System.out.println(str+"은(는) '정'씨 입니까? "+str.startsWith("정"));
		System.out.println(temp+"은(는) '정'씨 입니까? "+temp.startsWith("정"));
		
		System.out.println(str+"은(는) '지'로 끝났나요? "+str.endsWith("지"));
		System.out.println(temp+"은(는) '지'로 끝났나요? "+temp.endsWith("지"));
		
		str="오늘은 무더운 화요일 입니다";
		temp="오늘은 무더운 수요일 입니다";
		System.out.println(str+"에 '화요일'이 포함되어있나요? "+str.contains("화요일"));
		System.out.println(temp+"에 '화요일'이 포함되어있나요? "+temp.contains("화요일"));
		
		str="너 지금 어디야?";
		if(temp.contains("XX")) {
			System.out.println("욕은 쓰실 수 없습니다");
		}else{
			System.out.println(str);
		}//end if
		
		temp="나 지금 집이야! 넌 어딘데? XX";
		if(temp.contains("XX")) {
			System.out.println("욕은 쓰실 수 없습니다");
		}else{
			System.out.println(str);
		}//end if

		str="AbcdeFg";
		System.out.println(str+"에서 \"cd\"를 \"Java\"로 치환: "+
				str.replace("cde", "Java"));
		
		System.out.println(temp.replace("XX", "**"));
		
		temp="너 어디야 임마";
		System.out.println(temp.replace("임", "*").replaceAll("마", "*"));
		
		temp="Java";
		System.out.println(temp.concat(" 완벽한 OOP언어"));
		System.out.println(temp+" 완벽한 OOP언어");
		
		str=null;
		temp="";
		if(str==null) {
			System.out.println("str이 주소를 할당받지 못한 상태");
		}//end if
		
		if(temp.isEmpty()) {
			System.out.println("temp가 주소를 할당받지 못한 상태");
		}//end if
		
		temp="   A bc   ";
		System.out.println("["+temp+"]["+temp.trim()+"]");
		System.out.println("["+temp+"]["+temp.replaceAll(" ","")+"]");
	
		int i=5;
		temp=String.valueOf(i);
		System.out.println(i+" / "+temp);
		
		
	}//main

}//class
