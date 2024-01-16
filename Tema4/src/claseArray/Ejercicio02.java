package claseArray;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creamos una variable que registre el numero de posición inicial de este
		int inicio = 0;

		// Inicializamos el array
		int tabla[] = new int[55];
		
		//Creamos  un for que recorrera los numeros hasta 10
		for (int i = 1 ; i<=10 ; i++) {
			Arrays.fill(tabla, inicio, tabla.length, i);
			inicio+=i;
		}
		
		// Mostramos por pantalla
		System.out.println(Arrays.toString(tabla));
	}

}
