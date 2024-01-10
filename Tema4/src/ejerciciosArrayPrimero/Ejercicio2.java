package ejerciciosArrayPrimero;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos un array de 5 de longitud
		float tabla[] = new float[5];
		// Inicializamos el número aleatorio
		Random rn = new Random();
		//Inicializamos el escaner
		Scanner sc = new Scanner(System.in);

		// Un bucle que se repita el número de veces de longitud de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Va registrando números aleatorios entre 1 y 100
			System.out.println("Dame el número " + (i+1));
			tabla[i] = sc.nextFloat();
		}
		// Imprimimos los números
		for (float numero : tabla) {
			System.out.println(numero);
		}
		sc.close();

	}

}
