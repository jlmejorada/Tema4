package arraysBidimensionales;

public class Ejercicio01 {

	public static void main(String[] args) {
		int[][] tabla = new int[3][6];

		// Fila 1
		tabla[0][0] = 0;
		tabla[0][1] = 30;
		tabla[0][2] = 2;
		tabla[0][5] = 5;

		// Fila 2
		tabla[1][0] = 75;
		tabla[1][4] = 0;

		// Fila 3
		tabla[2][2] = -2;
		tabla[2][3] = 9;
		tabla[2][5] = 11;
		
		for (int i=0 ; i<tabla.length ; i++) {
			for (int j=0 ; j<tabla[0].length ; j++ ) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
			
	}

}
