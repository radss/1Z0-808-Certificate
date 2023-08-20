package ce.examples.chapter6;

//cv19
public class WorkRealHard {
	/**
	 * Mo�nost C (IllegalArgumentException) je povolena, proto�e je o specifi�t�j�� typ ne� RuntimeException.
	 * 
	   Mo�nost E (StackOverflowError) je povolena, proto�e nen� ve stejn�m stromu d�di�nosti jako RuntimeException.
	   => Nen� dobr� n�pad takto zachyt�vat chybu.
	   
	    Mo�nost B (IOException)  nen� povolena, proto�e
		metoda volan� uvnit� bloku try nedeklaruje vyvol�n� IOException. Kompil�tor si uv�domuje, 
		�e IOException by byl nedosa�iteln� pro catch blok.
		
		Mo�nost D (RuntimeException) nen� povoleno, proto�e stejnou v�jimku nelze zadat ve dvou r�zn�ch catch.
		
		Mo�nost A (Exception) nen� povolena, proto�e je obecn�j��
		 ne� RuntimeException a zp�sobila by nedostupnost tohoto bloku.
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
