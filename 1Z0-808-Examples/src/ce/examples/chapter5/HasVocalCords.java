package ce.examples.chapter5;

public interface HasVocalCords {
	public abstract void makeSound();
}

/*ok interfejs který dìdí z jiného interfejsu nemusí z tohod dìdìného implementovat metody
 =>je to stejné jako abstract class A implements SomeI
 
 Každá tøída, která ale bude implementovat CanBark, automaticky dìdí jeho metody, 
 stejnì jako všechny zdìdìné metody definované v nadøazeném interfejsu.
 */ 
interface CanBark extends HasVocalCords {
	public void bark();
}
