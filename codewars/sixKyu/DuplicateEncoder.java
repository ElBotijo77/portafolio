package sixKyu;

import java.util.HashSet;
import java.util.Set;

public class ZDuplicateEncoder {

	/*-------------------------------------------------------------------------------

	Codifica una cadena de texto dada de la siguiente manera: Cada letra que aparezca solo
	una vez se convierte en "(", y cada letra que aparezca más de una vez se convierte en ")".

	Ejemplos:
	"din"      =>  "((("
	*"recede"   =>  "()()()"
	*"Success"  =>  ")())())"
	*"(( @"     =>  "))(("

	Kata: https://www.codewars.com/kata/54b42f9314d9229fd6000d9c

	-------------------------------------------------------------------------------*/
	
	public static void main(String[] args) {
		
		new ZDuplicateEncoder();

	}
	
	String phrase = "Success"; 
	
	public ZDuplicateEncoder() {
		System.out.println(encode(phrase));
	}
	
	static String encode(String word){
		Set<Character> duplicados = new HashSet<Character>();
		Set<Character> lista = new HashSet<Character>();
	    String cambio = word.toLowerCase();
	    String result = "";
	    
	    for(Character x: cambio.toCharArray()) {
	    	if(!lista.add(x)) 
	    		if(duplicados.add(x));
	    }	

	    for(int i=0; i<word.length(); i++) {
	    	if(duplicados.contains(cambio.charAt(i))) result += ")";
	    	else result += "(";
	    }
		return result;
	}
}


