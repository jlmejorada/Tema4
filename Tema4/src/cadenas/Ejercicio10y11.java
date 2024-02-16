package cadenas;

import java.util.Scanner;

public class Ejercicio10y11 {

	public static void main(String[] args) {
		// Variable para controlar como se quiere codificar
		boolean tipoCodigo = true;
		// Variable que recoge la respuesta del cliente
		String respuesta = "";
		// Variable respuesta conjunto
		String conjunto = "";
		// Variable char que recoge el caracter que se nos ha devuelto
		char caracter = ' ';
		// Variable para la frase codificada
		String codificado = "";
		// Creamos el array de char correspondiente al conjunto1
		final char CODIFICACION1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		// Creamos el array de char correspondiente al conjunto2
		final char CODIFICACION2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		// Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		// Preguntamos como se quiere codificar
		System.out.println("Quieres codificar con el primer conjunto? s|n");
		conjunto = sc.next();
		sc.nextLine();
		// Miramos si la respuesta es positiva
		if (!conjunto.equalsIgnoreCase("s")) {
			// Cambiamos tipo codigo
			tipoCodigo = false;
		}
		// Pedimos la frase a codificar
		System.out.println("Dame la frase a codificar");
		respuesta = sc.nextLine().toLowerCase();
		// Recorremos la frase
		for (int i = 0; i < respuesta.length(); i++) {
			// Si la codificacion es la primers
			if (tipoCodigo) {
				// Llamamos a la función en este orden y la guardamos
				caracter = codifica(CODIFICACION1, CODIFICACION2, respuesta.charAt(i));
				// Si no, lo mandamos al reves
			} else
				caracter = codifica(CODIFICACION2, CODIFICACION1, respuesta.charAt(i));
			// metemos el caracter codificado
			codificado += caracter;
		}
		// Imprimimos la frase codificada
		System.out.println(codificado);
		//Cerramos el escaner
		sc.close();
	}

	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		// Creamos una variable para el char que vamos a devolver
		char codificado = c;
		// Variable que marca si el caracter ha sido encontrado
		boolean encontrado=false;
		//Creamos una variable contador
		int contador=0;
		// Recorremos el array hasta que llega al final o encuentre el caracter
		while (!encontrado && contador<conjunto1.length){
			// Si coincide el caracter que vamos a codificar con el de la posición
			if (conjunto1[contador] == (c)) {
				// Metemos en codificado el la letra correspondiente
				codificado = conjunto2[contador];
				//Ponemos encontrado como verdadero
				encontrado=true;
			}
			//Contador ++
			contador++;
		}
		// Devolvemos el char
		return codificado;
	}

}
