package arraysBidimensionales;

public class Ejercicio09 {

	public static void main(String[] args) {
		int tabla[][] = { { 2, 3, 1 }, { 3, 1, 2 }, { 1, 2, 3 } };

		if (esMagica(tabla)) {
			System.out.println("La matriz es magica");
		} else {
			System.out.println("La matriz no es magica");
		}
	}

	public static boolean esMagica(int tabla[][]) {
		boolean magico = true;

		int sumaCol = 0;
		int sumaFila = 0;

		for (int i = 0; i < tabla.length; i++) {
			sumaCol = 0;
			sumaFila = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				sumaFila += tabla[i][j];
				sumaCol += tabla[j][i];
				if (sumaFila != sumaCol) {
					magico = false;
				}
			}
		}

		return magico;
	}
}
