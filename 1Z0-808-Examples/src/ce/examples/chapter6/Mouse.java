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
			 /*vznikne NullPointerException, kter� JE v catch odchycena a 
			   PROTO ZDE program nekon��,
			 */			 
			 name.toString();
			 System.out.print("3");
		 }catch (NullPointerException e) {
			//ok vytiskne
			 System.out.print("4");
			 /*
			  * po vytisknut� System.out.print("4"); je znovu "um�le" vyhozena
			  * NPE a program zde kon��, u� se nic netiskne. 
			  * K dosavadn�mu tisku 12 se p�id� zde vyl�tl� a nezachycen� statck trace 4java.lang.NullPointerException
			  * =>ta 4 je d�ky System.out.print("4");
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
