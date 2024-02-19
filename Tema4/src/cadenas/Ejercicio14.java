package cadenas;

import java.util.Scanner;

public class Ejercicio14 {

	/**
	 * Atributo constante que guarda las letras del abecedario
	 */
	private static final char[] 
			abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
			'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	/**
	 * Se encarga de recoger la cadena del usuario, contar las letras que tiene y
	 * luego se lo imprime por pantalla
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion Scanner
		Scanner lectura = new Scanner(System.in);

		// Se crea una variable String que va a guardar la cadena del usuario
		String frase = "";

		// Se crea un contador para las letras
		int cont = 0;

		// Se crea un array para recoger los caracteres de la cadena del usuario
		char[] letras;

		// Se imprime por pantalla un mensaje para que el usuario introduzca la frase
		System.out.println("Introduzca una frase");
		// Se escanea y se guarda la frase del usuario en la variable correspondiente
		frase = lectura.nextLine();

		// Se cambian las letras a minuscula
		frase = frase.toLowerCase();

		// Se recogen los caracteres de la frase en el array
		letras = frase.toCharArray();

		/*
		 * Se crean dos bucles que, el primero se utiliza para recorrer el abecedario,
		 * mientras este sigue en un indice en concreto el segundo va a recorrer el
		 * array de la frase y va a incrementar el contador cada vez que las letras
		 * coincidan en los dos arrays y finalmente va a imprimirse por pantalla solo
		 * los caracteres que esten al menos una vez en la frase
		 */
		for (int i = 0; i < abecedario.length; i++) {
			// Se iguala el contador a cero
			cont = 0;
			for (int j = 0; j < letras.length; j++) {
				// Condicion que incrementa el contador si los dos caracteres son iguales
				if (abecedario[i] == letras[j]) {
					cont++;
				}
			}

			// Condicion que imprime si el contador es mayor a 0 e imprime una cadena vacia
			// y este es igual a cero
			if (cont == 0) {
				System.out.print("");
			} else {
				System.out.println(abecedario[i] + ": " + cont + " veces");
			}
		}

		// Se cierra el escaner
		lectura.close();
	}

}
