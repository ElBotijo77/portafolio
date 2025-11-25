package sixKyu;

import java.util.*;

public class ZFindOddInt {

	/*-------------------------------------------------------------------------------

	Dado un array de números enteros, encuentra el que aparece un número impar de veces.
	Siempre habrá un solo número entero que aparece como tal.
	
	Ejemplos:
	[1,2,2,3,3,3,4,3,3,3,2,2,1] = 4
	[1,1,2,-2,5,2,4,4,-1,-2,5] = -1

	Kata: https://www.codewars.com/kata/54da5a58ea159efa38000836

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		System.out.println(findIt(new int[] {1,2,2,3,3,3,4,3,3,3,2,2,1}));

	}
	
	public static int findIt(int[] a) {
		if(a.length % 2 == 0) return 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<a.length; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
			if(entry.getValue() % 2 != 0) return entry.getKey();
		}
		return a[0];
	  }
}
