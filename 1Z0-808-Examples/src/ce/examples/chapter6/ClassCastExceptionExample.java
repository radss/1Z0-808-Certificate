package ce.examples.chapter6;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Object obj = new Integer(3);
		/*
		 * nen� compile files ale vyl�tne Runtime classCastException
		 * Pokus�me se p�ev�st Integer na String. Proto�e String not extends
		   Integer, nen� to povoleno a je vyvol�na v�jimka ClassCastException.
		 */
		//matouc� je ten Object ve kter�m je reference Integeru
		String str = (String) obj;
		System.out.println(str);

	}

}
