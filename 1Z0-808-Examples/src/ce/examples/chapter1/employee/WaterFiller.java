package ce.examples.chapter1.employee;

//LZE - vezme se Water p��mo pod .aquarium
import ce.examples.chapter1.aquarium.*;

//LZE - vezme se Water p��mo pod .aquarium
import ce.examples.chapter1.aquarium.Water;
import ce.examples.chapter1.aquarium.*;

//LZE - vezme se Water p��mo z .jellies.Water
import ce.examples.chapter1.aquarium.*;

//zde chyba proto�e ji� Water.class importov�na NAP��MO jako ce.examples.chapter1.aquarium.Water, 
/*kdybychom ale tento p��m� import zakomentovali tak ok a nap��mo se importuje
  z ce.examples.chapter1.jellies.Water
*/
import ce.examples.chapter1.aquarium.jellies.Water;

/*
 * NELZE - java nev� jakou Water.class pomoc� wildcars .*
 * import aquarium.*;
 * import aquarium.jellies.*;
 * 
 * NELZE - nem��eme natvrdo/nap��mo importovat 2 stejn� pojmenovan� classy java je pak zmaten�
 * import aquarium.Water;
 * import aquarium.jellies.Water;
 */


public class WaterFiller {
	Water water;
}
