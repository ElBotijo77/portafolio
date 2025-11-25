package sixKyu;

public class ZDetectPangram {
    
	/*-------------------------------------------------------------------------------

    Un pangrama es una oración que contiene todas las letras del alfabeto al menos una
    vez.Dada una cadena, detecta si es o no un pangrama. Devuelve True si lo es, False 
    si no. Ignora los números y la puntuación siendo insensitive case.

	Ejemplos:
    "The quick brown fox jumps over the lazy dog" = true
    "aabaa" = false

	Kata: https://www.codewars.com/kata/545cedaa9943f7fe7b000048
    
	-------------------------------------------------------------------------------*/
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog"));
    }

    public static boolean check(String sentence){
            String phrase = sentence.replace(" ", "").toLowerCase();
            if(phrase.length() < 26) return false;
            int[] arr = new int[26];
            int index = 0;
            
            for(int i=0; i<=phrase.length()-1; i++) {
                index = phrase.charAt(i) - 97;
                if(index < 27 && index >= 0) arr[index]++;
    
            }

            for(int i=0; i<=25; i++) {
                if(arr[i] == 0) return false;
            }
            return true;
    }    
}
