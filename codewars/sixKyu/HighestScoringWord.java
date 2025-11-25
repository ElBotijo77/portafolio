package sixKyu;

public class ZHighestScoringWord {
    
	/*-------------------------------------------------------------------------------
	
	Encuentra la palabra con mayor puntuación, en la que cada letra recibe su valor 
	basado en su posición en el alfabeto (a=1, b=2, ...)

	Ejemplos:
	abadadad = 18 puntos
	abad = 8 puntos

	Kata: https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
    
	-------------------------------------------------------------------------------*/	

	public static void main(String[] args) {

		System.out.println(high("abadadad abad"));

	}
	  public static String high(String s) {     		
		String[] arr = s.split(" ");
	  	String lastHigh = "";
	  	int sum = 0, wildcard = 0;
	
	  	for(int i=0; i<arr.length; i++) {
	  		sum = 0;
	  		for(int j=0; j<arr[i].length(); j++) {
		  		sum += arr[i].charAt(j) - 96;
		  	}
		  	if(sum > wildcard) {
		  		wildcard = sum;
		  		lastHigh = arr[i];
		  	}
		  }
	  	return lastHigh;
	  }
}