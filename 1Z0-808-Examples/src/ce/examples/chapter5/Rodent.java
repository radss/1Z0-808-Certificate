package ce.examples.chapter5;

public class Rodent {
	 protected static Integer chew() throws Exception {
		 System.out.println("Rodent is chewing");
		 return 1;
	 }
}

public class Beaver extends Rodent {
	/*a) compile error proto�e Number nen� subclassa Integer (Number je superclassa pro Integer) a to nen�
	 * povoleno. classa kter� d�d� mus� m�t stejn� nebo child n�vratov� typ. Tj. kdyby 
	 * metoda v classe Rodent vracela Number a metoda v Beaver vracela Integer tak ok.
	 * 
	 * b)compile error proto�e  Number chew() je non-static ale v parent classe je static metoda
	 * Vyhozen� exceptions jsou ok,  RuntimeException je subclassou Exception
	 * Teoreticky (to zde asi nen� zkou�eno) mo�n� ��ci �e v jednom java souboru m��e b�t
	 * pouze jedna public classa, tak�e dokud nesma�eme public class Beaver, tak compilation error.
	 */
	 public Number chew() throws RuntimeException {
		 System.out.println("Beaver is chewing on wood");
		 return 2;
	 }
}
