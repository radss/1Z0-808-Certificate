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

