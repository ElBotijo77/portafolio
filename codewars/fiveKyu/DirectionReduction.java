package fiveKyu;
import java.util.*;
public class ZDirectionReduction {

	/*-------------------------------------------------------------------------------
	
	Dado un mapa con cuatro direcciones, elimina las redundancias innecesarias y eliminando
	las direcciones opuestas, tales como SOUTH vs NORTH. El resultado se debe comprobar
	mediante iteracion con el contiguo, eliminando si es necesario

	Ejemplos:
	["NORTH", "EAST", "WEST", "SOUTH", "WEST", "NORTH"] should return [WEST, NORTH]

	Kata: https://www.codewars.com/kata/550f22f4d758534c1100025a

	-------------------------------------------------------------------------------*/	

	public static void main(String[] args) {
		
		String[] s = new String[] {"NORTH", "EAST", "WEST", "SOUTH", "WEST", "NORTH"};
	
		List<String> lista1 = new ArrayList<String>(Arrays.asList(dirReducc(s)));
		System.out.println(lista1);

	}

    public static String[] dirReducc(String[] arr) {
    	Map<String, Integer> map = new HashMap<String, Integer>();
    	List<String> list = new ArrayList<String>(Arrays.asList(arr));
    	boolean end = false;
    	
    	map.put("NORTH", 1);
    	map.put("SOUTH", -1);
    	map.put("WEST", 2);
    	map.put("EAST", -2);
    	
    	while(!end) {
    		int tamano = list.size();
        	for(int i=0; i<tamano-1; i++) {
        		if(i != tamano-1) {
        			if(map.get(list.get(i)) + map.get(list.get(i+1)) == 0) {
        				list.remove(i+1);
        				list.remove(i);
        				break;
        			}
        		}
        	}
        	if(tamano == list.size()) end = true;
    	}    	   	
    	return list.toArray(new String[0]);
    }
}
