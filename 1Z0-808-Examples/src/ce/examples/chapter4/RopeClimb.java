package ce.examples.chapter4;

 public class RopeClimb {
	 public static void swing() {
		 System.out.print("swing ");
	 }
	 public void climb() {
		 System.out.println("climb ");
	 }
	 public static void play() {
		 swing();
		 //nekompiluje se proto�e ve statick� metod� nen� povoleno vol�n� NEstatick� metody
		 climb();
		 /* V nestatick�m bloku se mohou d�vat statick� prom�n� a metody ale nevykonaj� se (pokud nap��klad chceme
		  * p�epsat statickou konstantu, tak nen� chyba compileru ale hodnota se nep�ep�e)
		    Naopak do statick�ho incializa�n�ho bloku nem��eme d�t nestatick� metody/prom�nn� - chyba compileru.
		  */
	 }
	 
	 public static void main(String[] args) {
		 //kdyby se z play() odstranilo vol�n� climb(), kod by fungoval a tisklo by se "swing swing"
		 RopeClimb rope = new RopeClimb();
		 //klasick� vol�n� statiky
		 rope.play();
		 RopeClimb rope2 = null;
		 //nevyhod� se NPE!!, proto�e se vol� statick� metoda!
		 rope2.play();
	 }
 }

