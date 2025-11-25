package sixKyu;

public class ZSplitString {

	/*-------------------------------------------------------------------------------
	
	Transfora un String en elementos de un array con 2 caracteres en cada elemento. 
	Posibles soluciones serian las siguientes:
	  
	'abc' =>  ['ab', 'c_']
	 abcdef' => ['ab', 'cd', 'ef']

	 Kata: https://www.codewars.com/kata/515de9ae9dcfc28eb6000001

	-------------------------------------------------------------------------------*/ 

	public static void main(String[] args) {
		String[] aver = solution("abcdef");	
		
		for(String x: aver) {
			System.out.print(x);
		}
	}
    
	public static String[] solution(String s) {
		if(s.length() % 2 != 0) s = s+"_";
		String[] cadena = new String[s.length()/2];
		
		for(int i=0; i<s.length(); i+=2) {
			if(i == 0) cadena[i] = s.substring(i, i+2);
			if(i != 0) cadena[i/2] = s.substring(i, i+2);
		}
		return cadena;
    }	
}
