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

