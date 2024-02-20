package cadenas;

public class Ejercicio18 {

	public static void main(String[] args) {
		// Variable que recibe el titulo del documento
		String titulo = "Mi página Web";

		// Variable que recoge el contenido de la página web
		String contenido = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin elit erat, mattis non consequat et, aliquet eu massa. Sed lacinia a turpis et lobortis. Ut efficitur id erat eleifend placerat. Nunc convallis, quam sollicitudin tincidunt lacinia, quam quam placerat leo, nec hendrerit dolor risus quis mauris. Mauris scelerisque nisl tincidunt, hendrerit est ut, egestas nunc. Donec molestie malesuada justo, et tincidunt magna lacinia condimentum. Nulla facilisi. In ac lectus sed nisl congue consectetur sit amet ut enim. Curabitur tristique orci lobortis iaculis volutpat. Praesent laoreet, nunc eget posuere volutpat, lacus tellus rhoncus lacus, vel malesuada elit ipsum non elit. Pellentesque venenatis congue ante, ut suscipit lorem sodales ut. Aenean suscipit augue quis auctor pharetra. Ut porta nisl eu enim consectetur, non placerat tellus rutrum. In dignissim tortor eu ex auctor dignissim. Donec ipsum sapien, molestie et eros eu, iaculis consequat lectus.";

		//Mostramos por pantalla lo que nos devuelva nuestra función
		System.out.println(miPagina(titulo, contenido));
		
	}
	
	public static String miPagina(String titulo, String contenido) {
		//Variable que recoge el texto que devolveremos
		String devolvemos = "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "	<meta charset=\"utf-8\">\r\n"
				+ "	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<h1>" + titulo + "</h1><br><br>\r\n"
				+ "	<p>" + contenido + "</p>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		//Devolvemos el contenido de nuestra web
		return devolvemos;
		
	}

}
