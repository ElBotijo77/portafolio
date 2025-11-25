package fiveKyu;

import java.time.Duration;

public class ZHumanTimeStringFormat {

	/*-------------------------------------------------------------------------------

    Convierte un numero dado en segundos al formato de horas HH:MM:SS. No recoge numeros
	negativos donde los rangos son de 00-99 para las horas y 00-59 para minutos y segundos
	
	Ejemplos:
  	359999 = 99:59:59 

	Kata: https://www.codewars.com/kata/52685f7382004e774f0001f7

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {

		System.out.println(makeReadable(359999));

	}
	
	public static String makeReadable(int seconds) {
		int hour, minutes, second;

		hour = seconds / 3600;
		minutes = (seconds % 3600) / 60;
		second = seconds % 60;	
		
		
		Duration duration = Duration.ofSeconds(seconds);
		System.out.println(duration.toHours());

		return String.format("%02d:%02d:%02d", hour, minutes, second);
	}	
}
