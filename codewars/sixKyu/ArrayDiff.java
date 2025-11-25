package sixKyu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ZArrayDiff {

	/*-------------------------------------------------------------------------------

	Implemente una función que calcule la diferencia entre dos listas. La función 
	debe eliminar todas las ocurrencias de los elementos de la primera lista (a) 
	que estén presentes en la segunda lista (b). El orden de los elementos de la 
	primera lista debe conservarse en el resultado.

	Ejemplo:
	arrayDiff([1,2,2,2,3], [2]) = [1,3]

	Nota: Para practicar el uso de Streams en Java, se ha utilizado este paradigma 
	para resolver el problema.

	Kata: https://www.codewars.com/kata/523f5d21c841566fde000009

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		int[] n1 = {1,2,2,2,3};
		int[] n2 = {2};
		
		System.out.println(Arrays.toString(arrayDiff(n1,n2)));

	}
	
	public static int[] arrayDiff(int[] a, int[] b) {
		if(b.length == 0 || a.length == 0) return a;
		
		List<Integer> lista = Arrays.stream(a)
									.boxed()
									.collect(Collectors.toList());
		
		lista.removeAll(Arrays.stream(b)
							  .boxed()
							  .collect(Collectors.toList()));
		
		int[] result = lista.stream()
							.mapToInt(Integer::intValue)
							.toArray();		
		return result;
	}
}
