package claseArray;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Creamos una tabla de 30 posiciones
		int tabla[]= new int[30];
		//La recorremos gracias a un bucle for
		for (int i = 0 ; i<tabla.length; i++) {
			//Le asignamos un numero aleatorio entre 0-9 a cada posicion
			tabla[i]=(int)(Math.random()*10);
		}
		//Usamos la funcion Arrays.sort, que ordena el array
		Arrays.sort(tabla);
		//Lo mostramos por pantalla
		System.out.println(Arrays.toString(tabla));

	}

}
