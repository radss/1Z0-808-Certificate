package ce.examples.chapter6;

public class Test {

	public static void main(String[] args) {
		int a=1;int b=1;
		try {
			return a/b; //return by musel být v metodì vracející int
		}finally {
			System.out.println("test"); //try s finally bez catch je ok
		}
	}

}
