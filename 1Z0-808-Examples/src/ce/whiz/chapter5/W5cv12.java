package ce.whiz.chapter5;

public class W5cv12 {

	public static void main(String[] args) {
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		
		Integer c = 127;
		Integer d = 127;
		
		Integer e = new Integer(200);
		Integer f = new Integer(200);
		
		Integer g = 200;
		Integer h = 200;
		/*
		 * nemohu provn�vat objekty new Integer() pomoc� == tak�e tyto mo�nosti v�dy false
		 * Integery od -128 do 127 m��eme srovn�vat pomoc� == tak�e c==d d� true
		 * Pokud jsou ale Integery mimo rozsah -128, 127 potom se vnit�n� vrac� new Integer objekty
		 * a objekty nem��eme porovn�vat na z�klad� ==, tak�e g==h d� false
		 */
		System.out.println((a==b) +" " + (c==d) + " " + (e==f) + " "+ (g==h));

	}

}
