package ce.examples.chapter6;

//cv11
 public class Cat {
	 public String name;
	 public void parseName() {
		//ok vytiskne
		 System.out.print("1");
	 try {
		//ok vytiskne
		 System.out.print("2");
		 /*vznikne NumberFormatException, kter� NEN� v catch odchycena a 
		   PROTO ZDE prgram kon��, u� se nic netiskne
		 */
		 int x = Integer.parseInt(name);
		 System.out.print("3");
	 }catch (NullPointerException e) {
		 System.out.print("4");
	 }
	  System.out.print("5");
	 }
	 public static void main(String[] args) {
		 Cat leo = new Cat();
		 leo.name = "Leo";
		 leo.parseName();
		 System.out.print("6");
	 }
}
