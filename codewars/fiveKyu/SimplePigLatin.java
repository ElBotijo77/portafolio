package fiveKyu;

public class ZSimplePigLatin {

	/*-------------------------------------------------------------------------------

	Codificar un String dado segun las siguientes reglas:
	Se movera la primera letra de cada palabra al final y anadir anadir al final "ay" 
	Los signos de puntuacion se deben ignorar
	
	Ejemplos:
	"Pig latin is cool"      =  "igPay atinlay siay ool
	"Hello world !"          =  "elloHay orldway !"

	Kata: https://www.codewars.com/kata/520b9d2ad5c005041100000f

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		System.out.println(pigLatin("4 Hello world !"));

	}
	
	public static String pigLatin(String str) {
		String[] s = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length; i++) {
			if((s[i].length() == 1) && (Character.isAlphabetic(s[i].charAt(0)) == false))  {
				if(Character.isDigit(s[i].charAt(0)) == true) sb.append(s[i] + "ay");
				else sb.append(s[i]);
			} else {
				sb.append(s[i].substring(1, s[i].length()) + s[i].substring(0, 1) + "ay");
			}
			if(i != s.length) sb.append(" ");
		}	
		return new String(sb);
	}
}
