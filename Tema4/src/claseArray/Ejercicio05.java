package claseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//CReamos una tabla de tamaño 8
		int tabla[]= new int[8];
		// Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		//Recorremos la tabla gracias a un bucler for
		for (int i = 0 ; i<tabla.length; i++) {
			//Pedimos la puntuacion de los jugadores y la registramos
			System.out.println("Dame la puntuación del jugador" + (i+1));
			tabla[i]=sc.nextInt();
		}
		//Ordenamos la tabla
		Arrays.sort(tabla);
		//Mostramos los jugadores ordenados de mayor puntuación a menor
		for (int i = tabla.length-1 ; i>=0; i--) {
			System.out.println(tabla[i]);
		}
		//Cerramos el escaner
		sc.close();

	}

}
