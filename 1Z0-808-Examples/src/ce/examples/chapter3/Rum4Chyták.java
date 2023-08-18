package ce.examples.chapter3;

public class Rum4Chyták {

	public static void main(String[] args) {
		//NELZE INCIALIZOVAT StringBuilder bez konstruktoru!!!
		StringBuilder b = "rumble";
		//StringBuilder b = new StringBuilder("rumble");
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
		System.out.println(b);

	}

}
