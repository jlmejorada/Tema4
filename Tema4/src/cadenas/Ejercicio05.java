package cadenas;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creamos una variable que recogera la frase
		String frase = "Hola, estamos en programación";
		// Creamos otra variable que recoja la cadena del reves
		String reves;
		// Llamamos a la función y recogemos la cadena del reves
		reves = delReves(frase);
		// Imprimimos la cadena
		System.out.println(reves);
	}

	public static String delReves(String cadena) {
		// Creamos una cadena que recoja la cadena dada la vuelta
		String vuelta="";
		// Creamos un bucle que se repita el número de veces igual a los caracteres de
		// la frase, empezando por el final de esta
		for (int i=(cadena.length())-1; i>=0  ;i--) {
			//Introducimos en la cadena el caracter correspondiente
			vuelta+=cadena.charAt(i);
		}
		// Devolvemos la cadena
		return vuelta;
	}

}
