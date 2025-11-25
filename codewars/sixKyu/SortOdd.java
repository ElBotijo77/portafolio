package sixKyu;

import java.util.*;

public class ZSortOdd {

	/*-------------------------------------------------------------------------------
	
	Del array dado, ordena solo los numeros impares en orden ascendente, dejando en su 
	posicion los pares

	Ejemplos:
	[7, 1]  =>  [1, 7]
	[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
	[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]

	Kata: https://www.codewars.com/kata/578aa45ee9fd15ff4600090d

	-------------------------------------------------------------------------------*/ 	

	public static void main(String[] args) {

		System.out.println(Arrays.toString(sortArrayy(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));

	}
	
	public static int[] sortArrayy(int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		int tamano = array.length;
		int[] result = new int[tamano];
		int index = 0, indexList = 0;
		
		for(Integer x: array) {
			if(x % 2 != 0) list.add(x);
		}
		
		Collections.sort(list);
		
		for(Integer x: array) {
			if(x % 2 == 0) result[index] = x;
			else {
				result[index] = list.get(indexList);
				indexList++;
			}
			index++;
		}	
		return result;
	}
}
