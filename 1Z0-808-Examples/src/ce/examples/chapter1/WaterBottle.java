package ce.examples.chapter1;

public class WaterBottle {
	private String brand;
	private boolean empty;

	public static void main(String[] args) {
		WaterBottle wb = new WaterBottle();
		//tiskne default boolean instanèní promìnné což je false
		System.out.print("Empty = " + wb.empty);
		//žádné NPE!!! - tiskne default String instanèní promìnné což je null
		System.out.print(", Brand = " + wb.brand);

	}

}
