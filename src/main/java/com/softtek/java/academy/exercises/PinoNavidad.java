package com.softtek.java.academy.exercises;

import java.util.Scanner;

public class PinoNavidad {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los niveles de su Pino");
		int niveles = scanner.nextInt();
		String arbol = "";
		if (niveles >= 1 && niveles <= 10) {
			arbol = "*";
			int longitud = niveles;
			for (int i = 0; i < niveles; i++) {

				for (int j = 0; j < longitud; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
				longitud--;
			}

		}
	}
}
