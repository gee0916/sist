package day0628;

 /**
 * 입력하신 교통수단 XX이고, 이동거리는 XXKm이다
 * 교통수단의 기본요금은 XX입니다
 * 편도요금 XX원 왕복요금 XX원 한달 20일 기준잉용 총 이용요금 XX입니다
 * @author user
 */

public class Work0627 {

//	 교통요금은 한번 정해지면 자주변경되지 않기 때문에 상수로 처리
	public static final int TOWN_BUS=100; //마을버스 기본요금
	public static final int BUS=1250; //버스 기본요금
	public static final int SUBWAY=1300; //지하철 기본요금
	
	public static void main(String[] args) {

		if(args[0].equals("마을버스") || args[0].equals("버스") || args[0].equals("지하철")) { //마을버스, 버스, 지하철인 경우
			int distance=Integer.parseInt(args[1]); //거리
			int fare=0; //기본요금
			int overFare=0; //거리초과요금
			
			//입력교통수단의 기본 요금 설정된다
			switch (args[0]) {
			case "마을버스": fare=Work0627.TOWN_BUS; break;
			case "버스": fare=Work0627.BUS; break;
			case "지하철": fare=Work0627.SUBWAY; break;
			}//end switch
			
			if (distance>10) { //10Km를 초과한 경우 초과요금을 구하기0
				//매 5Km마다 기본요금 100원 가산
//				System.out.println("초과요금 대상");
				overFare=((distance-10)/5)*100;
				
			}//end if

			System.out.println("입력하신 교통 수단 [ "+args[0]+" ], 이동거리 [ "+ args[1]+"Km ]");
			System.out.println("[ "+args[0]+" ]의 기본요금 [ "+fare+"원 ]");
			System.out.println("편도요금[ "+(fare+overFare)+"원 ], 왕복요금 [ " +((fare+overFare)*2)+"원 ]");
			System.out.println("한달 20일 기준 총 이용요금 [ "+((fare+overFare)*40)+"원 ]");
			
		}else { //마을버스,버스, 지하철이 아닌 경우
			System.out.println(args[0]+"은(는) 대중 교통수단이 아닙니다.");
		}//end if
	
	}

}
