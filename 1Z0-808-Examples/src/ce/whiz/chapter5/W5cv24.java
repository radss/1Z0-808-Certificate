package ce.whiz.chapter5;

import static java.lang.Integer.*;
//bez tohoto importu by se propsala statická konstant defualt classy Integer MAX_VALUE a vše ok
import static ce.whiz.chapter5.pack.SpeedMeter.*;

/*
 * Protože jsou volány 2 kosntanty se stejným jménem (MAX_VALUE) kompilátor nemùže zjistit (compiler cannot
 * fugure out), která má být použita.
 */
public class W5cv24 {

	public static void main(String[] args) {
		System.out.println(MAX_VALUE);

	}

}
