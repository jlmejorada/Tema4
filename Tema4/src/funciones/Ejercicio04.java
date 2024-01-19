package funciones;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Varibale que registre el número que se buscará en el array
		int num;
		//Variable que registra el indice de la busqueda
		int ind;
		// Creamos un array de numeros enteros
		int tabla[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// Inicializamos un escaner
		Scanner sc = new Scanner(System.in);
		//Pedimos el número a buscar
		System.out.println("Dame el número que buscaremos en el array");
		num=sc.nextInt();
		//Llamamos a la función y registramos el indice del número si existe
		ind=buscar(tabla, num);
		// Si el número no existe en el array
		if (ind>-1) {
			System.out.println(num+" se encuentra en la posición "+ind);
		} else System.out.println("No se encuentra en el array");
		// Cerramos el escaner
		sc.close();
	}

	public static int buscar(int t[], int clave) {
		// Variable que registra la posición en la que se encuentra el número
		int pos = -1;
		// Variable contador
		int i = 0;
		// Booleana que registrara si se ha encontrado el número
		Boolean flag = false;
		// Creamos un bucle que se repita hasta recorra el array o que encuentre el
		// número dentro del array
		while (!flag && i < t.length) {
			// Si la clave coincide con un número del array
			if (clave == t[i]) {
				// Pone la flag como true
				flag = true;
				// Registra la posición
				pos = i;
			}
			//Incremento
			i++;
		}
		// Devuelve la posición si lo encuentra o -1 en caso contrario
		return pos;
	}

}
