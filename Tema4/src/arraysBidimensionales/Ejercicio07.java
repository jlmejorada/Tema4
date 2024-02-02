package arraysBidimensionales;

import java.util.Random;

public class Ejercicio07 {

	public static void main(String[] args) {
		int [][] tablaOrigin = new int [4][4];
		int [][] tablaTurned = new int [4][4];

		Random rand = new Random();
		
		for (int i=0 ; i<tablaOrigin.length ; i++) {
			for (int j=0 ; j<tablaOrigin[0].length ; j++) {
				tablaOrigin[i][j]=rand.nextInt(0,1001);
			}
		}
		
		System.out.println("Tabla derecha");
		for (int i=0 ; i<tablaOrigin.length ; i++) {
			for (int j=0 ; j<tablaOrigin[0].length ; j++) {
				System.out.print(tablaOrigin[i][j]+"\t");
			}
			System.out.println();
		}
		
		tablaTurned = giraTabla(tablaOrigin);
		System.out.println();
		System.out.println("Tabla girada");
		for (int i=0 ; i<tablaTurned.length ; i++) {
			for (int j=0 ; j<tablaTurned[0].length ; j++) {
				System.out.print(tablaTurned[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static int[][] giraTabla (int[][] tabla) {
		int [][] tablaTurned = new int [4][4];
		for (int i=0 ; i<tabla.length ; i++) {
			for (int j=0 ; j<tabla[0].length ; j++) {
				tablaTurned[j][i]=tabla[i][j];
			}
		}
		return tablaTurned;
	}
}
