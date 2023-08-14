package ce.examples.chapter4;

class Order{
	static String result = "";
	{result+="c";}
	
	static
	{result+="u";}
	{result+="r";}
	
}

public class OrderDriver {
	

	public static void main(String[] args) {
		/*zde poprvé inicializujeme odkazem Order. V tomto okamžiku se inicializuje statika result (Order.result)
		  Statická inicializace se pustí pouze jednou a pak se do ní stringy pøièitají (stejnì jako tøeba stat. count v 
		  konstruktoru).
		*/
		//static result nyní obsahuje u
		System.out.print(Order.result+ " ");
		//static result nyní obsahuje u u
		System.out.print(Order.result+ " ");

	    /* zde vytváøíme nové objednávky. statika result je ale již díky Order.result incializovaná
		 * a tak se k ní stringy pøidávají
		 * nikoliv že se s new Order() opìt zaène nanovo (result="";)!!
		 * ke static result se pøidávají stringy z instanèních incializátorù v poøadí jakém jsou zapsány
		 */		
		//static result nyní obsahuje u ucr
		new Order();
		//static result nyní obsahuje u ucrcr
		new Order();
		/*
		 * zde se zase pøidá string "u" ze statického incializátoru ale jde pøed stringy z instanèních incializátorù
		 * protože statický incializátor jde pøed instanèní inicializátry aèkoliv je zde Order.result v main na 
		 * posledním místì
		*/
		//static result nyní obsahuje u u ucrcr
		//bez tohoto printu by se ale vytisklo pouze u u protož pøidání new Order() new Order() by se nevytisklo
		System.out.print(Order.result+ " ");

		//klidnì by taky šlo a to by se vytisklo u u ucrcr ucrcrcr
		//zopakuje pøedchozí string uložený v result (u u ucrcr) a pøidá ucrcrcr)
		System.out.print(new Order().result+ " "); 

	}

}
