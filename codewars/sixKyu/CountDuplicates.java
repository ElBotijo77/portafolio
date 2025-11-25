package sixKyu;

import java.util.HashSet;
import java.util.Set;

	/*-------------------------------------------------------------------------------
	
	Delvuelve el numero de ocurrencias que hay en un String, siendo insensitive-case
	
	abcde" -> 0 # no characters repeats more than once
	"aabbcde" -> 2 # 'a' and 'b'
	"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)

	"Kata: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
	
	-------------------------------------------------------------------------------*/


public class ZCountDuplicates {
	public static void main(String[] args) {
		System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}


	public static int duplicateCount(String text) {
	
		Set<Character> lista = new HashSet<Character>();
	    Set<Character> duplicados = new HashSet<Character>();
		text = text.toLowerCase();
		
	  
	    for(int i=0; i<text.length(); i++) {
	    	if(lista.add(text.charAt(i))) {}
	    	else duplicados.add(text.charAt(i));	
	    }
	    return duplicados.size();
	  }	
}
