package sixKyu;

public class ZSumTwoMatriz {

	/*-------------------------------------------------------------------------------

	Suma dos matrices de igual dimension. Cada elemento de la matriz resultante es 
	la suma de los elementos correspondientes de las dos matrices que se le pasan 
	por parametro.
	
	Kata: https://www.codewars.com/kata/526233aefd4764272800036f

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {

		int[][] matriz1 = { {1, 2, 3},
						    {3, 2, 1},
						    {1, 1, 1} };
		
		int[][] matriz2 = { {2, 2, 1},
						    {3, 2, 3},
						    {1, 1, 3}};
		
		int[][] resultado = matrizAddition(matriz1, matriz2);
		
		muestraMatriz(resultado);
	}

	public static int[][] matrizAddition(int[][] a, int[][] b) {
		int[][] resultado = new int[a.length][a[0].length];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				resultado[i][j] = a[i][j] + b[i][j];
			}
		}
		return resultado;
	}
	
	public static void muestraMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}	
}
