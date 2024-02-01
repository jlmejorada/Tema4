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
		
		Scanner sc = new Scanner(System.in);
		
		int tabla1[] = new int[TAMAÑO_ARRAYS];
		int tabla2[] = new int[TAMAÑO_ARRAYS];
		
		for (int i = 0 ; i < tabla1.length ;i++ ) {
			System.out.println("Dame un numero para la posición " + (i+1) + " de la tabla 1");
			tabla1[i]=sc.nextInt();
		}
		for (int i = 0 ; i < tabla2.length ;i++ ) {
			System.out.println("Dame un numero para la posición " + (i+1) + " de la tabla 2");
			tabla2[i]=sc.nextInt();
		}

		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Los arrays son iguales");
		} else {System.out.println("Los arrays no son iguales");}

		sc.close();
	}

}
