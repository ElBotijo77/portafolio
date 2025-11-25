package sixKyu;

public class ZBreakCamelCasing {

	
	/*-------------------------------------------------------------------------------
	
	Elimina el formato CamelCase añadiendo un espacio al String resultante tras
	cada caracter en mayusculas que encuetra
	
	"camelCasing"  =>  "camel Casing"
	"identifier"   =>  "identifier"
	""             =>  ""

	 Kata: https://www.codewars.com/kata/5208f99aee097e6552000148

	-------------------------------------------------------------------------------*/

	public static void main (String[] args) {
		System.out.println(camelCase("caMelLasLmsJS"));
	}
	
	public static String camelCase(String input) {
		StringBuilder s = new StringBuilder();
		char c = ' ';
	
		for(int i=0; i<input.length(); i++) {
			c = input.charAt(i);
			if(c != 0 && Character.isUpperCase(c)) {
				s = s.append(" ");
			}
			s.append(c);
		}
		return new String(s);
	  }
}
