package day0627;

public class Work0627 {
	
	public static final int TBUS=800; //마을버스
	public static final int BUS=1250; //버스
	public static final int SUBWAY=13000; //지하철
	
	public static void main(String[] args) {
		
		String traffic=args[0]; //교통수단
		int distance=Integer.parseInt(args[1]); //거리		
		int pay=(((distance-10)/5)*100); // 요금

		switch(traffic) {
		
			case "마을버스": 
				System.out.println("입력한 교통수단은 "+traffic+"이고, 이동거리는 "+distance+"Km입니다.");
				System.out.println("교통수단의 기본요금은 "+TBUS+"원입니다."); 
				System.out.println("편도요금은 "+(TBUS+pay)+"원, 왕복요금은 "+((TBUS+pay)*2)+"원, 한달 20일 기준이용 총 이용요금은 "+(((TBUS+pay)*2)*20)+"입니다.");break;
		
			case "버스": 
				System.out.println("입력한 교통수단은 "+traffic+"이고, 이동거리는 "+distance+"Km입니다."); 
				System.out.println("교통수단의 기본요금은 "+BUS+"원입니다.");
				System.out.println("편도요금은 "+(BUS+pay)+"원, 왕복요금은 "+((BUS+pay)*2)+"원, 한달 20일 기준이용 총 이용요금은 "+(((BUS+pay)*2)*20)+"입니다.");break;
			
			case "지하철": 
				System.out.println("입력한 교통수단은 "+traffic+"이고, 이동거리는 "+distance+"Km입니다."); 
				System.out.println("교통수단의 기본요금은 "+SUBWAY+"원입니다.");
				System.out.println("편도요금은 "+(SUBWAY+pay)+"원, 왕복요금은 "+((SUBWAY+pay)*2)+"원, 한달 20일 기준이용 총 이용요금은 "+(((SUBWAY+pay)*2)*20)+"입니다.");break;
			default : 
				System.out.println("대중교통수단이 아닙니다.");
		}//end switch

		
	}//main

}//class
