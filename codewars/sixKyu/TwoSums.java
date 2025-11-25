package sixKyu;

import java.util.Arrays;
import java.util.List;

public class ZTwoSums {
		
	/*-------------------------------------------------------------------------------
	
	Basado en el problema TwoSums de LeetCode, este codigo busca dos elementos en un
	array que la suma de los numeros de como resultado el numero target elejido. Se 
	ofrecen dos ejemplos de soluciones con matices diferentes, como una conversion
	mediante Streams 

	two_sum([1, 2, 3], 4) == {0, 2}
	two_sum([3, 2, 4], 6) == {1, 2}
	numbers: [2, 2, 3], target: 4, expected: [0, 1]

	NOTA: Funciona con ciertas inconsistencias en arrays mas grandes, no buscando 
	la primera ocurrencia aunque de un resultado correcto 

	Kata: https://www.codewars.com/kata/52c31f8e6605bcc646000082

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {

		int[] arr1 = twoSum(new int[]{1,2,3}, 4);
		int[] arr2 = twoSum(new int[]{3,2,4}, 6);
		
		IO.print(Arrays.toString(arr1));
		IO.print(Arrays.toString(arr2));

	}
	
	
   public static int[] twoSumS(int[] numbers, int target) {
    	List<Integer> lista = Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new));
    	int[] index = new int[2];

    	for(int i=0; i<numbers.length;i++) {
    		for(int j=0; j<numbers.length; j++) {
    			if((i !=j) && (numbers[i] + numbers[j] == target)) {
    				index[0] = lista.indexOf(numbers[i]);
    				index[1] = lista.indexOf(numbers[j]);
    				break;
    			}   			
    		}
    	}
    	Arrays.sort(index);
        return index;
    }
    
    public static int[] twoSum(int[] numbers, int target) {
    	int[] index = new int[2];
    	
    	for(int i=0; i<numbers.length;i++) {
    		for(int j=0; j<numbers.length; j++) {
    			if((i !=j) && (numbers[i] + numbers[j] == target)) {
    				index[0] = j;
    				index[1] = i;
    			}   			
    		}
    	}
    	return index;
    }
}
