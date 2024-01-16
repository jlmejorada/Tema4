package claseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creamos una variable para recoger el numero n y otra para m
		int numM, numN;

		// Creamos el escanner
		Scanner sc = new Scanner(System.in);

		// Pedimos el número pòr pantalla
		System.out.println("Dame un número que será el tamaño del array");
		numN = sc.nextInt();

		// Pedimos el número pòr pantalla
		System.out.println("Dame un número que será el dato recogido por las casillas del array");
		numM = sc.nextInt();
		
		//Creamos el array
		int tabla[] = new int[numN];
		
		//Creamos un bucle que se repita el número de veces que sea el array de largo
		for (int i = 0 ; i<tabla.length ; i++) {
			tabla[i]=numM;
		}
		System.out.println(Arrays.toString(tabla));
		//Cerramos el escaner
		sc.close();
	}

}
