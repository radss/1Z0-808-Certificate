package ce.examples.chapter3;

public class Lion {

	public void roar(String roar1, StringBuilder roar2) {
		//zm�na se neprop�e - String je immutable
		roar1.concat("!!!");
		//zm�na se prop�e - StringBuilder je mutable, append ovlivn� v�sledn� string
		roar2.append("!!!");
	}
	
	public static void main(String[] args) {
		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar");
		new Lion().roar(roar1, roar2);
		//nemohu porovn�vat String vs StringBuilder pomoc� == ale p�esto se ihned zkonvertuje na String (i bez roar2.toString()
		System.out.println(roar1 + " " + roar2);
	}

}
