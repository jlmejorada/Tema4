package funciones;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variable que recoge la suma
		int suma;
		// Creamos un array de numeros enteros
		int tabla[] = { 1, 2, 3, 4, 5, 6 };
		// Llamamos a la función que suma los número del array
		suma = SumaArray(tabla);
		// Mostramos por pantalla el resultado
		System.out.println(suma);
	}

	// Recibe un array y suma los números enteros que lo componen
	public static int SumaArray(int tabla[]) {
		// Creamos una variable que recogera el resultado de la suma
		int res = 0;
		// Bucle que recorre el array
		for (int numero : tabla) {
			// Suma al resultado el número correspondiente del array
			res += numero;
		}
		// Devuelve el resultado
		return res;
	}

}
