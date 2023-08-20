package ce.examples.chapter6;

//cv19
public class WorkRealHard {
	/**
	 * Možnost C (IllegalArgumentException) je povolena, protože je o specifiètìjší typ než RuntimeException.
	 * 
	   Možnost E (StackOverflowError) je povolena, protože není ve stejném stromu dìdiènosti jako RuntimeException.
	   => Není dobrý nápad takto zachytávat chybu.
	   
	    Možnost B (IOException)  není povolena, protože
		metoda volaná uvnitø bloku try nedeklaruje vyvolání IOException. Kompilátor si uvìdomuje, 
		že IOException by byl nedosažitelný pro catch blok.
		
		Možnost D (RuntimeException) není povoleno, protože stejnou výjimku nelze zadat ve dvou rùzných catch.
		
		Možnost A (Exception) není povolena, protože je obecnìjší
		 než RuntimeException a zpùsobila by nedostupnost tohoto bloku.
	 * @param args
	 */

	public static void main(String[] args) {
		 try {
			 System.out.println("work real hard");
			//NELZE 
			// } catch ( Exception e) {
			//NELZE
			// } catch ( IOException e) {	
			//LZE
			// } catch ( IllegalArgumentException e) {	
			//NELZE
			// } catch ( RuntimeException e) {	
			//LZE
				 } catch ( StackOverflowError e) {				 
			 } catch (RuntimeException e) {
			 }

	}

}
