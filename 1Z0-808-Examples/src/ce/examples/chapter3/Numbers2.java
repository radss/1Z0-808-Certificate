package ce.examples.chapter3;

public class Numbers2 {

	public static void main(String[] args) {
		StringBuilder numbers = new StringBuilder("0123456789");
		/*
		 * jako u substring(2,8)..odstran� se znak na indexu 2 a v�e ostatn� a� do indexu 8 ale znak na 
		 * indexu 8 u� se nem�zne!! Stejn� plat� t�eba i pro insert(2, 8)
		 */
		//0189
		numbers.delete(2, 8);
		//append 0189-
		//insert 01+89-
		numbers.append("-").insert(2, "+");
		System.out.println(numbers);

	}

}
