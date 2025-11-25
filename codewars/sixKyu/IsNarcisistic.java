package sixKyu;

public class ZIsNarcisistic {

	/*-------------------------------------------------------------------------------	

	Un numero es narcisista cuando la suma de sus productos elevado al numero de sus 
	digitos da el mismo resultado que el propio numero

	1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
	1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938

	Este programa devuelve un booleano indicando si dicho numero lo es. Se expresan
	dos formas distintas de realizar este problema

	Kata: https://www.codewars.com/kata/5287e858c6b5a9678200083c

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		System.out.println(isNarcisistic(1938));
		System.out.println(isNarcisistics(153));

	}
	
	public static boolean isNarcisistic(int number) {
		String s = new String(Integer.toString(number));
		int longitud = String.valueOf(number).length();
		
		int n = 0;
		
		for(int i=0; i<longitud; i++) {
			n += Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))), longitud);
		}
		return n == number;
	 	}
	
	
	public static boolean isNarcisistics(int number) {
		char[] c = ("" + number).toCharArray();
		int n = 0;
		
		for(Character x: c) {
			n += Math.pow(Integer.parseInt(String.valueOf(x)), c.length);
		}
		return n == number;
	}
}	
