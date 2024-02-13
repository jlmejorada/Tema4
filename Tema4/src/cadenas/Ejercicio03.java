package cadenas;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Creamos una variable que recogera una frase
		String frase="";
		//Creamos variable que recoja el número de ewspacios que le devuelva la función
		int espacios;
		//Inicializamos un escaner
		Scanner sc = new Scanner(System.in);
		//Pedimos una frase y la guardamos
		System.out.println("Dime una frase y te cuento sus espacios");
		frase=sc.nextLine();
		//Llamamos a la función y recogemos los espacios
		espacios=cuentaEspacios(frase);
		//Imprimimos la respuesta
		System.out.println("Hay " + espacios + " espacios");
		//Cerramos el escaner
		sc.close();
	}
	
	public static int cuentaEspacios(String frase) {
		//Creamos una variable que recoja los espacios de una frase
		int espacios=0;
		//Recorremos la cadena
		for (int i = 0; i < frase.length(); i++) {
            // Si el carácter en [i] es un espacio (' ') aumentamos el contador 
            if (frase.charAt(i) == ' ') espacios++;
        }
		//Devolvemos los espacios
		return espacios;
	}

}
