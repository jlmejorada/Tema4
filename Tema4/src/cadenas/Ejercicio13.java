package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		//Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		//Variable que guardara la primera palabra
		String palabra1 = "";
		//Variable que guardara la segunda palabra
		String palabra2 = "";
		//Variable que recogera el resultado si es o no anagrama
		boolean flag = false;
		//Pedimos la primera palabra y la registramos
		System.out.println("Introduce una palabra");
		palabra1 = sc.next().toLowerCase();
		//Pedimos la segunda palabra y la registramos
		System.out.println("Introduce un anagrama de la palabra anterior");
		palabra2 = sc.next().toLowerCase();
		//Llamamos a la función y recogemos a traves de una boleean si es o no anagrama
		flag = esAnagrama(palabra1, palabra2);
		//Si la bandera marca true
		if(flag) {
			//Es un anagrama
			System.out.println("Ambas palabras actuan como anagrama de la otra");
			//Si no, no son anagramas
		}else System.out.println("Estas palabras no son anagramas");

		//Cerramos el escaner
		sc.close();
	}

	public static boolean esAnagrama(String palabra, String anagrama) {
		//Marca si la condición es correcta
		boolean esAnagrama = false;
		//Metemmos ambas palabras en unos char array
		char[] letraP = palabra.toCharArray();
		char[] letraA = palabra.toCharArray();
		// Y los ordenamos
		Arrays.sort(letraA);
		Arrays.sort(letraP);
		//Si son iguales
		if (Arrays.equals(letraP, letraA)) {
			//Marcamos la boleean como true
			esAnagrama = true;
		}
		//Devolvemos la boleean
		return esAnagrama;

	}

	

}
