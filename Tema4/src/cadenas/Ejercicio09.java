package cadenas;

public class Ejercicio09 {

	public static void main(String[] args) {
	    // Strings para la frase introducida
	    // Javalín, javalón             javalén, len, len
	    String frase = "Javalín, javalón \t me llamo Pablo Carbonero \t javalén, len, len";
	    // Llamamos a la función e imprimimos lo que nos devuelve
	    System.out.println(traductor(frase));

	}

	public static String traductor(String frase) {
	    // Creamos una constante para el "prefijo" jabalin jabalon
	    final String PREFIJO = "Javalín, javalón";
	    // Creamos una constante para el "sufijo" jabalin jabalon
	    final String SUFIJO = "javalén, len, len";
	    // Creamos una variable para la traducción final
	    String traduccion = "";
	    // Un array para guardar las frases divididas por los tab usados
	    String[] fraseDividida;
	    // Guardamos la frase dividida en array
	    fraseDividida = frase.split("\t");
	    // Recorremos el array
	    for (int i = 0; i < fraseDividida.length; i++) {
	        // Verificamos si la parte actual contiene el prefijo o sufijo
	        if (!fraseDividida[i].contains(PREFIJO) && !fraseDividida[i].contains(SUFIJO)) {
	            traduccion += fraseDividida[i];
	        }
	    }
	    // devolvemos la traduccion
	    return traduccion;
	}
}
