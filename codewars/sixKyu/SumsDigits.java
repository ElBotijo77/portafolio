package sixKyu;

public class ZSumsDigits {
    
	/*-------------------------------------------------------------------------------
	
	Dado n, toma la suma de los dígitos de n. Si ese valor tiene más de un dígito, 
    continúa reduciéndolo de esta manera hasta que se produzca un número de un solo 
    dígito. La entrada será un número entero no negativo.

	Ejemplos:
    16  -->  1 + 6 = 7
    942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
    132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
    493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

	Kata: https://www.codewars.com/kata/541c8630095125aba6000c00
    
	-------------------------------------------------------------------------------*/	

	public static void main(String[] args) {

		System.out.println(digital_root(493193));

	}

    public static int digital_root(int n) {
	    int nummer = n;
		
		while(String.valueOf(nummer).length() > 1) {	
			nummer = sumDigit(nummer);	
		}
		return nummer;
	}	
	
	public static int sumDigit(int number) {
		String conver = String.valueOf(number);
		int acum = 0;

		for(int i=0; i<conver.length(); i++) {
			acum += Character.getNumericValue(conver.charAt(i)); 			
		}		
		return acum;
	}
}