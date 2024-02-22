package cadenas;

public class Ejercicio12 {

	public static void main(String[] args) {
		//Variable que recoge una frase
		String frase = "Esto ha sido una barrabasada";
		//Array que guarda las distintas palabras de la frase
		String[] palabrasFrase;
		//Variable que guarda la palabra más larga
		String palabraLarga = "";
		//Dividimos la frase por palabras en el array
		palabrasFrase = frase.split(" ");
		//
		palabraLarga = palabrasFrase[0];

		for (int i = 0; i < palabrasFrase.length; i++) {
			if (palabraLarga.length() < palabrasFrase[i].length()) {
				palabraLarga = palabrasFrase[i];
			}
		}
		System.out.println("La palabras más larga es " + palabraLarga + " con " + palabraLarga.length() + " letras");

	}

}
