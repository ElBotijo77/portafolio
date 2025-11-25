package sixKyu;

public class ZCamelCase {

	
	/*-------------------------------------------------------------------------------
	
	Convierte un String en fomarto CamelCase eliminando los posibles espacios
	
	"hello case" --> "HelloCase"
	"camel case word" --> "CamelCaseWord"

	Kata: https://www.codewars.com/kata/517abf86da9663f1d2000003

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {

		System.out.println(camelCase("hello case this is great!"));

	}
	
    public static String camelCase(String str) {
    	char[] c = str.toCharArray();
    	c[0] = Character.toUpperCase(c[0]);
    	
    	for(int i=0; i<c.length-1; i++) {
    		if(c[i] == ' ') c[i+1] = Character.toUpperCase(c[i+1]);
    	}
    	return (str == null || str.isEmpty())?"": new String(c).replaceAll(" ", "");
    }
}

