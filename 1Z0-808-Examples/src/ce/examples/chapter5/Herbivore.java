package ce.examples.chapter5;

public class Herbivore {
	//ok defaultn� se p�edpokl�d� �e se jedn� o public static (compiler s t�m po��t�)
	int amount = 10;
	
	//�patn� - static metoda mus� m�t definovan� t�lo
	public static void eatGrass();
	
	//�patn� - nev�m pro� nehlas� error, proto�e pouze metody static nebo default keyword mohou m�t definovan� t�lo
	public int chew() {
		return 13;
	}

}
