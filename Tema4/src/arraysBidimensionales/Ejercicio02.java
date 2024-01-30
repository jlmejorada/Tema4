package arraysBidimensionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creamos un arraybidimensial 4 x 5
		int[][] notas = new int[4][5];
		// Variables
		float notaMedia;
		int notaMax, notaMin;
		//inicializamos el escaner
		Scanner sc = new Scanner(System.in);	
		
		for (int i=0 ; i<notas.length ; i++){
			for (int j=0 ; j<notas[0].length ; j++ ) {
				System.out.println("Dime la nota nº" + (j+1) + " del alumno " + (i+1));
				notas [i][j] = sc.nextInt();
			}
		}
		
		for (int i=0 ; i<notas.length ; i++) {
			System.out.print("Alumno " + (i+1) +" \t");
			for (int j=0 ; j<notas[0].length ; j++ ) {
				System.out.print(notas[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0 ; i<notas.length ; i++) {
			notaMedia=0; 
			notaMax=0;
			notaMin=0;
			System.out.print("Alumno " + (i+1) +" \t");
			for (int j=0 ; j<notas[0].length ; j++ ) {
				if (notaMin>notas[i][j]) {
					notaMin=notas[i][j];
				}
				if (notaMax<notas[i][j]) {
					notaMax=notas[i][j];
				}
				notaMedia+=notas[i][j];
			}
			notaMedia=notaMedia/5;
			System.out.println("nota media: " + notaMedia + " nota Maxima: " + notaMax + " nota Minima: " + notaMin);
		}

		sc.close();
	}

}
