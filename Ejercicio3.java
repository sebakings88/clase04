package clase04;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Ejercicio3 {
	public static void main(String[] args) throws IOException {
		String abcd = "abcdefghijklmnñopqrstuvwxyz";
		String coder = args[0];
		int numdesp;
		if (coder == "cod") {	
			numdesp = Integer.parseInt(args[1]);
		} else {
			numdesp = -Integer.parseInt(args[1]);
		}
		String rutain = args[2];
		String rutaout = args[3];
		String textout = "";
		for (String linea : Files.readAllLines(Paths.get(rutain))){
			for (int i=0;i<linea.length();i++) {
				for (int j=0;j<abcd.length();j++) {
					if (linea.split("")[i].equals(abcd.split("")[j])) {
						if (j+numdesp<abcd.length()) {
							textout = textout + abcd.split("")[j+numdesp];
						} else {
							textout = textout + abcd.split("")[j+numdesp-abcd.length()];
						}
					}
				}
			}
		}
		Files.writeString(Paths.get(rutaout), textout);
		if (coder == "cod") {
			System.out.println("texto codificado correctamente");
		} else {
			System.out.println("texto decodificado correctamente");
		}
	}
}
