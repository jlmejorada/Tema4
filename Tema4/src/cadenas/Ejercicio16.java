package cadenas;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		//Variable que recoge la frase del primer jugador
		String jugador1 = "";
		//Variable que recoge la frase del segundo jugador
		String jugador2 = "";
		//Variable para la pista
		String pista = "";
		//Array char para las letras
		char[] letras;
		//Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		//Pedimos la primera palabra y la registramos quitandole los posibles espacios/tabuladores del incio o final
		System.out.println("Inserte una palabra");
		jugador1 = sc.next().trim();
		//Lo pasamos a char array
		letras = jugador1.toCharArray();
		//Llamamos a la funcion y nos devuelve la pista
		pista = anagrama(letras);
		//Iniciamos un bucle
		do {
			//Limpiamos el escaner
			sc.nextLine();
			//Imprimimos la pista
			System.out.println("Pista: " + pista);
			//Pedimos la segunda palabra y la registramos
			System.out.println("Introduzca la palabra correcta");
			jugador2 = sc.next();
			//Se repite si el jugador2 no acierta la palabra
		} while (!jugador2.equals(jugador1));
		//Imprimimos las felicitacuines
		System.out.println("Correcto, has adivinado la palabra");
		//Cerramos el escaner
		sc.close();

	}

	public static String anagrama(char[] letras) {
		//Creamos una variable que tendra la pista
		String pista = "";
		//Variable para la posicion
		int pos;
		//Variable contador
		int contador=0;
		//Creamos un array de char del tamaño del array anterior
		char[] posicionUsada = new char[letras.length];
		//Inicializamos un numero aleatorio
		Random rand = new Random();
		//Recorremos el array pasado por parametros
		while (contador<letras.length){
			//Creamos una posicion al azar entre 0 y el largo del array
			pos = rand.nextInt(0,letras.length);
			//Si la posicion no está usada
			if (posicionUsada[pos]!='x') {
				//Añadimos la letra a la pista
				pista+=letras[pos];
				//Marcamos la posicion como usada
				posicionUsada[pos]='x';
				//Añadimos el contador
				contador++;
			}
		}
		//DEVOLVEMOS LA PISTA
		return pista;

	}

}
