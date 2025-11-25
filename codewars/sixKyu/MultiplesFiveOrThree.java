package sixKyu;

public class ZMultiplesFiveOrThree {

	/*-------------------------------------------------------------------------------

	Devuelve la suma de todos los multiplos de 3 o 5 por debajo de un numero
	que se le pasa por parametro. 

	Ejemplo:
	10 = 23, dado que 3 + 5 + 6 + 9 = 23

	Kata: https://www.codewars.com/kata/514b92a657cdc65150000006

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		ZMultiplesFiveOrThree objeto = new ZMultiplesFiveOrThree();
		System.out.println(objeto.solution(10));

	}
	
	public int solution(int number) {
		 int suma = 0;
		 
		 for(int i=1; i<number/3+1; i++) {
			 if(3 * i <number) suma += 3*i;
			 if(5 * i <number && !((5 * i) % 3 == 0)) suma += 5*i;
		 }
		 return suma;
	}
}
