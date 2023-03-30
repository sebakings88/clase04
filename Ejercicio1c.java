package clase04;
import java.util.Scanner;
public class Ejercicio1c {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[3];
		int[] salida = new int[3];
		String order = "";
		if (args.length == 0) {
			for (int i=0;i<numeros.length;i++) {
				System.out.println("Ingrese " + (i+1) + "° numero:");
				numeros[i] = entrada.nextInt();
			}
			System.out.println("Ingrese letra a o d para ordenar ascendente o descendentemente:");
			order = entrada.next();
		} else {
			for (int i=0;i<args.length;i++) {
				if (i < 3) { 
					numeros[i] = Integer.parseInt(args[i]);
				} else if (i == 3) {
					order = args[i];
				} else {
				}
			}
		}
		if (order.equals("a")) {
			if (numeros[0]<numeros[1]) {
				if (numeros[0]<numeros[2]) {
					salida[0] = numeros[0];
					if (numeros[1]<numeros[2]) {
						salida[1]=numeros[1];
						salida[2]=numeros[2];
					} else {
						salida[1]=numeros[2];
						salida[2]=numeros[1];
					}
				} else {
					salida[0]=numeros[2];
					salida[1]=numeros[0];
					salida[2]=numeros[1];
				}
			} else {
				if (numeros[1]<numeros[2]) {
					salida[0]=numeros[1];
					if (numeros[0]<numeros[2]) {
						salida[1]=numeros[0];
						salida[2]=numeros[2];
					} else {
						salida[1]=numeros[2];
						salida[2]=numeros[1];
					}
				} else {
					salida[0]=numeros[2];
					salida[1]=numeros[1];
					salida[2]=numeros[0];
				}
			}
		} else {
			if (numeros[0]<numeros[1]) {
				if (numeros[2]<numeros[1]) {
					salida[0]=numeros[1];
					if (numeros[0]<numeros[2]) {
						salida[1]=numeros[2];
						salida[2]=numeros[0];
					} else {
						salida[1]=numeros[0];
						salida[2]=numeros[2];
					}
				} else {
					salida[0]=numeros[2];
					salida[1]=numeros[1];
					salida[2]=numeros[0];
				}
			} else {
				if (numeros[2]<numeros[0]) {
					salida[0]=numeros[0];
					if (numeros[2]<numeros[1]) {
						salida[1]=numeros[1];
						salida[2]=numeros[2];
					} else {
						salida[1]=numeros[2];
						salida[2]=numeros[1];
					}
				} else {
					salida[0]=numeros[2];
					salida[1]=numeros[0];
					salida[2]=numeros[1];
				}
			}
		}
		if (order.equals("a")) {
			System.out.println("Los numeros ordenados ascendentemente quedan de la siguiente manera:");
		} else {
			System.out.println("Los numeros ordenados descendentemente quedan de la siguiente manera:");
		}
		System.out.println(salida[0] + "-" + salida[1] + "-" + salida[2]);
		entrada.close();
	}
}