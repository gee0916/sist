package day0711;

public class UseCats {

	public static void main(String[] args) {

		HaengBogi hb=new HaengBogi();
		
		hb.setName("행복이");
		hb.setType("코리안숏헤어");
		System.out.printf("이름: %s (눈 %d개, 코 %d개, 입 %d개, 꼬리 %d개) 종: %s\n",
				hb.getName(), hb.getEye(), hb.getNose(), hb.getMouth(), hb.getTail(), hb.getType());
		System.out.println(hb.favoritePlay("낚시대 장난감"));
		System.out.println(hb.favoriteSnack("치킨 또는 참치통조림")); //부모에서 제공하는 기능이 맞지않는다
		System.out.printf("%s의 몸무게는 성인묘 기준 %s",hb.getName(), hb.kg(5.6)); //6->7
	}//main

}//class
