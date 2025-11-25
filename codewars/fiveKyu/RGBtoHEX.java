package fiveKyu;
public class ZRGBtoHEX {

    /*-------------------------------------------------------------------------------

    Conversion de valores decimales RGB a hexadecimal. Si el valor dado esta fuera del
    rango 0-255, redondear hacia el resultado valido mas cercano. De neuvo se ofrecen
    dos soluciones para comparar la buena legibilidad que se obtiene con String.format()
	
	Ejemplos:
    255, 255, 255  =  "FFFFFF"
    255, 255, 300  =  "FFFFFF"
    0, 0, 0        =  "000000"
    148, 0, 211    =  "9400D3"

	Kata: https://www.codewars.com/kata/513e08acc600c94f01000001

	-------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		
		System.out.println(rgb(235, 0, 7));
        System.out.println(rgbFormat(235, -2134, 7233));
		
	}
	
    public static String rgb(int r, int g, int b) {
    	String[] hexa = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
    	int[] rgb = new int[] {r, g, b};
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i=0; i<rgb.length; i++) {
    		if(rgb[i] <= 0) sb.append("00");
    		else if(rgb[i] >= 256) sb.append("FF");
    		else sb.append(hexa[rgb[i]/16] + hexa[rgb[i]%16]);
    	}
        return new String(sb);
    }	
    
    public static String rgbFormat(int r, int g, int b) {
        return String.format("%02X%02X%02X", 
                r >= 0 ? r <= 255 ? r : 255 : 0, 
                g >= 0 ? g <= 255 ? g : 255 : 0, 
                b >= 0 ? b <= 255 ? b : 255 : 0);
    
    }
}
