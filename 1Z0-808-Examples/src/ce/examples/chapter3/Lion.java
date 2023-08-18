package ce.examples.chapter3;

public class Lion {

	public void roar(String roar1, StringBuilder roar2) {
		//zmìna se nepropíše - String je immutable
		roar1.concat("!!!");
		//zmìna se propíše - StringBuilder je mutable, append ovlivní výsledná string
		roar2.append("!!!");
	}
	
	public static void main(String[] args) {
		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar");
		new Lion().roar(roar1, roar2);
		//nemohu porovnávat String vs StringBuilder pomocí == ale pøesto se ihned zkonvertuje na String (i bez roar2.toString()
		System.out.println(roar1 + " " + roar2);
	}

}
