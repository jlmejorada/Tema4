package funciones;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Variable que recoge la suma
		int mayor;
		// Creamos un array de numeros enteros
		int tabla[] = { 1, 2, 3, 4, 5, 6 };
		// Llamamos a la función que suma los número del array
		mayor = intMaximo(tabla);
		// Mostramos por pantalla el resultado
		System.out.println(mayor);
	}

	public static int intMaximo(int t[]) {
		// Creamos una variable que ira recogiendo el número mayor
		int mayor = 0;
		// Un bucle que recorrera el array
		for (int numero : t) {
			// Si el numero el es mayor que el ya registrado
			if (mayor < numero) {
				// registramos el número como mayor
				mayor = numero;
			}
		}
		// Devolvemos el número mayor
		return mayor;
	}

}
