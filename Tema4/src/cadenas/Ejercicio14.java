package cadenas;

import java.util.Scanner;

public class Ejercicio14 {

	private static final char[] 
			abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
			'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };


	public static void main(String[] args) {
		// Variable para guardar la frase del usuario
		String frase = "";
		// Variable que actuara de contador para las letras
		int cont;
		// Array para guardar los caracteres de la cadena del usuario
		char[] letras;
		// Inicializamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos la frase y la registramos
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();
		// Guardamos los caracteres de la frase en el array en minusculas
		letras = frase.toLowerCase().toCharArray();

		/*
		 * mientras este sigue en un indice en concreto el segundo va a recorrer el
		 * array de la frase y va a incrementar el contador cada vez que las letras
		 * coincidan en los dos arrays y finalmente va a imprimirse por pantalla solo
		 * los caracteres que esten al menos una vez en la frase
		 */
		
		//Recorremos el abecedario
		for (int i = 0; i < abecedario.length; i++) {
			// Inicializamos el contador a 0
			cont = 0;
			//Recorremos la frase
			for (int j = 0; j < letras.length; j++) {
				// Si los caracteres coinciden
				if (abecedario[i] == letras[j]) {
					//Incrementamos el contador
					cont++;
				}
			}
			//Si el contador es distinto de 0
			if (cont != 0) {
				//Imprimimos el resultado
				System.out.println(abecedario[i] + " aparece " + cont + " veces");
			}
		}
		// Cerramos el escaner
		sc.close();
	}

}
