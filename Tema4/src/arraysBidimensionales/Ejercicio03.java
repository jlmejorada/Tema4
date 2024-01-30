package arraysBidimensionales;

public class Ejercicio03 {

	public static final int ROW = 4;
	public static final int COL = 5;
	
	public static void main(String[] args) {
		int[][] tabla = new int [ROW][COL];
		cambiaTabla(tabla);
		for (int i=0 ; i<tabla.length ; i++) {
			for (int j=0 ; j<tabla[0].length ; j++ ) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void cambiaTabla(int tabla[][]) {
		for (int i=0 ; i<tabla.length ; i++) {
			for (int j=0 ; j<tabla[0].length ; j++ ) {
				tabla[i][j]= 10 * i + j;
			}
		}
	}

}
