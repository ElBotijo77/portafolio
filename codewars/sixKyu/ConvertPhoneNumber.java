package sixKyu;

public class ZConvertPhoneNumber {
	
	/*-------------------------------------------------------------------------------

	Devuelve un String con el formato de numero de telefono (123) 456-7890 a partir
	de un array de 10 enteros que representan los digitos del numero de telefono.
	
	Ejemplo:
	(1, 2, 3, 4, 5, 6, 7, 8, 9, 0) returns "(123) 456-7890"

	Se presentan dos soluciones, en la que una de ellas es mediante String.format()

	Kata: https://www.codewars.com/kata/525f50e3b73515a6db000b83

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		int[] matriz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		System.out.println(createPhoneNumber(matriz));
		System.out.println(createPhoneNumberFormat(matriz));
		
	}
	
	public static String createPhoneNumber(int[] numbers) {
		String phrase = "(";
		
		for(Integer x: numbers) {
			phrase += String.valueOf(x);
		}

		StringBuilder cadena = new StringBuilder(phrase);
		
		cadena.insert(4, ")");
		cadena.insert(5, " ");
		cadena.insert(9, "-");
		
		return new String(cadena);
	}

	public static String createPhoneNumberFormat(int[] numbers) {
		return 	String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], 
				numbers[7], numbers[8],numbers[9]);
	}
}
