package ce.examples.chapter3;

public class Letters2 {

	public static void main(String[] args) {
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total += letters.substring(1, 2).length();
		total += letters.substring(6, 6).length();
		//java Runntime An exception is thrown - StringIndexOutOfBoundsException
		//obr�cen� indexy!!! a st�m si java neporad�
		total += letters.substring(6, 5).length();
		System.out.println(total);

	}

}
