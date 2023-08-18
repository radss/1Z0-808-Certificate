package ce.examples.chapter3;

public class StringBuilderPuzzle {

	public static void main(String[] args) {
		StringBuilder puzzle = new StringBuilder("Java");
		//puzzle.reverse();
		
		/*
		 * append - JavavaJ$
		 * delete - avaJ$
		 * deleteCharAt(puzzle.length() - 1) - avaJ
		 * kdyby se použila možnost deleteCharAt(puzzle.length()); tak vylítne exceptiona
		 * protože jde hranici StringIndexOutOfBoundsException
		 * 
		 */
		puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
		System.out.println(puzzle);

	}

}
