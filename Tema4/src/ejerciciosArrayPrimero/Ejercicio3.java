package ejerciciosArrayPrimero;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos un array de 5 de longitud
		int tabla[] = new int[10];
		// Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		// Un bucle que se repita el número de veces de longitud de la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Va registrando números aleatorios entre 1 y 100
			System.out.println("Dame el número " + (i + 1));
			tabla[i] = sc.nextInt();
		}
		// Imprimimos los números en orden inverso
		for (int i=(tabla.length-1);i>=0;i--) {
			System.out.println(tabla[i]);
		}
		sc.close();
	}

}
