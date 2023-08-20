package ce.examples.chapter6;

//cv13
 public class Mouse {
	 public String name;
	 public void run() {
		//ok vytiskne 
		System.out.print("1");
		 try{
			//ok vytiskne
			 System.out.print("2");
			 /*vznikne NullPointerException, která JE v catch odchycena a 
			   PROTO ZDE program nekonèí,
			 */			 
			 name.toString();
			 System.out.print("3");
		 }catch (NullPointerException e) {
			//ok vytiskne
			 System.out.print("4");
			 /*
			  * po vytisknutí System.out.print("4"); je znovu "umìle" vyhozena
			  * NPE a program zde konèí, už se nic netiskne. 
			  * K dosavadnímu tisku 12 se pøidá zde vylítlá a nezachycení statck trace 4java.lang.NullPointerException
			  * =>ta 4 je díky System.out.print("4");
			  */
			 throw e;
		 }
		 	System.out.print("5");
	 }
	 public static void main(String[] args) {
		 Mouse jerry = new Mouse();
		 jerry.run();
		 System.out.print("6");
	 } 
 }
