package ce.whiz.chapter5;

import static java.lang.Integer.*;
//bez tohoto importu by se propsala statick� konstant defualt classy Integer MAX_VALUE a v�e ok
import static ce.whiz.chapter5.pack.SpeedMeter.*;

/*
 * Proto�e jsou vol�ny 2 kosntanty se stejn�m jm�nem (MAX_VALUE) kompil�tor nem��e zjistit (compiler cannot
 * fugure out), kter� m� b�t pou�ita.
 */
public class W5cv24 {

	public static void main(String[] args) {
		System.out.println(MAX_VALUE);

	}

}
