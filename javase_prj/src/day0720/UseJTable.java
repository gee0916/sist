package day0720;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *	MVC Pattern이 도입된 클래스
 * @author user
 */
@SuppressWarnings("serial")
public class UseJTable extends JFrame {

	public UseJTable() {
		super("JTable 연습");
		//1. 컬럼명을 일차원 배열로 설정
		String[] columnNames= {"번호","이름","주소","비고"};
		//2. 행의 데이터를 이차원배열로 설정.
		String[][] rowData= {
										{"1","김강현","서울시 강남구 역삼동",""},
										{"2","김도희","서울시 강남구 서초동 서초파라곤",""},
										{"3","김소현","경기도 수원시 매탄동",""},
										{"4","김태규","인천광역시 부평구 부평동",""}
									};
		//3. Model업무를 수행하는 클래스를 생성.
		DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
		//4. View 업무를 수행하는 클래스를 생성.
		JTable jt=new JTable( dtm );
		
		//Model 클래스를 사용하여 데이터 추가.
		//일차원 배열로 데이터를 만든다.
		String[] data= {"5","남상민","서울시 동대문구 동대문동",""};
		dtm.addRow(data);
		
		JScrollPane jsp=new JScrollPane(jt);
		//배치관리자  설정
		
		
		//배치 
		add("Center",jsp);
		
		//윈도우의 설정
		setBounds(100, 100, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJTable
	
	public static void main(String[] args) {
		new UseJTable();
	}//main

}//class
