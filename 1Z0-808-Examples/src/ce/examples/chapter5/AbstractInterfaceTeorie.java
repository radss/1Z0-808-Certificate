package ce.examples.chapter5;

public class AbstractInterfaceTeorie {
 /**
  * a) abstract classy i interfacy mohou obsahovat public static final promìnné
  * b) abstract classy i interfacy mohou používat extends keyword
  * c) abstract classy i interfacy mohou mít static metody
  * 
  * d) abstract classy i interfacy NEMOHOU  být instanciovány napøímo ale skrze child classu
  * (napø List list = new ArrayList()...)
  * 
  * Aèkoli instance objektu, který implementuje rozhraní, dìdí java.lang.Objekt,
	samotné rozhraní ne; jinak by Java podporovala vícenásobnou dìdiènost pro objetky, což tak není.
	Možnost G je tedy nesprávná => abstract classy dìdí Object ALE interfejsy NEDÌDÍ Object!!!
  */
}
