package day0824;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CarService {
	
	
	private void searchCarData() {
		String inputData = JOptionPane.showInputDialog("차량 제조사");
		System.out.println(inputData);
		if(inputData == null) {
			//early return
			return;
		}//end if
		CarInfoDAO ciDAO = CarInfoDAO.getInstance();
		try {
		List<CarVO> carList = ciDAO.selectCarColumn(inputData);
		
		StringBuilder outData = new StringBuilder();
		outData.append(inputData).append("사 조회 결과 \n");
		outData.append("제조국\t제조사\t모델명\t연식\t가격\t옵션\n");
		
		if( carList.isEmpty()) {
			outData.append("입력하신 제조사는 존재하지 않습니다.");
		} 
		
		for(CarVO cVO : carList) {
			outData
			.append(cVO.getCountry()).append("\t")
			.append(cVO.getMaker()).append("\t")
			.append(cVO.getModel()).append("\t")
			.append(cVO.getCarYear()).append("\t")
			.append(Integer.toString(cVO.getPrice())).append("\t")
			.append(cVO.getCarOption()).append("\n");
		}//end for
		
		JTextArea jta = new JTextArea(outData.toString(), 100, 100);
		JScrollPane jsp = new JScrollPane(jta);
		
		JOptionPane.showMessageDialog(null, jsp);
		
		}catch(SQLException se){
			JOptionPane.showMessageDialog(null, "서비스 장애가 발생했습니다. 잠시 후 다시 시도해주세요.");
			se.printStackTrace();
		}
	}//searchCarData
	
	public static void main(String[] args) {
		CarService cs = new CarService();
		cs.searchCarData();
	}//main
}//class
