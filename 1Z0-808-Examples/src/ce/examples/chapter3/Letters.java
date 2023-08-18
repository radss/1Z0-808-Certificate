package ce.examples.chapter3;

public class Letters {

	public static void main(String[] args) {
		String letters = "abcdef";
		System.out.println(letters.length());
		System.out.println(letters.charAt(3));
		//vylíten StringIndexOutOfBoundsException
		//délka letters je 6 ale poslední pøístupný index je 5 (zero based => lenhth-1)
		System.out.println(letters.charAt(6));

	}

}
