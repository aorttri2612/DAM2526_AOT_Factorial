package pruebaControlVersiones;

import java.util.Scanner;

public class Factorial {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Introduce un número entero mayor o igual que 0: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("ERROR: el número debe ser mayor o igual que 0.");
		} else {
			System.out.println("Has introducido el número: " + num);
		}
		System.out.println(pedirNumero());
		sc.close();
		System.out.println("RESULTADO - El factorial del número " + num + " es " + factorialBucle(num));
	}

	private static int pedirNumero() {
		int num;
		boolean valido;

		do {
			System.out.print("Introduce un número entero mayor o igual que 0: ");
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				valido = true;
			} else {
				System.out.println("Entrada no válida. Introduce un entero.");
				sc.next();
				valido = false;
				num = -1;
			}
		} while (!valido);

		return num;
	}

	private static long factorialBucle(int n) {
		// TODO: crea tu el contenido de esta función... si eres capaz
		// No soy capaz al final si puedo te lo hago
		if (n = !0) {
			;
		}

	}

	private static long factorialRec(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		return n * factorialRec(n - 1);
	}

}