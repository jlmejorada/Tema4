package ejerciciosArrayPrimero;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos una variable para registrar el número máximo
		int max = Integer.MIN_VALUE;
		// Creamos una variable para registrar el número mínimo
		int min = Integer.MAX_VALUE;
		// Creamos una variable para registrar el resultado de la suma
		int res = 0;
		// Creamos un array de 10 de longitud
		int tabla[] = new int[10];
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
			// Si el número de la casilla en la que estamos es menor que el registrado 
			// como menor
			if (numero < min) {
				// Guardamos el numero como minimo
				min = numero;
			}
			// Si el número de la casilla en la que estamos es mayor que el registrado 
			// como mayor
			if (numero > max) {
				// Guardamos el numero como maximo
				max = numero;
			}
			// Sumamos los números de cada casilla
			res += numero;
		}
		//Mostramos por pantalla los resultados
		System.out.println("El número mayor es " + max + ", el menor " + min + " y el resultado de la suma es " + res);
		//Cerramos el escaner
		sc.close();

	}

}
