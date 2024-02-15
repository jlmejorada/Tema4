package cadenas;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Variable para controlar como se quiere codificar
		boolean tipoCodigo = true;
		// Variable que recoge la respuesta del cliente
		String respuesta = "";
		//Variable char que recoge el caracter que se nos ha devuelto
		char caracter=' ';
		//Variable para la frase codificada
		String codificado="";
		// Creamos el array de char correspondiente al conjunto1
		final char CODIFICACION1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		// Creamos el array de char correspondiente al conjunto2
		final char CODIFICACION2[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		// Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		// Preguntamos como se quiere codificar
		System.out.println("Quieres codificar con el primer conjunto? s|n");
		respuesta = sc.next();
		// Miramos si la respuesta es positiva
		if (!respuesta.equalsIgnoreCase("s")) {
			// Cambiamos tipo codigo
			tipoCodigo = false;
		}
		// Pedimos la frase a codificar
		System.out.println("Dame la frase a codificar");
		respuesta = sc.next();
		//Recorremos la frase
		for (int i=0 ; i<respuesta.length() ; i++) {
			//Si la codificacion es la primers
			if (tipoCodigo) {
				//Llamamos a la función en este orden y la guardamos
				caracter=codifica(CODIFICACION1, CODIFICACION2, respuesta.charAt(i));
				//Si no, lo mandamos al reves
			} else caracter=codifica(CODIFICACION2, CODIFICACION1, respuesta.charAt(i));
			//Vemos si nos ha devuelto el caracter vacio
			if (caracter==' ') {
				//Si es asi, guardamos el mismo caracter que hemos mandado
				codificado+=respuesta.charAt(i);
				//Si no, metemos el caracter codificado
			} else {codificado+=caracter;}
		}
		//Imprimimos la frase codificada
		System.out.println(codificado);
		
	}

	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		// Creamos una variable para el char que vamos a devolver
		char codificado = ' ';
		// Recorremos el array
		for (int i = 0; i < conjunto1.length; i++) {
			// Si coincide el caracter que vamos a codificar con el de la posición
			if (conjunto1[i] == (c)) {
				// Metemos en codificado el la letra correspondiente
				codificado = conjunto2[i];
			}
		}
		// Devolvemos el char
		return codificado;
	}

}
