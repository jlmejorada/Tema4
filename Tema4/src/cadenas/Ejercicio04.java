package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creamos una variable que recoja la frase
		String frase;
		// Creamos un array en el que guardaremos las palabras ordenadas
		String palabras[];
		// Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		// Pedimos la frase y la reocgemos
		System.out.println("Dame una frase");
		frase = sc.nextLine();
		// Hacemos que el tamaño del array sea igual que el número de palabras de la
		// frase y que se introduzcan en este
		palabras=frase.split(" ");
		// Ordenamos el array
		Arrays.sort(palabras);
		//Imprimimos para ver el resultado
		for (int i=0; i<palabras.length ;i++) {
			System.out.print(palabras[i] + " ");
		}

		//Cerramos el escaner
		sc.close();
	}

}
