package ce.examples.chapter6;

//cv18
public class ExceptionsTeorie5 {
	
	/**
	 * Which of the following are true? (Choose all that apply)
		A. Checked exceptions are allowed to be handled or declared. => možnost A ok
		
		B. Checked exceptions are required to be handled or declared.
		=> možnost B ok
		
		C. Errors are allowed to be handled or declared.
		=> možnost C ok (ale nedoporuèuje se...když je error (chytne pc) tak se má vše zboøit..
		
		D. Errors are required to be handled or declared.
		
		
		E. Runtime exceptions are allowed to be handled or declared.
		=> možnost C ok 
		
		F. Runtime exceptions are required to be handled or declared.
		=>není nakázáno ošetøit
		
		Checked výjimky MUSÍ být zpracovány (try catch) nebo deklarovány (metoda má throws)..jinak 
		asi compile fails.
		
		 RuntimeExceptions JE POVOLENO
		 zpracovávat nebo deklarovat (ale nikoliv nakázáno jako u checked). 
		
		Errors je dovoleno øešit popø prohlásil, ale to je špatná praxe.
	 */

}
