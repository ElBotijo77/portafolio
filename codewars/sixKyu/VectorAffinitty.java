package sixKyu;

public class ZVectorAffinitty {
    
	/*-------------------------------------------------------------------------------

    Calcula el número de elementos en un vector que aparecen en el mismo índice en 
    cada vector, con el mismo valor. El valor de afinidad debe expresarse en una 
    escala de 0.0 a 1.0, siendo 1.0 absolutamente idéntico. Dos conjuntos idénticos 
    siempre deben evaluarse con una afinidad de 1.0.

	Ejemplos:
    ([1 2 3 4 5], [1 2 2 4 3]) => 0.6
    ([1 2 3], [1 2 3]) => 1.0

	Kata: https://www.codewars.com/kata/5498505a43e0fd83620010a9
    
	-------------------------------------------------------------------------------*/
    
    public static void main(String[] args) {
        System.out.println(vectorAffinity(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 2, 4, 3}));
    }

    public static double vectorAffinity(int[] xs, int[] ys){
            int xS = xs.length, yS = ys.length;
            if(xS == 0 && yS == 0) return 1;

            double count = 0;
            
            int major = Math.max(xS, yS);
            int menor = Math.min(xS, yS);
        
            for(int i=0; i<menor; i++) {
                if(xs[i] == ys[i]) count++;
            }	
            return count/major;
    }

}
