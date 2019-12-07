package com.softtek.java.academy.exercises;

import java.util.Scanner;

/*Write a do-while loop that asks the user to enter two numbers. 
 * The numbers should be added and the sum displayed. 
	The loop should ask the user whether he or she wishes to perform the operation again.
	If so, the loop should repeat; 
	otherwise it should terminate. 
*/

public class TwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int suma = 0;
		boolean control = true;

		do {
			System.out.println("Ingrese el primero de los numeros");
			int numero1 = scanner.nextInt();
			System.out.println("Ingrese el segundo de los numeros");
			int numero2 = scanner.nextInt();

			suma = numero1 + numero2;
			System.out.println("¿Desea continuar sumando numeros? Y/N");
			String respuesta = scanner.nextLine();

			if (respuesta == "Y" || respuesta == "N" || respuesta == "n" || respuesta == "y") {
				
			}

		} while (true);

	}

}
