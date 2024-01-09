package ejerciciosArrayPrimero;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos un array de 10 de longitud
		int tabla[] = new int [10];
		//Inicializamos el número aleatorio
		Random rn = new Random();
		
		//Un bucle que se repita el número de veces de longitud de la tabla
		for (int i=0 ; i<tabla.length ; i++) {
			//Va registrando números aleatorios entre 1 y 100
			tabla[i] = rn.nextInt(1,101);
		}
		
		// Imprimimos el array
		System.out.println(Arrays.toString(tabla));

	}

}
