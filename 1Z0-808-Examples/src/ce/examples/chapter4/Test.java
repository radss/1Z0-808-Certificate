package ce.examples.chapter4;

public class Test {
	
	public void print(byte x) {
		System.out.println("byte");
	}
	
	public void print(int x) {
		System.out.println("int");
	}
	
	public void print(float x) {
		System.out.println("float");
	}
	
	public void print(Object x) {
		System.out.println("Object");
	}			

	public static void main(String[] args) {
		Test t = new Test();
		short s = 123;
		
		//short mùže být pøetypován na int takže se pøekryje print(int x)
		t.print(s);
		/*
		 * mùže být autoboxed na Object takže se pøekryje metodou print(Object x)
		 * lze Object b =  true;
		 */
		t.print(true);
		/*
		 * kdyby bylo 6.789f, tak se pøekryje print(float x) ale takto opìt pøekryje print(Object x)
		 * lze Object f =  6.789;
		 */
		t.print(6.789);
		
		//intObjectObject

	}

}
