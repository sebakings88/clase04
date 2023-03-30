package clase04;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio2a {
	public static void main(String[] args) throws IOException {
		String ruta = args[0];
		String operacion = args[1];
		int resultado = 0;
		for (String linea : Files.readAllLines(Paths.get(ruta))){
			if (operacion == "suma") {
				int numero = Integer.parseInt(linea);
				resultado = resultado + numero;
			} else {
				int numero = Integer.parseInt(linea);
				if (resultado == 0) {
					resultado = 1 * numero;
				}
					resultado = resultado * numero;
			}
		}
		System.out.println(resultado);
	}
}