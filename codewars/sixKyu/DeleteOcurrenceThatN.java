package sixKyu;

import java.util.*;
import java.util.stream.Collectors;

public class ZDeleteOcurrenceThatN {

	/*-------------------------------------------------------------------------------

	Elimina las ocurrencias de un elemento en un array si estas aparecen un numero
	de veces superior al pasado por parametro. Se conserva el orden original de los 
	elementos.
	
	Ejemplo:
	([1,2,3,1,1,2,1,2,3,3,2,4,5,3,1], 3 ) = [1,2,3,1,1,2,3,3,2,4,5]

	Kata: https://www.codewars.com/kata/554ca54ffa7d91b236000023
	
	-------------------------------------------------------------------------------*/

	public static void main(String[]args) {
		
		int[] sinOcu = deleteNth( new int[]{ 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 );
		
		System.out.println(Arrays.toString(sinOcu));
		
	}
	
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		Set<Integer> lista = Arrays.stream(elements).boxed().collect(Collectors.toSet());
		Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();

		for(Integer x: lista) {
			mapa.put(x, 0);
		}
		
		for(int i=0; i<elements.length; i++) {
			mapa.replace(elements[i], mapa.get(elements[i])+1);	
			if(mapa.get(elements[i]) <= maxOccurrences) result.add(elements[i]);
		}
		return 	result.stream().mapToInt(Integer::intValue).toArray();
	}
}
