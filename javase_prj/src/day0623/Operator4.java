package day0623;
/**
관계연산자
>, < , >=, <=, ==, != 
*/

class Operator4{
	public static void main(String[] args) {
		//== 같으면 true, 다르면 false
		int i=6, j =23, k=6;
		System.out.println(i+" == " +j+ " = "+ (i == j)); //같은지? false
		System.out.println(i+" == " +k+ " = "+ (i == k)); //같은지? true
		//!= 같으면 false, 다르면 true
		System.out.println(i+" != " +j+ " = "+ (i != j)); //다른지? true
		System.out.println(i+" != " +k+ " = "+ (i != k)); //다른지? false

		System.out.println(-128>>>1);
		System.out.println(-1>>>1);
	}//main
}//class
