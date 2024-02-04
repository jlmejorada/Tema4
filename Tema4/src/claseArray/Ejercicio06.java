package claseArray;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Creamos una variable que recogera el numero y otra la veces que se repite
		int num, cuanto=0;
		//Creamos una variable que nos dira si el numero se repite
		boolean flag=false;
		//Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		//Creamos una tabla de tamaño 1000
		int tabla[]= new int[1000];
		//Recorremos la tabla
		for (int i = 0 ; i<tabla.length; i++) {
			//Asignamos a cada posicion un numero entre 0-99
			tabla[i]=(int)(Math.random()*100);
		}
		//Pedimos y registramos el numero
		System.out.println("Dame un numero");
		num=sc.nextInt();
		//Recorremos la tabla
		for (int numero : tabla) {
			//Vemos si coincide alguna vez con el numero que preguntamos
			if (numero==num) {
				//Contamos cuantas veces
				cuanto++;
				//Marcamos como que aparece
				flag=true;
			}
		}
		
		//Si ha aparecido alguna vez
		if (flag) {
			//Mostramos por 'pantalla el resultado
			System.out.println("El número existe y aparece " + cuanto);
			//Si no, decimos que no existe
		} else System.out.println("No existe");
		//Cerramos el escaner
		sc.close();
	}

}
