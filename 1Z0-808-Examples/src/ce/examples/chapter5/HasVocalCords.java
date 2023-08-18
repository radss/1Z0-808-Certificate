package ce.examples.chapter5;

public interface HasVocalCords {
	public abstract void makeSound();
}

/*ok interfejs kter� d�d� z jin�ho interfejsu nemus� z tohod d�d�n�ho implementovat metody
 =>je to stejn� jako abstract class A implements SomeI
 
 Ka�d� t��da, kter� ale bude implementovat CanBark, automaticky d�d� jeho metody, 
 stejn� jako v�echny zd�d�n� metody definovan� v nad�azen�m interfejsu.
 */ 
interface CanBark extends HasVocalCords {
	public void bark();
}
