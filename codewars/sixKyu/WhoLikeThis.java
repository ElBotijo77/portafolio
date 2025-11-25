package sixKyu;

public class ZWhoLikeThis {

	/*-------------------------------------------------------------------------------
	
	Contador de likes que segun la cantidad de pulsaciones que recibe el elemento
	devuelve un valor u otro. Se plantean dos formas distintas, en la que una de las
	formas es mediante String.format(), haciendolo mas legible

    []                                -->  "no one likes this"
	["Peter"]                         -->  "Peter likes this"
	["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
	["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
	["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

	Kata: https://www.codewars.com/kata/5266876b8f4bf2da9b000362

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max", "Juan", "Pepitero"));
		System.out.println(whoLikesItDos("Alex", "Jacob", "Mark", "Max", "Juan", "Pepitero"));
		
	}

    public static String whoLikesIt(String... names) {
    	switch(names.length) {
    		case 0:
    			return "no one like this";
    		case 1:
    			return names[0] + " like this";
    		case 2:
    			return names[0] + " and " + names[1] + " like this";
    		case 3:
    			return names[0] + ", " + names[1] + " and " + names[2] + " like this";
    		default:
    			return names[0] + ", " + names[1] + " and " + (names.length-2) + " others like this";
    	}
    }

	    public static String whoLikesItDos(String... names) {
			switch (names.length) {
				case 0: 
					return "no one likes this";
				case 1: 
					return String.format("%s likes this", names[0]);
				case 2: 
					return String.format("%s and %s like this", names[0], names[1]);
				case 3: 
					return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
				default: 
					return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
}
