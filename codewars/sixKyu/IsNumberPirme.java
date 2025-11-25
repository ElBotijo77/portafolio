package sixKyu;

public class ZIsNumberPirme {
    
	/*-------------------------------------------------------------------------------

    Es un numero primo? Devuleve True si lo es o False en caso contrario

	Ejemplos:
    401 is a number prime
    4 isnt number prime

	Kata: https://www.codewars.com/kata/5262119038c0985a5b00029f
    
	-------------------------------------------------------------------------------*/
    public static void main(String[] args) {
        System.out.println(isPrime(401));
    }  
    
    public static boolean isPrime(int num) {
        if(num<0 || num == 1) return false;
        if(num % 2 == 0 && num != 2) return false;

        int root =(int)Math.sqrt(num);
        
        for(int i=3; i<=root; i+=2){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }      
}
