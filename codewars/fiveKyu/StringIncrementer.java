package fiveKyu;

public class ZStringIncrementer {

	/*-------------------------------------------------------------------------------

	Esta funcion incrementa en 1 unidad la parte numerica del String que se pasa como
	parametro del metodo. Se debe cumplir las siguientes normas:
	-Si la cadena ya termina con un número, este debe incrementarse en 1.
	-Si la cadena no termina con un número, se debe añadir el número 1 a la nueva cadena
	
	Ejemplos:
	"foo"      = "foo1"
	"foobar23" = "foobar24"
	"foo0042"  = "foo0043"
	"foo9"     = "foo10"
	"foo099"   = "foo100"

	Nota: Se presentan dos soluciones, en la que la segunda es mas eficiente pero no
	cumple con las exigencias estrictas del problema ya que no mantiene los ceros a la
	izquierda pero es mas facil de mantener. La primera da un resultado correcto pero
	con la desventaja de un dificil mantenimiento y comprension.

	Kata: https://www.codewars.com/kata/54a91a4883a7de5d7800009c

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		System.out.println(incrementString("foo0099"));
		System.out.println(incrementStringDos("foo0099"));
	}
	
	public static String incrementString(String str) {
		if(str.isEmpty()) return "";
		StringBuilder sb = new StringBuilder(str);
		sb = sb.reverse();
		int count = 0;
		
		for(int i=0; i<sb.length(); i++) {
			if((i == 0) && (sb.charAt(i) == '9')) {
				count++;
				sb.setCharAt(i, '0');
			}
			if(count == i && (count > 0 && (sb.charAt(i) == '9'))) {
				count++;
				sb.setCharAt(i, '0');
			}
		}	
		if(count != sb.length() && (sb.charAt(count) >= 48 && sb.charAt(count) <=57)) {
			sb.setCharAt(count, (char)(sb.charAt(count) + 1));
		}else {
			sb.insert(count, 1);
		}	
		return new String(sb.reverse());
	}
	
	public static String incrementStringDos(String str) {
		StringBuilder sb = new StringBuilder();
		StringBuilder n = new StringBuilder();
		boolean isDigit = false;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(c>=48 & c<=57) isDigit = true;
			if(!isDigit) sb.append(c);
			if(isDigit) n.append(c);
		}
		int numb = Integer.valueOf(new String(n)) + 1;		
		return new String(sb) + numb;
	}
}
