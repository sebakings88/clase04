package clase04;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio2 {
	public static void main(String[] args) throws IOException {
		String ruta = args[0];
		int resultado = 0;
		for (String linea : Files.readAllLines(Paths.get(ruta))){
			int numero = Integer.parseInt(linea);
			resultado = resultado + numero;
		}
		System.out.println(resultado);
	}
}
