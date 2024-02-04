package arraysBidimensionales;

public class Ejercicio03 {
	//Constante para las filas
	public static final int ROW = 4;
	//Y las columnas
	public static final int COL = 5;
	//Función Main
	public static void main(String[] args) {
		//Creamos una tabla bidimensional
		int[][] tabla = new int [ROW][COL];
		//Lanzamos la funcion cambiatabla
		cambiaTabla(tabla);
		//Imprimimos la tabla
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
