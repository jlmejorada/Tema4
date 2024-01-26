package funciones;

import java.util.Arrays;

public class Ejercicio06 {

	public static void main(String[] args) {
		int numero = 3;
		int t[] = {1, 2, 3, 4, 5, 6}; 

		System.out.println(Arrays.toString(suma(t,numero)));
	}
	
	public static int[] suma(int t[], int numElementos) {
		int sumaElementos[] = new int [t.length-numElementos+1];
		for (int i = 0 ; i < sumaElementos.length ; i++) {
			for (int j = i ; j<i+numElementos ; j++) {
				sumaElementos[i] += t[j];
			}
		}
		
		return sumaElementos;
	}

}
