package ce.examples.chapter3;

public class StringBuilderVsStringChyták {

	public static void main(String[] args) {
		String s1 = "Java";
		StringBuilder s2 = new StringBuilder("java");
		//nemùžeme provnávat String a StringBuilder pomocí ==
		if(s1==s2) 
			System.out.println("1");
		if(s1.equals(s2))
			System.out.println("2");

	}

}
