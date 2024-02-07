package cadenas;

import java.util.Scanner;

public class Ejercicio01 {

	/**
	 * Función Main, que llevara todo el programa en ella
	 * @param args
	 */
	public static void main(String[] args) {
		// Creamos una variable para recoger la cadena1 y cadena2
		String cadena1="";
		String cadena2="";
		//Variable que recoge la respuesta
		String res="Son igual de largas";
		//Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		//Pedimos las frases y las registramos
		System.out.println("Dime una frase");
		cadena1=sc.nextLine();
		System.out.println("Dime otra frase");
		cadena2=sc.nextLine();
		//Si no son igual de largas
		if (cadena1.length()!=cadena2.length()) {
			//Vemos cual de ambas es mas larga
			res=(cadena1.length()>cadena2.length()) ? "La primera frase es más larga" : "La segunda frase más larga" ;
		} 
		//Imprimimos la respuesta
		System.out.println(res);
		//Cerramos el escaner
		sc.close();
	}

}
