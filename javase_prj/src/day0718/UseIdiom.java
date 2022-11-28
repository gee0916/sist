package day0718;

import java.util.Set;

@SuppressWarnings("unused")
public class UseIdiom {
	
	Idiom i; 
	
	public void useIdiomKey() {
		
		i=new Idiom("고진감래");	
		System.out.println(i);
		
	}//UseIdiom
	
	public void callIdiom() {

		System.out.println("사자성어 ["+i.idiomData+"]");
		this.useIdiomKey();
		
	}//callIdiom
	
	public static void main(String[] args) {

		UseIdiom ui=new UseIdiom();
		ui.useIdiomKey();
		System.out.println("---------------------------");
		ui.callIdiom();
		
	}//main

}//class
