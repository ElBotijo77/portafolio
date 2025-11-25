package fiveKyu;

import java.util.*;

public class ZScramblies {

	/*-------------------------------------------------------------------------------
	
	Comprueba mediante un booleano si con la primera cadena se puede formar la 
	segunda cadena. No se incluyen mayusculas ni signos de puntuacion

	Ejemplos:
	scramble('rkqodlw', 'world') ==> True
	scramble('cedewaraaossoqqyt', 'codewars') ==> True
	scramble('katas', 'steak') ==> False

	Kata: https://www.codewars.com/kata/55c04b4cc56a697bb0000048

	-------------------------------------------------------------------------------*/ 	

	public static void main(String[] args) {

		System.out.println(scramblee("scriptjavx","scriptjava"));
		
	}
	
    public static boolean scramblee(String str1, String str2) { 
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	
    	for(Character x: str1.toCharArray()) {
    		map.put(x, map.getOrDefault(x, 0)+1);
    	}
    	
    	for(int i=0; i<str2.length(); i++) {
    		char c = str2.charAt(i);
    		
    		if(map.containsKey(c) && map.get(c) > 0) map.put(c, map.getOrDefault(c, 0)-1);
    		else return false;
    	}	
    	return true;
      }	
}
