package ce.examples.chapter1;

public class WaterBottle {
	private String brand;
	private boolean empty;

	public static void main(String[] args) {
		WaterBottle wb = new WaterBottle();
		//tiskne default boolean instan�n� prom�nn� co� je false
		System.out.print("Empty = " + wb.empty);
		//��dn� NPE!!! - tiskne default String instan�n� prom�nn� co� je null
		System.out.print(", Brand = " + wb.brand);

	}

}
