package ce.examples.chapter5;

public class AbstractInterfaceTeorie {
 /**
  * a) abstract classy i interfacy mohou obsahovat public static final prom�nn�
  * b) abstract classy i interfacy mohou pou��vat extends keyword
  * c) abstract classy i interfacy mohou m�t static metody
  * 
  * d) abstract classy i interfacy NEMOHOU  b�t instanciov�ny nap��mo ale skrze child classu
  * (nap� List list = new ArrayList()...)
  * 
  * A�koli instance objektu, kter� implementuje rozhran�, d�d� java.lang.Objekt,
	samotn� rozhran� ne; jinak by Java podporovala v�cen�sobnou d�di�nost pro objetky, co� tak nen�.
	Mo�nost G je tedy nespr�vn� => abstract classy d�d� Object ALE interfejsy NED�D� Object!!!
  */
}
