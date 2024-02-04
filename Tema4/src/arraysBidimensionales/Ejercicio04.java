package arraysBidimensionales;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Creamos una tabla 10x10
		int[][] mul = new int[10][10];
		//Recorremos las filas
		for (int i=0 ; i<mul.length ; i++){
			//Recorremos las columnas
			for (int j=0 ; j<mul[0].length ; j++ ) {
				//Registramos el numero de columna + 1 * numero de fila + 1
				mul [i][j] = (j+1)*(i+1);
			}
		}
		//Imprimimos la tabla
		for (int i=0 ; i<mul.length ; i++) {
			for (int j=0 ; j<mul[0].length ; j++ ) {
				System.out.print(mul[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
