package day0822;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class View extends JFrame implements ActionListener{

	private DefaultComboBoxModel<String> dcbmTable;
	private JComboBox<String> dcbTable;
	private JTextArea jta;
	
	public View() {
		
		super("테이블 조회");
		
		dcbmTable=new DefaultComboBoxModel<String>();
		dcbTable=new JComboBox<String>(dcbmTable);
		jta=new JTextArea();
		JLabel jlbl=new JLabel("테이블");
		
		JScrollPane jpTextArea=new JScrollPane(jta);
		
		try {
			searchTableData();
		} catch (SQLException e) {
			e.printStackTrace();
		}//end catch
		
		JPanel jpNorth=new JPanel();
		jpNorth.add(jlbl);
		jpNorth.add(dcbTable);
		
		add("North",jpNorth);
		add("Center",jpTextArea);
		
		jta.setEditable(false);
		dcbTable.addActionListener(this);
		
		setBounds(100,100,300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//View
		
	public void actionPerformed(ActionEvent e) {
		try {
			searchColumnData();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}//end catch
	}//actionPerformed
	
	private void searchTableData() throws SQLException {
		
		TableInfoDAO tDAO=TableInfoDAO.getInstanc();
		List<String> list=tDAO.selectAllTable();
		for(String str:list) {
			dcbmTable.addElement(str);
		}//end for
		
	}//selectAllTable
	
	private void searchColumnData() throws SQLException{
		
//		String tName=dcbmTable.getSelectedItem().toString();//모델만 사용해서 
//		String tName=(String)dcbTable.getSelectedItem();// 뷰만 사옹해
		String tName= dcbmTable.getElementAt(dcbTable.getSelectedIndex());// 뷰에서는 선택된 아이템의 인덱스를 얻고, 모델에 넣어서 값을 얻어야함
		
		TableInfoDAO tDAO=TableInfoDAO.getInstanc();
		List<ColumnVO> list=tDAO.selectTableColumn(tName);
		
		jta.setText("");
		jta.append("컬럼명\t데이터형\t크기\n");
		jta.append("==============================\n");
		for(ColumnVO clVO: list) {
			jta.append(clVO.getColumnName()+"\t");
			jta.append(clVO.getDataType()+"\t");
			jta.append(String.valueOf(clVO.getDataLength())+"\n");
			jta.append("----------------------------------------------------\n");
		}//end for
		
	}//searchColumnData
	
	public static void main(String[] args) {
		new View();		
	}//main

}//class
