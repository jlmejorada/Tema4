package claseArray;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Creamos una tabla y registramos los numeros ganadores
		int[] ganadora = { 3, 6, 9, 15, 32, 48 };
		// y creamos otra con el mismo tamaño
		int[] apuesta = new int[6];
		//Creamos una variable que registrara el número con el que trabajaremos
		int numero;
		//otra para los aciertos
		int aciertos = 0;
		//y otra que será un contador
		int i = 0;
		//Inicializamos el numero random
		Random rand = new Random();
		//Recorremos la tabla apuesta
		while (i < apuesta.length) {
			//y le asignamos un numero aleatroio
			numero = rand.nextInt(1, 50);
			
			//Miramos que el numero asigando no esté repetido
			if (busqueda(apuesta, numero) < 0) {
				apuesta[i] = numero;
				//avanzamos el contador
				i++;
			}
		}

		//Imprimimos la apuesta generada
		System.out.println(Arrays.toString(apuesta));

		//La recorremos
		for (int valor : apuesta) {
			//Y vemos el numero de aciertos
			if (Arrays.binarySearch(ganadora, valor) >= 0) {
				aciertos++;
			}
		}

		// Los mostramos por pantalla
		System.out.println("Tienes " + aciertos + " aciertos.");

	}

	public static int busqueda(int tabla[], int num) {
		int indice = 0;

		while (indice < tabla.length && num != tabla[indice]) {
			indice++;
		}

		if (indice == tabla.length) {
			indice = -1;
		}
		return indice;
	}

}
