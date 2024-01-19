package funciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Varibale que registre el tamaño del array
		int tam;
		// Y el número final permitido
		int fin;
		//Inicializamos un escaner
		Scanner sc = new Scanner (System.in);
		//Pedimos el tamaño del array
		System.out.println("Dame le tamaño del array");
		tam=sc.nextInt();
		//Pedimos el ultimo numero
		System.out.println("Dame el último número disponible");
		fin=sc.nextInt();
		//Llamamos a la función e imprimimos lo que nos devuelva
		System.out.println(Arrays.toString(rellenaPares(tam,fin)));
		//Cerramos el escaner
		sc.close();
	}

	// Crea un array relleno de números pares dentro de un rango
	public static int[] rellenaPares(int longitud, int fin) {
		//Contador
		int i=0;
		// Creamos una variable que recoja el número aleatorio
		int aleatorio;
		// Creamos un array del tamaño indicado
		int tabla[] = new int[longitud];
		// creamos un bucle que se repita el números de veces equivalente al tamaño del array
		while (i<tabla.length) {
			// Busca un número aleatorio
			aleatorio=(int)((Math.random()*fin)+1);
			// Mira si el número aleatorio es par
			if (aleatorio%2==0) {
				// Si lo es, lo registra en el array
				tabla[i]=aleatorio;
				// y avanza uno en el contador
				i++;
			}
		}
		//devolvemos el array
		return tabla;
	}
}
