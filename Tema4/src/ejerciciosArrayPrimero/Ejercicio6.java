package ejerciciosArrayPrimero;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos un array de 5 de longitud
		int tabla[] = new int[5];
		// Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		// Un bucle que se repita el número de veces de longitud de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Va registrando números aleatorios entre 1 y 100
			System.out.println("Dame el número " + (i + 1));
			tabla[i] = sc.nextInt();
		}
		// Creamos un bucle que recorra el array
		for (int numero : tabla) {
			// Si el numero es par
			if (numero%2==0) {
				// Imprimimos el numero con par
				System.out.println(numero + " es par");
				// Si no, imprimimos el numero con impar
			} else System.out.println(numero + " es impar");
		}
		// Cerramos el escaner
		sc.close();

	}

}
