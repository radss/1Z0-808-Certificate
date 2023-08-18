package ce.examples.chapter5;

public class Rodent {
	 protected static Integer chew() throws Exception {
		 System.out.println("Rodent is chewing");
		 return 1;
	 }
}

public class Beaver extends Rodent {
	/*a) compile error protože Number není subclassa Integer (Number je superclassa pro Integer) a to není
	 * povoleno. classa která dìdí musí mít stejný nebo child návratový typ. Tj. kdyby 
	 * metoda v classe Rodent vracela Number a metoda v Beaver vracela Integer tak ok.
	 * 
	 * b)compile error protože  Number chew() je non-static ale v parent classe je static metoda
	 * Vyhozené exceptions jsou ok,  RuntimeException je subclassou Exception
	 * Teoreticky (to zde asi není zkoušeno) možné øíci že v jednom java souboru mùže být
	 * pouze jedna public classa, takže dokud nesmažeme public class Beaver, tak compilation error.
	 */
	 public Number chew() throws RuntimeException {
		 System.out.println("Beaver is chewing on wood");
		 return 2;
	 }
}
