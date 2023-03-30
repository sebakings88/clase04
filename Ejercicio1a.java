package clase04;
public class Ejercicio1a {
	public static void main(String[] args) {
		int[] numeros = new int[3];
		int[] salida = new int[3];
		String order = "";
		for (int i=0;i<args.length;i++) {
			if (i < 3) { 
				numeros[i] = Integer.parseInt(args[i]);
			} else if (i == 3) {
				order = args[i];
			} else {
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
	}
}