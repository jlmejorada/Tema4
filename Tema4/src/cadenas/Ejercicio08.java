package cadenas;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Creamos una variable que almacenará la frase
		String frase = "Dabale arroz a la zorra el abad";
		// Llamamos a la función
		palindromo(frase);
	}

	public static void palindromo(String frase) {
		// Almacenamos la frase original
		String fraseOriginal;
		// Aquí guardaremos la frase dada la vuelta
		String fraseInvertida = "";
		// Lo primero que haremos será quitarle los espacios a la frase
		fraseOriginal = frase.replace(" ", "");
		// Creamos un bucle que se repita el número de veces igual a los caracteres de
		// la frase, empezando por el final de esta
		for (int i = (fraseOriginal.length()) - 1; i >= 0; i--) {
			// Introducimos en la cadena el caracter correspondiente
			fraseInvertida += fraseOriginal.charAt(i);
		}
		// Ahora que tenemos dada la vuelta la frase, compararemos si es palindroma o no
		if (fraseOriginal.equalsIgnoreCase(fraseInvertida)) {
			System.out.println("Es palindroma");
		} else System.out.println("No es palindroma");
	}

}
