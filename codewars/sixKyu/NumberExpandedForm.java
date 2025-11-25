package sixKyu;

public class ZNumberExpandedForm {

	/*-------------------------------------------------------------------------------

	Devuelve el numero en su forma expandida en el formato del ejemplo, donde cada cifra
	es multiplicada por el valor posicional que ocupa.

	Ejemplo:
	70304  =  "70000 + 300 + 4"

	Kata: https://www.codewars.com/kata/5842df8ccbd22792a4000245

	-------------------------------------------------------------------------------*/	

	public static void main(String[] args) {

		System.out.println(expandedForm(80804));

	}
	
	public static String expandedForm(int num) {
		String[] unitario = String.valueOf(num).split("");
		String suma = "";
		int tamano = unitario.length;

		for(int i=0; i<tamano; i++) {
			if(!unitario[i].equals("0")) suma += Integer.parseInt(unitario[i]) * (int)Math.pow(10, tamano-i-1) + " + ";
		}
		return suma.substring(0, suma.length()-3);
	} 
}
