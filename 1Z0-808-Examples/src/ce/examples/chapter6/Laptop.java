package ce.examples.chapter6;

//cv.9
public class Laptop {
	public void start() {
	 try{   //ok vytiskne
		 	System.out.print("Starting up ");
		 	//vyhod� Exception a d�ky tomu vleze do catch proto�e tento blok ji chytne
		 	throw new Exception();
		 }catch (Exception e) {
			 //ok vytiskne
			 System.out.print("Problem ");
			 /*d�ky tomuto kodu se nevykon� finally blok, program se okam�it� ukon�� (��dn� return nepot�ebujeme
			  kdy� je void metoda)
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
