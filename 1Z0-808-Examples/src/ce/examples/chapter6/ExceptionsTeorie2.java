package ce.examples.chapter6;

//cv13  
public class ExceptionsTeorie2 {
	/**
	 * T��dy uveden� v ��sti throws deklarace metody mus� extendovat
	   java.lang.Throwable => to zahrnuje Error, Exception a RuntimeException.
	   =>Nemohou zde b�t t��dy, jako je String. 
	   
	   Jak�koli typ Java, v�etn� Exceptions, mohou b�t deklarov�ny jako n�vratov� typ. 
	   =>To v�ak jednodu�e vr�t� objekt sp�e ne� hodit v�jimku.
	   
	   M��ete deklarovat metodu s Exception jako n�vratov�m typem. => mo�nost A ok
	   
	   V ��sti throws deklarace metody m��ete deklarovat jakoukoli podt��du/subclassu Error. => mo�nost B ok
	   
	   V ��sti throws metody m��ete deklarovat jakoukoli podt��du Exception => mo�nost C ok
	   
	   V ��sti throws metody m��ete deklarovat jakoukoli podt��du RuntimeException
	   prohl�en�. => mo�nost E ok
	   
	   
	 */

}
