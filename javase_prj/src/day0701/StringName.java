package day0701;

public class StringName {

	
	String name;
	
		public void swap(StringName sn) {
			
			sn.name="정현지";
			
		}//swap
	
	public static void main(String[] args) {

		StringName sn=new StringName();
		
		sn.swap(sn);
		System.out.println(sn.name);
		
	}//main

}//class
