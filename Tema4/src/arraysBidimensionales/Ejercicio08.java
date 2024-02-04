package arraysBidimensionales;

public class Ejercicio08 {

	public static void main(String[] args) {
		final int LARGO=4;
		final int ANCHO=4;
		
		boolean bandera=false;
		int[][] tabla = new int[LARGO][ANCHO];

		for (int i=0 ; i<tabla.length ; i++) {
			for (int j=0 ; j<tabla[0].length ; j++) {
				tabla[i][j]=1;
			}
		}
		//tabla[2][3]=5;
		
		bandera = esSimetrico(tabla);
		if (bandera) {
			System.out.println("Es simetrica");
		} else System.out.println("No es simetrica");
	}
	
	public static boolean esSimetrico (int[][] tabla) {
		boolean bandera=true;
		for (int i=0 ; i<tabla.length ; i++) {
			for (int j=0 ; j<tabla[0].length ; j++) {
				if (tabla[i][j]!=tabla[j][j]) {
					bandera=false;
				}
			}
		}
		return bandera;
		
	}
}
