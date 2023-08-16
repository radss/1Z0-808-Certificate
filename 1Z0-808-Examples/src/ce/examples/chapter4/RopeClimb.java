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
		 //nekompiluje se protože ve statické metodì není povoleno volání NEstatické metody
		 climb();
		 /* V nestatickém bloku se mohou dávat statické promìné a metody ale nevykonají se (pokud napøíklad chceme
		  * pøepsat statickou konstantu, tak není chyba compileru ale hodnota se nepøepíše)
		    Naopak do statického incializaèního bloku nemùžeme dát nestatické metody/promìnné - chyba compileru.
		  */
	 }
	 
	 public static void main(String[] args) {
		 //kdyby se z play() odstranilo volání climb(), kod by fungoval a tisklo by se "swing swing"
		 RopeClimb rope = new RopeClimb();
		 //klasické volání statiky
		 rope.play();
		 RopeClimb rope2 = null;
		 //nevyhodí se NPE!!, protože se volá statická metoda!
		 rope2.play();
	 }
 }

