package day0621;
class Work0621{
	public static final int MONEY=500000; //용돈
	public static final int DAY=20; //일수

	public static void main(String[] args) {

		int fee=2850; //편도 교통비
		int cost=7000; //점심 식대

		System.out.println("한달 용돈은 "+ Work0621.MONEY+"원"+" 하루 용돈은 "+ Work0621.DAY+"일 기준으로 " +(Work0621.MONEY/Work0621.DAY)+"원 입니다.");
		System.out.println("하루 사용 비용은 편도 교통비 "+ fee + "원," + " 왕복교통비 "+ (fee*2) + "원, 점심식대 " + cost + "원으로 총 " + ((fee*2)+cost) + "원 입니다." );
		System.out.println("한달이 지나면 남은 금액은 "+ (Work0621.MONEY-(((fee*2)+cost)*Work0621.DAY)) + "원 입니다.");

	}
}
