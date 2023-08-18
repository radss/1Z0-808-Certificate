package ce.examples.chapter3;

public class Numbers {

	public static void main(String[] args) {
		String numbers = "012345678";
		//v substring se berou znaky od prvního indexu (vèetnì!!! znaku na prvním indexu) až do druhého indexu (znak na druhém indexu se nebere!!!)
		System.out.println(numbers.substring(1, 3));
		//nic - od 7 indexu je 7 do 7 indexu (znak na druhém indexu se nebere, tak si vysvìtluju výsledek " ")
		System.out.println(numbers.substring(7, 7));
		//pokud v substring pouze první index, pak se bere že se bere promìnná na tomto indexu a vše ostatní až do konce
		System.out.println(numbers.substring(7));

	}

}
