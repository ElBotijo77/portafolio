package fiveKyu;

import java.util.*;

public class ZPeteTheBaker {
	
	/*-------------------------------------------------------------------------------
	
	Comprueba si hay los ingredientes necessarios para crear una receta, y en caso
	afirmativo devuelve en numero de veces que se puede realizar la operacion
	  
	cakes(flour: 500, sugar: 200, eggs: 1, {flour: 1200, sugar: 1200, eggs: 5, milk: 200); 					return 2;
	cakes(apples: 3, flour: 300, sugar: 150, milk: 100, oil: 100, sugar: 500, flour: 2000, milk: 2000); 	return 0;

	Kata: https://www.codewars.com/kata/525c65e51bf619685c000059

	-------------------------------------------------------------------------------*/ 

	public static void main(String[] args) {

		Map<String, Integer> receta = new HashMap<String, Integer>();
		Map<String, Integer> disponible = new HashMap<String, Integer>();
		
		receta.put("flour", 200);
		receta.put("sugar", 200);
		receta.put("eggs", 1);
		
		disponible.put("flour", 1200);
		disponible.put("sugar", 1200);
		disponible.put("eggs", 5);
		disponible.put("milk", 200);
		
		System.out.println(cakes(receta, disponible));
		

	}
	
	//cakes({flour: 500, sugar: 200, eggs: 1}, {flour: 1200, sugar: 1200, eggs: 5, milk: 200});
	//return 2
	
	public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
		int result = Integer.MAX_VALUE;
		
		for(Map.Entry<String, Integer> entry: recipe.entrySet()) {
			if(!available.containsKey(entry.getKey())) return 0;
			
			int units = available.get(entry.getKey()) / entry.getValue();
			
			if(units < result) result = units; 
		}
		return result;
	}	

}
