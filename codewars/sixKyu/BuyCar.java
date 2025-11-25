package sixKyu;

import java.util.Arrays;

public class ZBuyCar {

	/*-------------------------------------------------------------------------------

	Comprueba cuantos meses se necesitan para comprar un coche nuevo tomando como valores
	por cuanto se vende el coche viejo, el precio del coche nuevo y la capacidad de ahorro
	por mes. Se tiene en cuenta la depreciacion de ambos coches. El formato de salida 
	toma el primer valor como el numero de meses necesario para poder comprar el coche y
	el segundo como el dinero sobrante tras la compra.

	Ejemplos:
	nbMonths(2000, 8000, 1000, 1.5) --> [6, 766]
	nbMonths(12000, 8000, 1000, 1.5) --> [0, 4000]

	Kata: https://www.codewars.com/kata/554a44516729e4d80b000012

	-------------------------------------------------------------------------------*/
	
	public static void main(String[] args) {

		System.out.println(Arrays.toString(nbMonths(2000, 8000, 1000, 1.5)));

	}
	
	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
		if(startPriceOld > startPriceNew) return new int[] {0, startPriceOld - startPriceNew};
		if(startPriceOld == startPriceNew) return new int[] {0,0};

		double oldCar = startPriceOld, newCar = startPriceNew, percent = percentLossByMonth/100, saving = 0;
		int index = 0;	
		
		while(oldCar + saving < newCar) {
			index++;
		
			if(index % 2 == 0) percent += 0.005;
			
			oldCar = oldCar * (1-percent);
			newCar = newCar * (1-percent);
			saving += savingperMonth;
		}
		return new int[] {index, (int)Math.round(oldCar + saving - newCar)};
	}
}
