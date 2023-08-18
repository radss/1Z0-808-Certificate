package ce.examples.chapter3;

public class StringBuilderInsert {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		/*StringBuilder je mutable takže se nemusí vždy zakládat nová referenc na objekt sb=ab.append("aaa")..
		 V jednom øádku více operací najednou - zmìny se okamžitì propisují
		 Níže se provede jeden insert sb.append("aaa").insert(1, "bb") a HNED DO VÝSLEDKU operace další .insert(4, "ccc");
		 který JIŽ REFLEKTUJE zmìny zpùsobené pøedchozím insertem
		*/
		/*
		 * 1) sb.append("aaa") - "aaa"
		 * 2) sb.append("aaa").insert(1, "bb") - "abbaa"
		 * 3) sb.append("aaa").insert(1, "bb").insert(4, "ccc") - "abbaaccc"
		 */
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		System.out.println(sb);

	}

}
