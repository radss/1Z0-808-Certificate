package ce.examples.chapter1.visitor;
//pro import jelly do classy AquariumVisitor lze použít jeden z tìchto importù
import ce.examples.chapter1.aquarium.jellies.Jelly;
//importuje všechny classy v package aquarium.jellies což zahrnuje i Jelly.class
import ce.examples.chapter1.aquarium.jellies.*;

/*
 * NELZE
 * import aquarium.*; - package nejsou hierarchické ikdyž to tak mùže vypadat, importuje pouze Tank.class žádnou hierarchii
 * import aquarium.*.Jelly; - blbost, nelze použít .*.
 * import aquarium.jellies.Jelly.*; - blbost, nelze již použít regulár na samotné classe (.Jelly.*). 
 * Nemùžeme importovat èásti tøíd (výjimkou jsou statické imoprty pro statické metody, konstanty..)

 */

public class AquariumVisitor {
	public void admire(Jelly jelly) { }
}
