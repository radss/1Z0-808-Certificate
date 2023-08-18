package ce.examples.chapter3;

public class Hello {

	public static void main(String[] args) {
		String s = "Hello";
		String t = new String(s);
		
		//true - klasika
		if("Hello".equals(s)) System.out.println("one");
		
		//false
		if(t==s) System.out.println("two");
		
		//true - hodnota objektu t = new String(s) kdy v prom�nn� s je "Hello"
		if(t.equals(s)) System.out.println("three");
		
		/*true - NEPOU��V� equals, ale proto�e v obou p��padech porovn�v� 
			String pool (v prom�nn� s je �ist� String), tak je v�sledek true
		*/
		if("Hello"==s) System.out.println("four");
		
		//false - porovn�v� �et�zec a new String(s) objekt (�et�zec s zabalen� v objektu) tak�e v�sledek je false
		if("Hello"==t) System.out.println("five");

	}

}
