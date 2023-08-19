package ce.examples.chapter1.visitor;
//pro import jelly do classy AquariumVisitor lze pou��t jeden z t�chto import�
import ce.examples.chapter1.aquarium.jellies.Jelly;
//importuje v�echny classy v package aquarium.jellies co� zahrnuje i Jelly.class
import ce.examples.chapter1.aquarium.jellies.*;

/*
 * NELZE
 * import aquarium.*; - package nejsou hierarchick� ikdy� to tak m��e vypadat, importuje pouze Tank.class ��dnou hierarchii
 * import aquarium.*.Jelly; - blbost, nelze pou��t .*.
 * import aquarium.jellies.Jelly.*; - blbost, nelze ji� pou��t regul�r na samotn� classe (.Jelly.*). 
 * Nem��eme importovat ��sti t��d (v�jimkou jsou statick� imoprty pro statick� metody, konstanty..)

 */

public class AquariumVisitor {
	public void admire(Jelly jelly) { }
}
