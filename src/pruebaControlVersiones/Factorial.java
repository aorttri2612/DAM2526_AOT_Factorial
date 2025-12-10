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
	}

	private static int pedirNumero() {
		System.out.print("Introduce un número entero mayor o igual que 0: ");
		return sc.nextInt();
	}

}