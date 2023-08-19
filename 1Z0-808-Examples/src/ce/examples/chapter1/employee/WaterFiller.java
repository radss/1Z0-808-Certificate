package ce.examples.chapter1.employee;

//LZE - vezme se Water pøímo pod .aquarium
import ce.examples.chapter1.aquarium.*;

//LZE - vezme se Water pøímo pod .aquarium
import ce.examples.chapter1.aquarium.Water;
import ce.examples.chapter1.aquarium.*;

//LZE - vezme se Water pøímo z .jellies.Water
import ce.examples.chapter1.aquarium.*;

//zde chyba protože již Water.class importována NAPØÍMO jako ce.examples.chapter1.aquarium.Water, 
/*kdybychom ale tento pøímý import zakomentovali tak ok a napøímo se importuje
  z ce.examples.chapter1.jellies.Water
*/
import ce.examples.chapter1.aquarium.jellies.Water;

/*
 * NELZE - java neví jakou Water.class pomocí wildcars .*
 * import aquarium.*;
 * import aquarium.jellies.*;
 * 
 * NELZE - nemùžeme natvrdo/napøímo importovat 2 stejnì pojmenované classy java je pak zmatená
 * import aquarium.Water;
 * import aquarium.jellies.Water;
 */


public class WaterFiller {
	Water water;
}
