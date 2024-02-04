package arraysBidimensionales;

import java.util.Scanner;

public class Ejercicio02 {

	// Creamos una constante para el número de alumnos (vertical) y las asignaturas (horizontal)
	public static final int NUMALUM = 4;
	public static final int NUMASIG = 5;

	public static void main(String[] args) {
		// Creamos un arraybidimensial 4 x 5
		int[][] notas = new int[NUMALUM][NUMASIG];
		// Variable para la nota media
		float notaMedia;
		//Variables para la nota maxima y minima
		int notaMax, notaMin;
		//inicializamos el escaner
		Scanner sc = new Scanner(System.in);	
		//Recorremos las filas
		for (int i=0 ; i<notas.length ; i++){
			//Recorremos las columnas
			for (int j=0 ; j<notas[0].length ; j++ ) {
				//Pedimos las notas de los distintos alumnos y las asignamos
				System.out.println("Dime la nota nº" + (j+1) + " del alumno " + (i+1));
				notas [i][j] = sc.nextInt();
			}
		}
		//Recorremos las filas
		for (int i=0 ; i<notas.length ; i++) {
			//Imprimimos los alumnos
			System.out.print("Alumno " + (i+1) +" \t");
			//Recorremos las columnas
			for (int j=0 ; j<notas[0].length ; j++ ) {
				//Imprimimos las notas
				System.out.print(notas[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		//Recorremos las filas
		for (int i=0 ; i<notas.length ; i++) {
			//Inicializamos las variables a 0
			notaMedia=0; 
			notaMax=0;
			notaMin=10;
			//Imprimimos los alumnos
			System.out.print("Alumno " + (i+1) +" \t");
			//Recorremos las columnas
			for (int j=0 ; j<notas[0].length ; j++ ) {
				//Registramos la nota minima
				if (notaMin>notas[i][j]) {
					notaMin=notas[i][j];
				}
				//Registramos la nota minima
				if (notaMax<notas[i][j]) {
					notaMax=notas[i][j];
				}
				//Sumamos las notas
				notaMedia+=notas[i][j];
			}
			// y calculamos la media
			notaMedia=notaMedia/NUMASIG;
			//Imprimimos los resultados
			System.out.println("nota media: " + notaMedia + " nota Maxima: " + notaMax + " nota Minima: " + notaMin);
		}
		//Cerramos el escaner
		sc.close();
	}

}
