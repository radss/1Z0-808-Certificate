package ce.examples.chapter3;

public class Numbers {

	public static void main(String[] args) {
		String numbers = "012345678";
		//v substring se berou znaky od prvn�ho indexu (v�etn�!!! znaku na prvn�m indexu) a� do druh�ho indexu (znak na druh�m indexu se nebere!!!)
		System.out.println(numbers.substring(1, 3));
		//nic - od 7 indexu je 7 do 7 indexu (znak na druh�m indexu se nebere, tak si vysv�tluju v�sledek " ")
		System.out.println(numbers.substring(7, 7));
		//pokud v substring pouze prvn� index, pak se bere �e se bere prom�nn� na tomto indexu a v�e ostatn� a� do konce
		System.out.println(numbers.substring(7));

	}

}
