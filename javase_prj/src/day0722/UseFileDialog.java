package day0722;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UseFileDialog extends JFrame implements ActionListener {

	private JButton jbtnOpen;
	private JButton jbtnSave;
	
	public UseFileDialog() {
		super("파일다이얼로그 사용.");
		
		jbtnOpen=new JButton("파일열기");
		jbtnSave=new JButton("파일저장");
		
		JPanel jpCenter=new JPanel();
		jpCenter.add(jbtnOpen);
		jpCenter.add(jbtnSave);
		
		add("Center", jpCenter);
		
		//컴포넌트에서 이벤트가 발생했을 때 JVM에서 감지할 수 있도록 리쓰너에 등록
		jbtnOpen.addActionListener(this);
		jbtnSave.addActionListener(this);
		
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//EventCompare
	
	public void openFileDialog() {
		//1. 열기 모드로 생성 : modal로 동작.
		FileDialog fdOpen=new FileDialog(this,"파일 열기", FileDialog.LOAD);
		//2. 가시화
		fdOpen.setVisible(true);
		//3.경로얻기
		String path=fdOpen.getDirectory();
		//4.선택파일명
		String fileName=fdOpen.getFile();
		
		//타이틀바에 경로와 파일명을 설정
		//선택한 값이 있었을 경우에만 타이틀 바에 설정한다.
		if( path != null && fileName != null) {
			setTitle("열기 "+path+fileName);
		}//end if
		
	}//openFileDialog
	
	public void saveFileDialog() {
		//1. 저장 모드로 생성 : modal로 동작.
		FileDialog fdSave=new FileDialog(this,"파일 저장", FileDialog.SAVE);
		//2. 가시화
		fdSave.setVisible(true);
		//3.경로얻기
		String path=fdSave.getDirectory();
		//4.선택파일명
		String fileName=fdSave.getFile();
		
		//타이틀바에 경로와 파일명을 설정
		//선택한 값이 있었을 경우에만 타이틀 바에 설정한다.
		if( path != null && fileName != null) {
			setTitle("저장 "+path+fileName);
		}//end if
		
	}//saveFileDialog
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//이벤트를 비교하여 일을 하는 method를 호출한다. 
		if(ae.getSource() == jbtnOpen) {
			openFileDialog();
		}//end if
		
		if(ae.getSource() == jbtnSave) {
			saveFileDialog();
		}//end if
		
	}//actionPerformed

	public static void main(String[] args) {
		new UseFileDialog();
	}//main

}//class
