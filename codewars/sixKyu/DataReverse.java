package sixKyu;

import java.util.Arrays;

public class ZDataReverse {
    
	/*-------------------------------------------------------------------------------
	
    Por entrada recibimos una secuencia de bytes donde cada segmento esta dividido 
    en una longitud de 8 bits. Debemos invertirlo respetando el contenido de cada 
    byte individual. La salida debe ser un multiplo de 8 para confirmar su correcion

	Ejemplos:
    [1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0] should return 10101010  00001111  00000000  11111111

	Kata: https://www.codewars.com/kata/569d488d61b812a0f7000015
    
	-------------------------------------------------------------------------------*/	
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dataReverse(new int[]{1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0})));
    }

    public static int[] dataReverse(int[] data) {
    	int[] reverse = new int[data.length];
    	int count = 0;

    	for(int i=data.length; i>0; i-=8) {
    		for(int j=0; j<8; j++) {
    			reverse[count] = data[i-8+j];
    			count++;
    		}
    	}    	
    	return reverse;
    }    
}
