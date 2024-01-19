package funciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Varibale que registre el número que se buscará en el array
		int num;
		// Creamos un array de numeros enteros
		int tabla[] = { 1, 2, 5, 4, 5, 6, 7, 8, 5 };
		// Inicializamos un escaner
		Scanner sc = new Scanner(System.in);
		// Pedimos el número a buscar
		System.out.println("Dame el número que buscaremos en el array");
		num = sc.nextInt();
		// Llamamos a la función e imprimimos lo que nos devuelva
		System.out.println(Arrays.toString(buscarTodos(tabla, num)));
		// Cerramos el escaner
		sc.close();
	}

	public static int[] buscarTodos(int t[], int valor) {
		// Variable que cuenta las veces que se repite el número
		int repite = 0;
		//Creamos un contador
		int cont=0;
		// Creamos un bucle que cuenta las veces que está el número
		for (int numero : t) {
			if (numero == valor) {
				repite++;
			}
		}
		// Creamos un array del tamaño de el número de veces que se repite
		int tabla[] = new int[repite];
		// Bucle que se repite hasta que se acaba el array
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				tabla[cont] = i;
				cont++;
			}
		}
		// Devolvemos el array
		return tabla;
	}
}
