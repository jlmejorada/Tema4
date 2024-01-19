package funciones;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int buscar(int t[], int clave) {
		// Variable que registra la posición en la que se encuentra el número
		int pos=-1;
		//Variable contador
		int i=0;
		// Booleana que registrara si se ha encontrado el número
		Boolean flag=false;
		// Creamos un bucle que se repita hasta recorra el array o que encuentre el número dentro del array
		while (flag!=true && i<t.length) {
			// Si la clave coincide con un número del array
			if (clave==t[i]) {
				//Pone la flag como true
				flag=true;
				//Registra la posición
				pos=i;
			}
		}
		// Devuelve la posición si lo encuentra o -1 en caso contrario
		return pos;
	}

}
