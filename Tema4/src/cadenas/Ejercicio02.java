package cadenas;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Creamos una variable para recoger la palabra que hay que adivinar
		String contraseña;
		//Creamos otra para la del intento del jugador 2
		String intento;
		// Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		//Pedimos la contraseña
		System.out.println("Jugador1, dame la contraseña");
		contraseña=sc.nextLine();
		do {
			System.out.println("Jugador2, intenta acertar la contraseña");
			intento=sc.nextLine();
			/*
			for (int i = 0; i < frase.length(); i++) {
	            // Si el carácter en [i] es un espacio (' ') aumentamos el contador 
	            if (frase.charAt(i) == ' ') espacios++;
	        }*/
		} while (!contraseña.equals(intento));
		
		
		
		
		//Cerramos el escaner
		sc.close();
	}

}
