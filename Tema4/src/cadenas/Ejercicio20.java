package cadenas;			//Este ejercicio no funciona profesora

public class Ejercicio20 {

	public static void main(String[] args) {
		// Variable que recoge la palabra que recibira la función
		String palabra="destornillador";
		// Variable que recoge un número, que sera la secuencia
		int secuencia=3;
		
		//Recogemos el array
		String solucion[]=palabraDividida(palabra, secuencia);
		// Recorremos el array
		for (int i = 0; i < solucion.length; i++) {
            //Imprimimos 
			System.out.print("[" + solucion[i] + "]");
        }

	}

	public static String[] palabraDividida(String palabra, int secuencia) {
		// Variable que recoge las parte que se dividira el array
		int tamañoArray = palabra.length()/secuencia;
		//Array que tendra la palabra dividida por secuencia
		String palabraDiv[] = new String[palabra.length()-secuencia+1];
		
		for (int i = 0; i <= palabra.length() - secuencia; i++) {
            palabraDiv[i] = palabra.substring(i, i + secuencia);
		}
		//Devolvemos la palabra dividida
		return palabraDiv;
	

	}
}