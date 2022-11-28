package day0823;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CarService {

	public void searchOneCar(){
		
		String inputData=JOptionPane.showInputDialog("조회할 차량의 제조사를 입력해주세요");
		if(inputData==null) {
			return;
		}//end if
		
		CarDAO cDAO=CarDAO.getInstance();
		
		try {
			List<String> list=cDAO.selectCarMaker(inputData);
			StringBuilder outData=new StringBuilder();
			outData.append("[").append(inputData).append("]").append("사가 보유한 모든 차량의 정보 조회결과\n");
			outData.append("=====================================================================\n");
			
			int cnt=0;
			if(list.isEmpty()) {
				outData.append("해당 제조사는 존재하지 않습니다. 제조사를 확인해주세요.");
			}else{
				for(String str:list)	{
					cnt++;
					outData.append("(").append(cnt).append("번)\n");
					outData.append(str).append("\n");
					outData.append("---------------------------------------------------------------------------------------------\n");
				}//end for
			}//end else
			
			JTextArea jta=new JTextArea(outData.toString(),10,50);
			JScrollPane jsp=new JScrollPane(jta);
			
			JOptionPane.showMessageDialog(null, jsp);
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}//end finally
		
	}//searchOneCar
	
	public static void main(String[] args) {

		CarService cs=new CarService();
		cs.searchOneCar();
		
	}//class

}//main
