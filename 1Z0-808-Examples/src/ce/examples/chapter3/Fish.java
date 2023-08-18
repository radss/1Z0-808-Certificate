package ce.examples.chapter3;

public class Fish {

	public static void main(String[] args) {
		int numFish = 4;
		String fishType = "tuna";
		//nemùžeme pøiøadit int numFish do objektu String
		String anotherFish = numFish+1;
		System.out.println(anotherFish + " " + fishType);
		System.out.println(numFish + " " + 1);

	}

}
