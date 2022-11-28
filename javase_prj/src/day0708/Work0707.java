package day0708;

public class Work0707 {
	
	public static final int JAVA=0;
	public static final int ORACLE=1;
	public static final int JSP=2;
	
	public void scoreProcess() {
		
		//기본형 형식의 사용.
//		int[][] score= {
//				{87,78,89},{71, 77, 73},{ 99,100,95},{66,63,69},{88,40,91}
//				};
		int[][] score=new int[][] {
				{87,78,89},{71, 77, 73},{ 99,100,95},{66,63,69},{88,40,91}
		};
		String[] names= {"차승주","송성우","이유리","남상민","김강현"};
		
		System.out.println("번호\t이름\t자바\t오라클\tJSP\t총점\t평균");
		System.out.println("--------------------------------------------------------");

		int totalScore=0;
		int[] totalScoreArr=new int[score.length]; //학생의 수로 배열을 생성
		int[] oracleScoreArr=new int[score.length];//오라클 점수를 저장할 배열 생성.
		
		for(int i=0 ; i < score.length ; i++) {//행
			System.out.printf("%d\t%s\t",i+1, names[i]);
			oracleScoreArr[i]=score[i][ORACLE];// 오라클 점수만 저장
			
			for( int j = 0 ; j < score[i].length ; j++ ) {//열
				System.out.printf("%d\t", score[i][j]);
				totalScore+= score[i][j];
			}//end for	
			//학생들의 총점을 배열에 할당
			totalScoreArr[i]=totalScore;
			
			System.out.printf("%d\t%.2f\n",totalScore, (double)totalScore/score[i].length);
			totalScore=0;
		}//end for
		System.out.println("------------------------------------------------------------");
		//1.method 점수 배열을 입력받아 일차원배열로 0번째 방은 자바총점, 1번째 방은 오라클 총점, 
		//두번째 방은 JSP과목의 총점저장하여  반환하고 총점을 출력 
		int[] subjectTotal=subjectTotal(score);
		System.out.printf("\t총점\t%d\t%d\t%d\n",subjectTotal[JAVA],
					subjectTotal[ORACLE],subjectTotal[JSP] );
		
		//2. 각 학생의 총점을 입력받아 모든 총점을 구하여 반환하는 method를 작성. 
		int allTotal=totalScore(totalScoreArr);
		System.out.printf("전체총점\t\t%d\n", allTotal);
		//3. 전체 총점과 평균을 구하는 값을 입력받아 (매개변수가 2개) 전체 평균을 구하여 
		// double로 반환하는 method작성 출력
		double allAvg=allAvg(allTotal, (double)score.length*score[0].length);
		System.out.printf("전체평균\t\t%.2f\n", allAvg);
		
		//4.오라클 점수를 일차원 배열에 저장하고, 일차원 배열을 입력받아 
		//  최고 점수를 구하여 반환하는 일을 하는 method를 작성하여 출력.
		int oracleTop=oracleTopScore(oracleScoreArr);
		System.out.printf("오라클최고점수\t\t%d\n", oracleTop);
		
		//5. https://gmlwjd9405.github.io/2018/05/06/algorithm-selection-sort.html
		//선택정렬을 스스로 학습한 후 최고 점수를 획득한 학생의 이름을반환하는
		// method를 만들고 출력 해보세요.
		String name=topScoreName(totalScoreArr, names);
		System.out.printf("1등학생의 이름 %s", name);
	
	}//scoreProcess
	
	/**
	 * 	//1.method 점수 배열을 입력받아 일차원배열로 0번째 방은 자바총점, 1번째 방은 오라클 총점, 
		//두번째 방은 JSP과목의 총점저장하여  반환하고 총점을 출력 
	 * @param score
	 * @return
	 */
	public int[] subjectTotal(int[][] score) {
		int[] subejctSumArr=new int[score[0].length];//과목수(열의 수)에 대한 총점 구하기
		for( int i = 0 ; i < score.length ; i++) {//행
			subejctSumArr[Work0707.JAVA]+=score[i][Work0707.JAVA];
			subejctSumArr[Work0707.ORACLE]+=score[i][Work0707.ORACLE];
			subejctSumArr[Work0707.JSP]+=score[i][Work0707.JSP];
		}//end for
		
		return subejctSumArr;
	}//subjectTotal
	
	
	/**
	 * //2. 각 학생의 총점을 입력받아 모든 총점을 구하여 반환하는 method를 작성. 
	 * @param score
	 * @return
	 */
	public int totalScore(int[] score) {
		int sum=0;
		for(int i=0 ; i < score.length ; i++) {
			sum+=score[i];
		}//end for
		return sum;
	}//totalScore
	
	/**
	//3. 전체 총점과 평균을 구하는 값을 입력받아 (매개변수가 2개) 전체 평균을 구하여 
	// double로 반환하는 method작성 출력
	 * @param allTotal
	 * @param avgValue
	 * @return
	 */
	public double allAvg(int allTotal, double avgValue) {
		return allTotal / avgValue;
	}//allAvg
	
	/**
	 * //4.오라클 점수를 일차원 배열에 저장하고, 일차원 배열을 입력받아 
		//  최고 점수를 구하여 반환하는 일을 하는 method를 작성하여 출력
	 * @param oracleScoreArr
	 * @return
	 */
	public int oracleTopScore( int[] oracleScoreArr ) {
		int topScore=0;
		
		for(int i= 0 ; i < oracleScoreArr.length ; i++) {
			if(topScore < oracleScoreArr[i]) {
				topScore = oracleScoreArr[i];
			}//end if
		}//end for
		
		return topScore;
	}//oracleTopScore
	
	/**
	 *  최고 점수를 획득한 학생의 이름을반환하는 method를 만들고 출력 해보세요.
	 * @param totalScore
	 * @param names
	 * @return
	 */
	public String topScoreName(int[] totalScore, String[] names) {
		String name="";
		int  topNumber=0;
		int topScore=0;
		for(int i= 0 ; i < totalScore.length ;i++) {
			if( topScore < totalScore[i] ) {
				topScore=totalScore[i];
				topNumber=i;
			}//end if
		}//end for
		name=names[ topNumber ];
		return name;
	}//topScoreName
	
}//class
