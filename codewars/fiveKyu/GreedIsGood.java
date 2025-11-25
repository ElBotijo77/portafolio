package fiveKyu;

import java.util.*;

public class ZGreedIsGood {

	/*-------------------------------------------------------------------------------

	Se desarrolla una función que simula la tirada de un dado de 6 caras durante 5 
	turnos. La función debe calcular y devolver la puntuación total obtenida utilizando 
	la siguiente tabla de puntuación:
	
	Three 1's => 1000 points
	Three 6's =>  600 points
	Three 5's =>  500 points
	Three 4's =>  400 points
	Three 3's =>  300 points
	Three 2's =>  200 points
	One   1   =>  100 points
	One   5   =>   50 point
		
	Ejemplos:
	[2, 3, 4, 6, 2]  =>  0 puntos
	[4, 4, 4, 3, 3]  =>  400 puntos
	[2, 4, 4, 5, 4]  =>  450 puntos

	Kata: https://www.codewars.com/kata/5270d0d18625160ada0000e4

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		System.out.println(codicia(new int[] {2, 4, 4, 5, 4}));

	}
	
	public static int codicia(int[] ints) {
		Map<Integer, Integer> tirada = new HashMap<>();
		int result = 0;
	
		for(int i=0; i<ints.length; i++) {
			tirada.put(ints[i], tirada.getOrDefault(ints[i], 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry: tirada.entrySet()) {
			int value = entry.getValue();
			int key = entry.getKey();
			
			if(value >= 3) {
				if(key == 1) result += 1000;
				else result += key * 100;
				value -= 3;
			}
			
			while((key == 5 || key == 1) && value > 0) {
				if(key == 5) result += 50;
				if(key == 1) result += 100;
				value--;
			}
		}
		return result;
	}
}
