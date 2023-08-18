package ce.examples.chapter5;

public interface HasExoskeleton {
	abstract int getNumberOfSections();

}

//ok - abstract classa NEMUSÍ implementovat metody z interfacu
abstract class Insect implements HasExoskeleton{
	abstract int getNumberOfLegs();
}

/*špatnì - classa Beetle sice (POVINNÌ) implementuje abstraktní metodu z abstract classy
  ale MUSÍ také implementovat metodu z interfejsu, který implementuje abastract classa Insect ze které dìdí.
  Teoreticky (to zde asi není zkoušeno) možné øíci že v jednom java souboru mùže být
  pouze jedna public classa, takže dokud nesmažeme public class Beaver, tak compilation error.
*/
public class Beetle extends Insect {
	int getNumberOfLegs() { return 6; }
}