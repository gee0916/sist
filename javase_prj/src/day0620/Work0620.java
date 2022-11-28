package day0620;
class Work0620{
	public static void main(String[] args) {

	//출력 1
	int nowYear=2022;
	int bornYear=1998;
	char j1='J';
	char h='H';
	char j2='J';
	System.out.println("내 이름은 정현지이고 이니셜은 "+j1+h+j2+"입니다.");
	System.out.println("태어난 해는 "+bornYear+"년으로");
	System.out.println("나이는 "+(nowYear-bornYear+1)+"살입니다.");

	//출력 2
	double leftEye=0.3;
	double rightEye=0.5;
	System.out.println("왼눈 시력은 "+leftEye+" 오른눈 시력은 "+rightEye+" 양안시력은 "+((leftEye+rightEye)/2)+"입니다.");

	}
}
