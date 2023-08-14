package ce.examples.chapter4;

public class StringBuilders {
	
	public static StringBuilder work(StringBuilder a, StringBuilder b) {
		//Protože Java je pass-by-reference, pøiøazení nového objektu nezmìní volajícího.
		a = new StringBuilder("a");
		//Volání append() má vliv na volajícího, protože parametr metody i volající mají odkaz na stejný objekt. 
		b.append("b");
		//Vrácení hodnoty pøedá referenci volajícímu pro pøiøazení k s3.
		return a;
	}

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("s1");
		StringBuilder s2 = new StringBuilder("s2");
		
		StringBuilder s3 = work(s1, s2);
		//s1
		System.out.println("s1 = "+s1);
		//s2b
		System.out.println("s2 = "+s2);
		//a
		System.out.println("s3 = "+s3);

	}

}
