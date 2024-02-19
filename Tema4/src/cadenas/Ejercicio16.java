package cadenas;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);

		String jugador1 = "";

		String jugador2 = "";

		String pista = "";
		
		String coincide = "";
		
		char[] letras;
		
		char[] letrasJ2;

		System.out.println("Inserte una palabra");
		jugador1 = lectura.next();

		jugador1 = jugador1.trim();

		letras = jugador1.toCharArray();

		pista = anagrama(letras);
		
		do {

			lectura.nextLine();
			
			System.out.println(pista);
			
			System.out.println("Introduzca la palabra correcta");
			jugador2 = lectura.next();

		} while (!jugador2.equals(jugador1));

		System.out.println("Correcto, la palabra era: " + jugador1);
		
		lectura.close();

	}

	public static String anagrama(char[] letras) {

		Random aleatorio = new Random();

		String palabraDes = "";

		char[] letrasDes = new char[letras.length];

		for (int i = 0; i < letras.length; i++) {

			letrasDes[i] = letras[aleatorio.nextInt(0, letras.length)];

			palabraDes += letrasDes[i];

		}

		return palabraDes;

	}
	
	public static char[] letrasCoin (char[] letrasJ2, char[] letras) {
		
		char[] coincidencia = {' '};
		
		return coincidencia;
	}

}
