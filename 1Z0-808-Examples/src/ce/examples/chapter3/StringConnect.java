package ce.examples.chapter3;

public class StringConnect {

	public static void main(String[] args) {
		String a = "";
		
		/*
		 * nemohu natvrdo String a = 2, ale takto se na String zkonvertuje
		 * int b=2;a+=b; ....i toto by se zkonvertvalo
		 */
		a+=2;
		a+='c';
		a+=false;
		if ( a == "2cfalse") System.out.println("==");
		if ( a.equals("2cfalse")) System.out.println("equals");

	}

}
