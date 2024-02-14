package cadenas;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creamos una variable que recoja nuestra frase
		String frase = "";
		// Variable que recoge palabra por palabra
		String palabra = "";
		// Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		// Pedimos la palabra y la recogemos
		System.out.println("Dime una palabra para la frase");
		palabra = sc.next();
		// Un bucle que se repite hasta que se introduce un fin
		while (!palabra.equalsIgnoreCase("fin")) {
			// Limpiamos el escaner (por si se han introducido mas de una palabra)
			sc.nextLine();
			//Concatenamos la frase con la palabra introducida mas un espacio
			frase += palabra + " ";
			//Pedimos otra palabra y la recogemos
			System.out.println("Dime una palabra para la frase");
			palabra = sc.next();
		}
		//Imprimimos la frase
		System.out.println(frase);
		//Cerramos el escaner
		sc.close();
	}

}
