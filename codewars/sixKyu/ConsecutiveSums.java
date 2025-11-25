package sixKyu;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List;

public class ZConsecutiveSums {

	/*-------------------------------------------------------------------------------

	Suma los numeros consecutivos siempre y cuando sean iguales. El negativo de un 
	numero se considera diferente.

	Ejemplo:
	sumConsecutives([1,1,7,7,3]) = [2,14,3]

	Kata: https://www.codewars.com/kata/55eeddff3f64c954c2000059

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		sumConsecutives(Arrays.asList(1,1,7,7,3)).stream().forEach(s -> System.out.print(s + " "));

	}
	
    public static List<Integer> sumConsecutives(List<Integer> s) {
       List<Integer> lista = new ArrayList<Integer>();
       int comodin = 0, n = 0, index = 0;
       
       for(int i=0; i<s.size(); i++) {
    	   comodin = s.get(i);
    	   if(i != s.size()-1 && comodin == s.get(i+1)) {
    		   n = comodin;
    		   index++;
    	   } else {
    		   if(index != 0) {
    			   lista.add(n * (index  + 1));
    			   index = 0;
    		   }else {
    			   lista.add(comodin);
    		   }
    	   }
       }
       return lista;
    }
}