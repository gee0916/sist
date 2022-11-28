package Work0818;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class UseStatementService extends WindowAdapter implements ActionListener{
	private MainNotepad mn;

	public UseStatementService(MainNotepad mn) {
		this.mn = mn;
	}//UseStatementService
	
	public void windowClosing(WindowEvent we) {
		mn.dispose();
	}// windowClosing
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == mn.getJbtnNameAdd()) {
			addWorkJdbc();
		}//end if
	}//actionPerformed
	
	public void addWorkJdbc() {
		String inputData = mn.getJtfName().getText();
		String name = inputData;
		
		if(inputData.isEmpty()) {
			JOptionPane.showMessageDialog(mn, "이름을 입력해 주세요.");
			//early return;
			return;
		}//end if
		
		//. DAO를 생성하고, 작업 수행
		UseStatementDAO usDAO = new UseStatementDAO();
		
		try {
			int rowCnt = usDAO.insertWorkJdbc(name);
			
			
			if( rowCnt == 1 ) {
				JOptionPane.showMessageDialog(null, name+" 정보가 추가되었습니다.");
			}//end if
			
		} catch (SQLException se) {
			JOptionPane.showMessageDialog(null, "문제가 발생하였습니다. \n 잠시 후 다시 시도해 주세요.");
			se.printStackTrace();
		}
	}//addWorkJdbc
}//class
