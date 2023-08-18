package ce.examples.chapter5;

public interface HasExoskeleton {
	abstract int getNumberOfSections();

}

//ok - abstract classa NEMUS� implementovat metody z interfacu
abstract class Insect implements HasExoskeleton{
	abstract int getNumberOfLegs();
}

/*�patn� - classa Beetle sice (POVINN�) implementuje abstraktn� metodu z abstract classy
  ale MUS� tak� implementovat metodu z interfejsu, kter� implementuje abastract classa Insect ze kter� d�d�.
  Teoreticky (to zde asi nen� zkou�eno) mo�n� ��ci �e v jednom java souboru m��e b�t
  pouze jedna public classa, tak�e dokud nesma�eme public class Beaver, tak compilation error.
*/
public class Beetle extends Insect {
	int getNumberOfLegs() { return 6; }
}