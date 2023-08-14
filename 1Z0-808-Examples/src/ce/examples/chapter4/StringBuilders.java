package ce.examples.chapter4;

public class StringBuilders {
	
	public static StringBuilder work(StringBuilder a, StringBuilder b) {
		//Proto�e Java je pass-by-reference, p�i�azen� nov�ho objektu nezm�n� volaj�c�ho.
		a = new StringBuilder("a");
		//Vol�n� append() m� vliv na volaj�c�ho, proto�e parametr metody i volaj�c� maj� odkaz na stejn� objekt. 
		b.append("b");
		//Vr�cen� hodnoty p�ed� referenci volaj�c�mu pro p�i�azen� k s3.
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
