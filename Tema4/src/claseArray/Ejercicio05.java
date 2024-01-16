package claseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int tabla[]= new int[8];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i<tabla.length; i++) {
			System.out.println("Dame la puntuación del jugador" + (i+1));
			tabla[i]=sc.nextInt();
		}
		
		Arrays.sort(tabla);
		
		for (int i = tabla.length-1 ; i>=0; i--) {
			System.out.println(tabla[i]);
		}

		sc.close();

	}

}
