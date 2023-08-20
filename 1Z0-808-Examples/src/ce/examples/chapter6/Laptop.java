package ce.examples.chapter6;

//cv.9
public class Laptop {
	public void start() {
	 try{   //ok vytiskne
		 	System.out.print("Starting up ");
		 	//vyhodí Exception a díky tomu vleze do catch protože tento blok ji chytne
		 	throw new Exception();
		 }catch (Exception e) {
			 //ok vytiskne
			 System.out.print("Problem ");
			 /*díky tomuto kodu se nevykoná finally blok, program se okamžitì ukonèí (žádné return nepotøebujeme
			  když je void metoda)
			  */
			 System.exit(0);
		 }finally {
			 System.out.print("Shutting down ");
		 } 
	}
	 public static void main(String[] args) {
		 new Laptop().start();
	 }
}
