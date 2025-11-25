package sixKyu;

import java.util.Set;

public class ZAreAlternative {

	/*-------------------------------------------------------------------------------

    La funcion comprueba si la cadena dada respeta un orden alternando entre vocales
    y consonantes

	Ejemplos:
    "amazon" --> true
    "apple" --> false
    "banana" --> true

	Kata: https://www.codewars.com/kata/59325dc15dbb44b2440000af
	
	-------------------------------------------------------------------------------*/	    
    public static void main(String[] args) {
        System.out.println(isAlt("banana"));
    }
    
    public static boolean isAlt(String word) {    
    	Set<Character> vowels = Set.of('a','e','i','o','u');
    	boolean[] arr = new boolean[word.length()];
    	boolean firstLetter = false;
    	
    	for(int i=0; i<word.length(); i++) {
    		if(vowels.contains(word.charAt(i))) arr[i] = true;
    	}

    	firstLetter = arr[0];
    	
    	for(int i=1; i<word.length(); i++) {
    		if(firstLetter == arr[i]) return false;
    		firstLetter = arr[i];
    	}	
    	return true;
    }
}
