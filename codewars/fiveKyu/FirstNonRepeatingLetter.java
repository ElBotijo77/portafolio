package fiveKyu;
import java.util.*;
public class ZFirstNonRepeatingLetter {

	/*-------------------------------------------------------------------------------

	Encuentra la primera letra que no se repite en una cadena de texto dada. Si no 
	existe tal letra, devuelve una cadena vacía. Se deben ignorar mayúsculas y minúsculas
	La segunda funcion es una solucion mucho mas eficiente

	Ejemplos:
	"stress"    =  "t"
	"streSS"    =  "t"
	"Kk"        =  ""

	Kata: https://www.codewars.com/kata/52bc74d4ac05d0945d00054e

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {

		System.out.println(firstNonRepeatingLetter("streSS"));
		System.out.println(firstNonRepeatingLetterr("streSS"));

	}
	
	public static String firstNonRepeatingLetter(String s){
		List<String> lista = Arrays.asList(s.split(""));
		Set<String> ocu = new LinkedHashSet<String>(lista);
		int index = 0;
		
		for(String x: ocu) {
			for(String y: lista) {
				if( x.equalsIgnoreCase(y)) index++;
			}
			if(index == 1) return x;
			index = 0;
		}
		return "";
	}
	
	//Otra solucion factible usando indexOf, metodos bastante utilizados a partir de los kata 5
	
	  public static String firstNonRepeatingLetterr(String s){
		   String copy = s.toLowerCase();
		   for (int i = 0; i < copy.length(); i++) {
			   char c = copy.charAt(i);
			   if (copy.indexOf(c) == copy.lastIndexOf(c)) {
				   return s.substring(i, i + 1);
			   }
		   }
		   return "";
	  }
}
