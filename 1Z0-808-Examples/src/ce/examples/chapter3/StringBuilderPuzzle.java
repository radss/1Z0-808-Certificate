package ce.examples.chapter3;

public class StringBuilderPuzzle {

	public static void main(String[] args) {
		StringBuilder puzzle = new StringBuilder("Java");
		//puzzle.reverse();
		
		/*
		 * append - JavavaJ$
		 * delete - avaJ$
		 * deleteCharAt(puzzle.length() - 1) - avaJ
		 * kdyby se pou�ila mo�nost deleteCharAt(puzzle.length()); tak vyl�tne exceptiona
		 * proto�e jde hranici StringIndexOutOfBoundsException
		 * 
		 */
		puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
		System.out.println(puzzle);

	}

}
