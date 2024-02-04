package arraysBidimensionales;

import java.util.Random;

public class Ejercicio10 {

	private static final int N = 4;
	
	public static void main(String[] args) {

		Random aleatorio = new Random();

		int resultado[][];
		int tablaInicio[][] = new int[N][N];

		for (int i = 0; i < tablaInicio.length; i++) {
			for (int j = 0; j < tablaInicio[i].length; j++) {
				tablaInicio[i][j] = aleatorio.nextInt(1, 101);
			}
		}
		
		resultado = gira90(tablaInicio);
		
		for(int fila[] : tablaInicio) {
			for(int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int fila[] : resultado) {
			for(int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();

		}
	}
	
	public static int[][] gira90(int tablaInicio[][]){
		int tablaGiro[][] = new int[N][N];
		int a = N - 1;
		
		for (int i = 0; i < tablaInicio.length; i++) {
			for (int j = 0; j < tablaInicio[i].length; j++) {
				
				tablaGiro[i][j] = tablaInicio[a][i];
				a--;
			}
			a = N - 1;
		}

		return tablaGiro;
	}

}
