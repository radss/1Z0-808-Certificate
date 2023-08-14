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
		/*zde poprv� inicializujeme odkazem Order. V tomto okam�iku se inicializuje statika result (Order.result)
		  Statick� inicializace se pust� pouze jednou a pak se do n� stringy p�i�itaj� (stejn� jako t�eba stat. count v 
		  konstruktoru).
		*/
		//static result nyn� obsahuje u
		System.out.print(Order.result+ " ");
		//static result nyn� obsahuje u u
		System.out.print(Order.result+ " ");

	    /* zde vytv���me nov� objedn�vky. statika result je ale ji� d�ky Order.result incializovan�
		 * a tak se k n� stringy p�id�vaj�
		 * nikoliv �e se s new Order() op�t za�ne nanovo (result="";)!!
		 * ke static result se p�id�vaj� stringy z instan�n�ch incializ�tor� v po�ad� jak�m jsou zaps�ny
		 */		
		//static result nyn� obsahuje u ucr
		new Order();
		//static result nyn� obsahuje u ucrcr
		new Order();
		/*
		 * zde se zase p�id� string "u" ze statick�ho incializ�toru ale jde p�ed stringy z instan�n�ch incializ�tor�
		 * proto�e statick� incializ�tor jde p�ed instan�n� inicializ�try a�koliv je zde Order.result v main na 
		 * posledn�m m�st�
		*/
		//static result nyn� obsahuje u u ucrcr
		//bez tohoto printu by se ale vytisklo pouze u u proto� p�id�n� new Order() new Order() by se nevytisklo
		System.out.print(Order.result+ " ");

		//klidn� by taky �lo a to by se vytisklo u u ucrcr ucrcrcr
		//zopakuje p�edchoz� string ulo�en� v result (u u ucrcr) a p�id� ucrcrcr)
		System.out.print(new Order().result+ " "); 

	}

}
