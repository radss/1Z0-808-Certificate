package ce.whiz.chapter5;

public class W5cv26 {

	public static void main(String[] args) {
		int a [] = {3,2,1,0};
		int y = a.length;
		while(y>=0) {
			//kdy� u� m� y==0 tak je�t� v kodu chceme --y a vyflusne ArrayIndexOutOfOutboundException
			//pokud bychmo zm�nily na while(y>0) tak se dle p�edpokladu vytiskne 0123
			System.out.println(a[--y] + "index=" +y);			
		}

	}

}
