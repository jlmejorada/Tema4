package ejerciciosArrayPrimero;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos una variable para registrar el numero que buscaremos
		int comparar=0;
		//Creamos una variable para recoger las posiciones
		String res="Aparece en la posición ";
		// Creamos un array de 100 de longitud
		int tabla[] = new int[100];
		//Inicializamos el escaner
		Scanner sc = new Scanner (System.in);
		// Inicializamos el número aleatorio
		Random rn = new Random();
		// Un bucle que se repita el número de veces de longitud de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Va registrando números aleatorios entre 1 y 10
			tabla[i] = rn.nextInt(1, 11);
		}
		//Pedimos el número que vamos a buscar
		System.out.println("¿Que número vamos a buscar?");
		comparar=sc.nextInt();
		//Un bucle que se repita el número de veces de la ongitud del array
		for (int i=0 ; i<tabla.length ; i++) {
			//Si el número es el mismo
			if (tabla[i]==comparar) {
				res+=i + " ";
			}
		}
		//Pasamos el resultado
		System.out.println(res);
		System.out.println(Arrays.toString(tabla));
		//Cerramos el escaner
		sc.close();

	}

}
