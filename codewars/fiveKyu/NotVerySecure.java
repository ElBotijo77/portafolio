package fiveKyu;

public class ZNotVerySecure {

	/*-------------------------------------------------------------------------------

	Escribe una funcion que compruebe si una cadena de texto es alfanumerica.
	Se considera formato alfanumerico si solo contiene letras y/o numeros.
	
	Ejemplos:

	"abc123"     =  true
	"abc 123"    =  false
	"abc-123"    =  false
	"abc.123"    =  false
	"abc_123"    =  false

	Kata: https://www.codewars.com/kata/526dbd6c8c0eb53254000110

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {

		System.out.println(alphanumeric("abcdefg...hij-klmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));

	}
	public static boolean alphanumeric(String s){
		if(s.isEmpty()) return false;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(!((c>=48 && c<=57) || (c >= 65 && c<=90) || (c>=97 && c<=122))) {
				return false;
			}
		}
		return true;
	}	  
}
