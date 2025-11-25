package sixKyu;

public class ZYourOrder {

	/*-------------------------------------------------------------------------------
	
	Ordena el String dado segun el digito que tiene cofidicado entre las palabras

	Ejemplos:
	"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
    "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
    ""  -->  ""

	Kata: https://www.codewars.com/kata/55c45be3b2079eccff00010f
    
	-------------------------------------------------------------------------------*/	

	public static void main(String[] args) {

		System.out.println(order("is2 Thi1s T4est 3a"));

	}

    public static String order(String words) {
            String[] phrase = words.split(" ");
            String[] order = new String[phrase.length];

            for(int i=0; i<phrase.length; i++) {
                for(int j=0; j<phrase[i].length(); j++) {
            
                    char c = phrase[i].charAt(j);
                    if(Character.isDigit(c)) order[Character.getNumericValue(c) -1] = phrase[i];
                }       
                if(order[i] == null) order[i] = "";
            }	   
            return new String(String.join(" ", order));
    }
}