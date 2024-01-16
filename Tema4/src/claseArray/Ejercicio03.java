package claseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tabla1[] = new int[10];
		int tabla2[] = new int[10];
		
		for (int i = 0 ; i < tabla1.length ;i++ ) {
			System.out.println("Dame un numero para la posición " + (i+1) + " de la tabla 1");
			tabla1[i]=sc.nextInt();
		}
		for (int i = 0 ; i < tabla2.length ;i++ ) {
			System.out.println("Dame un numero para la posición " + (i+1) + " de la tabla 2");
			tabla2[i]=sc.nextInt();
		}
		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Los arrays son iguales");
		} else System.out.println("Los arrays no son iguales");

		sc.close();
	}

}
