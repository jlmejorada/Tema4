package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = "";

		String[] palabras;

		String palabraLarga = "";

		char[] letras;

		System.out.println("Introduce una frase");
		frase = sc.nextLine();

		palabras = frase.split(" ");

		palabraLarga = palabras[0];

		for (int i = 0; i < palabras.length; i++) {
			if (palabraLarga.length() < palabras[i].length()) {
				palabraLarga = palabras[i];
			}
		}

		letras = palabraLarga.toCharArray();

		System.out.println(palabraLarga);
		System.out.println(Arrays.toString(letras));

		sc.close();

	}

}
