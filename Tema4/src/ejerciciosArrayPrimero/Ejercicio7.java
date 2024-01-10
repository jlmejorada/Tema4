package ejerciciosArrayPrimero;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos un array que almacene los meses del Año
		String mes[] = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };
		// Creamos un array de 12 de longitud
		int media[] = new int[12];
		// Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		//Creamos un bucle que recorra el array recogiendo los meses
		for (int i=0 ; i<media.length ; i++ ) {
			//pedimos la media de cada mes
			System.out.println("Dame la temperatura media de " + mes[i]);
			//Y lo recoger en la casilla correspondiente
			media[i]=sc.nextInt();
		}
		//Ahora creamos un bucle que imprimira por pantalla cada mes con su media
		for (int i=0 ; i<media.length ; i++) {
			//Imprimimos el nombre del mes
			System.out.print(mes[i] + ": \t");
			//Esto tabula para que empiece en la misma posicion
			if (i<7&&i!=1) {
				System.out.print("\t");
			}
			//Y este bucle se repetira el numero de veces igual que el numero de media
			for (int j=0 ; j<media[i] ; j++) {
				System.out.print("[]");
			}
			//Hacemos un salto de linea
			System.out.println();
		}
		//Cerramos el escaner
		sc.close();
	}

}
