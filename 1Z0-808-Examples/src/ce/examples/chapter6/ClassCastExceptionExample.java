package ce.examples.chapter6;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Object obj = new Integer(3);
		/*
		 * není compile files ale vylítne Runtime classCastException
		 * Pokusíme se pøevést Integer na String. Protože String not extends
		   Integer, není to povoleno a je vyvolána výjimka ClassCastException.
		 */
		//matoucí je ten Object ve kterém je reference Integeru
		String str = (String) obj;
		System.out.println(str);

	}

}
