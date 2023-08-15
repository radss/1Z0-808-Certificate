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
		 * nemohu provnávat objekty new Integer() pomocí == takže tyto možnosti vždy false
		 * Integery od -128 do 127 mùžeme srovnávat pomocí == takže c==d dá true
		 * Pokud jsou ale Integery mimo rozsah -128, 127 potom se vnitønì vrací new Integer objekty
		 * a objekty nemùžeme porovnávat na základì ==, takže g==h dá false
		 */
		System.out.println((a==b) +" " + (c==d) + " " + (e==f) + " "+ (g==h));

	}

}
