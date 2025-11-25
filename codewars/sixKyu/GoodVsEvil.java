package sixKyu;

public class ZGoodVsEvil {

	/*-------------------------------------------------------------------------------

	En este problema se nos da una serie de unidades de dos bandos, el bien y el mal,
	con un valor de poder especifico cada una. Se da una cadena con la cantidad de
	unidades de cada tipo y debemos determinar que bando gana la batalla segun el
	poder total de cada bando.

	La puntuacion de cada unidad segun el bando es:
	
	-------GOOD--------
    Hobbits: 1
    Men: 2
    Elves: 3
    Dwarves: 3
    Eagles: 4
    Wizards: 10

	------EVIL---------
    Orcs: 1
    Men: 2
    Wargs: 2
    Goblins: 2
    Uruk Hai: 3
    Trolls: 5
    Wizards: 10

	Kata: https://www.codewars.com/kata/52761ee4cffbc69732000738

	-------------------------------------------------------------------------------*/
	
	public static void main(String[] args) {
		
		System.out.println(battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
	
	}	
	
	public static String battle(String goodAmounts, String evilAmounts) {
		int resultadoBatalla = getResult(convertMatriz(goodAmounts, "good")) - getResult(convertMatriz(evilAmounts, "evil"));

		if(resultadoBatalla > 0) return "Good triumphs over Evil";
		if(resultadoBatalla < 0) return "Battle Result: Evil eradicates all trace of Good";	
		return "Battle Result: No victor on this battle field";
	  }

	public static int[] convertMatriz(String str, String bando) {
		int[] matriz = new int[(bando == "good")? 6 : 7];
		String comodin = "";
		int index = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				comodin += String.valueOf(str.charAt(i));
				if(i == str.length()-1) matriz[index] = Integer.parseInt(comodin);
			} else {
				matriz[index] = Integer.parseInt(comodin);
				index++;
				comodin = "";
			}
		}
		return matriz;
	}
	
	public static int getResult(int[] lista) {
		int[] good = {1,2,3,3,4,10};
		int[] evil = {1,2,2,2,3,5,10};
		int result = 0;
		
		for(int i=0; i<lista.length; i++) {
			if(lista.length == 6) result += good[i] * lista[i];
			if(lista.length == 7) result += evil[i] * lista[i];
		}	
		return result;
	}
}
