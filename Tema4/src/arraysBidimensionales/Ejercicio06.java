package arraysBidimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {

	public static void main(String[] args) {
		int[][] tabla = new int [6][10]; 
		int [] minMax = new int [2];
		
		Random rand = new Random();
		
		for (int i=0 ; i<tabla.length ; i++) {
			for (int j=0 ; j<tabla[0].length ; j++) {
				tabla[i][j]=rand.nextInt(0,2);
			}
		}
		
		minMax = buscaExtremos(tabla);
		
		System.out.println(Arrays.toString(minMax));
		

	}
	
	public static int[] buscaExtremos (int[][] tabla) {
		int [] minMax = new int [2];
		minMax[0]=Integer.MAX_VALUE;
		minMax[1]=Integer.MIN_VALUE;
		
		for (int i=0 ; i<tabla.length ; i++) {
			for (int j=0 ; j<tabla[0].length ; j++) {
				if (minMax[0]>tabla[i][j]) {
					minMax[0]=tabla[i][j];
				}
				if (minMax[1]<tabla[i][j]) {
					minMax[1]=tabla[i][j];
				}
			}
		}
		return minMax;
	}

}
