package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palabra = "";

		String anagrama = "";

		boolean resultado;

		System.out.println("Introduce una palabra");
		palabra = sc.next().toLowerCase();

		System.out.println("Introduce el anagrama de la palabra anterior");
		anagrama = sc.next().toLowerCase();

		resultado = esAnagrama(palabra, anagrama);

		if(resultado) {
			System.out.println("Si es un anagrama");
		}else {
			System.out.println("No es un anagrama");
		}
		
		sc.close();
	}

	public static boolean esAnagrama(String palabra, String anagrama) {

		boolean esAn = true;

		char[] letraP = palabra.toCharArray();

		char[] letraA = palabra.toCharArray();

		Arrays.sort(letraA);

		Arrays.sort(letraP);

		if (!Arrays.equals(letraP, letraA)) {
			esAn = false;
		}

		return esAn;

	}

	

}
