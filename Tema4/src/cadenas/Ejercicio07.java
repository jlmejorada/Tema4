package cadenas;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Creamos una variable que recoja la frase
		String frase="Campana sobre campana y sobre campana una";
		//Creamos una variable que recoja la palabra
		String palabra="campana";
		//Creamos una variable que coja las veces que se repite
		int veces;
		//Llamamos a la funcion y recogemos las veces que se repite
		veces=contarPalabra(frase, palabra);
		//Imprimimos la respuesta
		System.out.println(palabra + " se repite " + veces + " veces");
	}
	
	public static int contarPalabra (String frase, String palabra) {
		//Creamos un contador
		int cont=0;
		//Creamos un array e introducimos la frase dividida por espacio
		String[] lista = frase.split(" "); 
		//Recorremos el array
		for (int i=0 ; i<lista.length ; i++) {
			//Creamos la condición de que las palabras coincidan
			if (palabra.equalsIgnoreCase(lista[i])) {
				//Sumamos al contador
				cont++;
			}
		}
		//Devolvemos el contador
		return cont;
	}

}
