package ce.examples.chapter5;

public class Herbivore {
	//ok defaultnì se pøedpokládá že se jedná o public static (compiler s tím poèítá)
	int amount = 10;
	
	//špatnì - static metoda musí mít definované tìlo
	public static void eatGrass();
	
	//špatnì - nevím proè nehlasí error, protože pouze metody static nebo default keyword mohou mít definované tìlo
	public int chew() {
		return 13;
	}

}
