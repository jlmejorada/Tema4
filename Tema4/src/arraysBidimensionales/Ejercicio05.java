package arraysBidimensionales;

import java.util.Random;

public class Ejercicio05 {

	public static final int NMAX = 1000;
	public static final int NMIN = 100;

	public static void main(String[] args) {
		int[][] tabla = new int [4][5];
		int sumaFila;
		int sumaColumna;
		int total=0;
		rellenaAleatorio(tabla);
		
		for (int i=0 ; i<tabla.length ; i++) {
			sumaFila=0;
			for (int j=0 ; j<tabla[0].length ; j++) {
				sumaFila +=  tabla[i][j];
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println(sumaFila);
		}
		
		for (int i=0 ; i<tabla[0].length ; i++) {
			sumaColumna=0;
			for (int j=0 ; j<tabla.length ; j++) {
				sumaColumna +=  tabla[j][i];
			}
			System.out.print(sumaColumna + "\t");
			total += sumaColumna;
		}
		System.out.print(total);
		

	}
	
	public static void rellenaAleatorio(int tabla[][]) {
		Random rn = new Random();
		for (int i=0 ; i<tabla.length ; i++){
			for (int j=0 ; j<tabla[0].length ; j++ ) {
				tabla [i][j] = rn.nextInt(NMIN,NMAX);;
			}
		}
		
		

	}
		

}
