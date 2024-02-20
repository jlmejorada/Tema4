package cadenas;

public class Ejercicio19 {

	public static void main(String[] args) {
		// Variable que reocge la variable original
		String fraseOriginal = "ME llaMo ManUel";
		// Imprimimos por pantalla lo que nos devuelva la función
		System.out.println(varCamel(fraseOriginal));

	}

	public static String varCamel(String frase) {
		// Variable que recogera la frase ya convertida
		String fraseCamel = "";
		// Creamos una bolean que registre si hemos pasado por un espacio
		boolean espacio = false;
		// Pasamos la frase a Array en minusculas
		char[] cambioFrase = frase.toLowerCase().toCharArray();
		// Recorremos el array
		for (int i = 0; i < cambioFrase.length; i++) {
			// Buscamos el espacio y si lo encontramos
			if (cambioFrase[i] == ' ') {
				// Marcamos el booleano como true
				espacio = true;
				// Si no es un espacio
			} else {
				// Si el booleano es true
				if (espacio) {
					// Y la cambiamos por esa misma letra en mayusculas
					cambioFrase[i] = Character.toUpperCase(cambioFrase[i]);
					// Ponemos el boolean como falso
					espacio = false;
				}
				// Añadimos a la frase en camel el digito
				fraseCamel += cambioFrase[i];
			}
		}
		// Devolvemos la frase en formato camel
		return fraseCamel;
	}

}
