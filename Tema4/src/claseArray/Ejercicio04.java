package claseArray;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		int tabla[]= new int[30];
		
		for (int i = 0 ; i<tabla.length; i++) {
			tabla[i]=(int)(Math.random()*10);
		}
		
		Arrays.sort(tabla);
		
		System.out.println(Arrays.toString(tabla));

	}

}
