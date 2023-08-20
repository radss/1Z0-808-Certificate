package ce.examples.chapter6;

//cv13  
public class ExceptionsTeorie2 {
	/**
	 * Tøídy uvedené v èásti throws deklarace metody musí extendovat
	   java.lang.Throwable => to zahrnuje Error, Exception a RuntimeException.
	   =>Nemohou zde být tøídy, jako je String. 
	   
	   Jakýkoli typ Java, vèetnì Exceptions, mohou být deklarovány jako návratový typ. 
	   =>To však jednoduše vrátí objekt spíše než hodit výjimku.
	   
	   Mùžete deklarovat metodu s Exception jako návratovým typem. => možnost A ok
	   
	   V èásti throws deklarace metody mùžete deklarovat jakoukoli podtøídu/subclassu Error. => možnost B ok
	   
	   V èásti throws metody mùžete deklarovat jakoukoli podtøídu Exception => možnost C ok
	   
	   V èásti throws metody mùžete deklarovat jakoukoli podtøídu RuntimeException
	   prohlášení. => možnost E ok
	   
	   
	 */

}
