package sixKyu;

public class ZFindMissingLetter {

	/*-------------------------------------------------------------------------------	

	Pasando un array de caracteres por parametro, devolverá la letra "perdida" que
	hay segun el orden alfabetico. Ejemplo:

	['a','b','c','d','f'] -> 'e'
	['O','Q','R','S'] -> 'P

	Kata: https://www.codewars.com/kata/5839edaa6754d6fec10000a2

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		char[] c ={'O','Q','R','S'};
		System.out.println(findMissingLetter(c));

	}
	
	public static char findMissingLetter(char[] array){
	    for(int i=0; i<array.length-1; i++) {
	    	if(array[i]-array[i+1] == -1) continue;
	    	else return (char)(array[i]+1);
	    }
		return ' ';
	}
}
