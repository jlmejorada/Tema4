package claseArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase Ejercicio03
 * @author jlmejorada
 */
public class Ejercicio03 {

	/*
	 * Constante que define el tamaño del array
	 */
	public static final int TAMAÑO_ARRAYS = 10;

	/*
	 * Función main de la clase 
	 */
	public static void main(String[] args) {
		//Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		//Creamos dos tablas del mismo tamaño
		int tabla1[] = new int[TAMAÑO_ARRAYS];
		int tabla2[] = new int[TAMAÑO_ARRAYS];
		//Hacemos un bucle que se rerpita el numero de veces del tamaño de la tabla1
		for (int i = 0 ; i < tabla1.length ;i++ ) {
			//Rellenamos todas las posiciones de la tabla1
			System.out.println("Dame un numero para la posición " + (i+1) + " de la tabla 1");
			tabla1[i]=sc.nextInt();
		}
		//Hacemos un bucle que se rerpita el numero de veces del tamaño de la tabla2
		for (int i = 0 ; i < tabla2.length ;i++ ) {
			//Rellenamos todas las posiciones de la tabla2
			System.out.println("Dame un numero para la posición " + (i+1) + " de la tabla 2");
			tabla2[i]=sc.nextInt();
		}
		//Comprobamos que ambas tablas son iguales
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Los arrays son iguales");
		} else {System.out.println("Los arrays no son iguales");}
		//Cerramos el escaner
		sc.close();
	}

}
