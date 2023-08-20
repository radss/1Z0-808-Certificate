package ce.examples.chapter6;

//cv10
public class Dog {
	 public String name;
	 public void parseName() {
		 //ok vytiskne
		 System.out.print("1");
		 try {
			//ok vytiskne
			 System.out.print("2");
			 /*vznikne NumberFormatException, kter� je v catch odchycena a "opravena"
			  v�pisem System.out.print("4");
			 */
			 int x = Integer.parseInt(name);
			 System.out.print("3");
		 } catch (NumberFormatException e) {
			//ok vytiskne
			 System.out.print("4");
		 }
	 }
	 public static void main(String[] args) {
		 Dog leroy = new Dog();
		 leroy.name = "Leroy";
		 leroy.parseName();
		 
		//ok vytiskne
		 /*
		  * Vtip je v tom, �e v catch program nekon��,
		  * pouze odchyt� NumberFormatException a reaguje v�pisem System.out.print("4");
		  * Pak program pokra�uje/nespadne 
		  */
		 System.out.print("5");
	 }
}
