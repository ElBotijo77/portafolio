package sixKyu;

public class ZMexicanWave {

	/*-------------------------------------------------------------------------------

	Genera una "ola mexicana" a partir de un String, donde se debera poner en mayuscula
	la letra que corresponda al numero de iteracion. Se ingnoran los espacios en blanco.
	
	Ejemplo:
	"two words" = "Two words", "tWo words", "twO words", "two Words", "two wOrds",
	"two woRds", "two worDs", "two wordS"]

	Kata: https://www.codewars.com/kata/58f5c63f1e26ecda7e000029

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		String[] s = wave("Two words");
		
		for(String x: s) {
			System.out.print(x + " ");
		}
		
	}
	
	public static String[] wave(String str) {
		if(str.isEmpty()) return new String[] {};
		
		String frase = str.toLowerCase();
		StringBuilder sb = new StringBuilder(frase);
		String cadena = "";
		
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i) != ' ') {
				sb.setCharAt(i, Character.toUpperCase(frase.charAt(i)));
				cadena += sb.toString() + ",";
				sb.replace(0, frase.length(), frase);
			} 
		}
		String[] s = cadena.split(",");
		return s;
	}
}