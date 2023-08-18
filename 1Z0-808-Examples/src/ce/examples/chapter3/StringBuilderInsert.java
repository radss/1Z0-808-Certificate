package ce.examples.chapter3;

public class StringBuilderInsert {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		/*StringBuilder je mutable tak�e se nemus� v�dy zakl�dat nov� referenc na objekt sb=ab.append("aaa")..
		 V jednom ��dku v�ce operac� najednou - zm�ny se okam�it� propisuj�
		 N�e se provede jeden insert sb.append("aaa").insert(1, "bb") a HNED DO V�SLEDKU operace dal�� .insert(4, "ccc");
		 kter� JI� REFLEKTUJE zm�ny zp�soben� p�edchoz�m insertem
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
