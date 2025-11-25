package sixKyu;

public class ZTortoiseRacing {
	
	/*-------------------------------------------------------------------------------

	Dos tortugas comienzan una carrera. La tortuga A va a una velocidad de v1 y la tortuga B
	va a una velocidad de v2. La tortuga A tiene una ventaja de g metros.
	Se debe calcular el tiempo que tarda la tortuga B en alcanzar a la tortuga A. El resultado
	debe ser devuelto en una matriz con horas, minutos y segundos.

	Ejemplos:
	(720, 850, 70) = [0, 32, 18]
	(80, 91, 37) = [3, 21, 49]

	Kata: https://www.codewars.com/kata/55e2adece53b4cdcb900006c

	-------------------------------------------------------------------------------*/
	
	public static void main(String[] args) {
		
		int[] n = race(720, 850, 70);
		
		for(int x: n) {
			System.out.print(x + " ");
		}
		
	}
	
    public static int[] race(int v1, int v2, int g) {
    	if (v1 >= v2) return null;
  
    	double total = (double) g / (v2 - v1);

    	int horas = (int)total;
        int minutos = (int) Math.floor(total * 60) - (horas * 60);
    	int segundos = (int) Math.floor((total * 3600) - (horas * 3600) - (minutos * 60));
    	
    	return new int[]{horas, minutos, segundos};
    }
}


