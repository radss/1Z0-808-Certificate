package ce.examples.chapter3;

public class Hello {

	public static void main(String[] args) {
		String s = "Hello";
		String t = new String(s);
		
		//true - klasika
		if("Hello".equals(s)) System.out.println("one");
		
		//false
		if(t==s) System.out.println("two");
		
		//true - hodnota objektu t = new String(s) kdy v promìnné s je "Hello"
		if(t.equals(s)) System.out.println("three");
		
		/*true - NEPOUŽÍVÁ equals, ale protože v obou pøípadech porovnává 
			String pool (v promìnné s je èistý String), tak je výsledek true
		*/
		if("Hello"==s) System.out.println("four");
		
		//false - porovnává øetìzec a new String(s) objekt (øetìzec s zabalený v objektu) takže výsledek je false
		if("Hello"==t) System.out.println("five");

	}

}
