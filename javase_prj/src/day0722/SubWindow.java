package day0722;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * 자식 윈도우 ( Dialog )
 * @author user
 */
@SuppressWarnings("serial")
public class SubWindow extends JDialog {

	private JButton jbtnClose;
	/**
	 *  부모 윈도우에속한 자식윈도우로 만들기위해 부모 윈도우를 받는다. 
	 * @param mw
	 */
	public SubWindow(MainWindow mw) { 
		super( mw,"다이얼로그",true  );// true 모달, false 비모달
		
		JTextArea jta=new JTextArea();
		jta.append("오늘은 소나기 내리는 금요일\n내일을 퇼 입니다.");
		jta.setEditable(false); //수정 불가
		
		jbtnClose=new JButton("닫기");
		JPanel jpSouth=new JPanel();
		jpSouth.add(jbtnClose);
		
		add("Center",jta);
		add("South",jpSouth);
		
		//이벤트 처리 : setVisible 전에 수행.
		SubWindowEvent swe=new SubWindowEvent(this);
		addWindowListener(swe);
		jbtnClose.addActionListener(swe);
		
		//setSize(400, 300);
		//부모창의 x좌표 .getX(), y좌표 .getY()
		setBounds(mw.getX()+200, mw.getY()+100, 400, 300);
		
		setVisible(true);
		
//		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
	}//SubWindow
	
	public JButton getJbtnClose() {
		return jbtnClose;
	}//getJbtnClose
	 
}//class
