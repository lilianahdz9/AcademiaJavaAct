package com.softtek.java.academy.exercises;

import java.util.Scanner;

/*Excercise
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 100.*/

public class Multiplos3y5 {
	public static void main(String[] args) {

		int suma = 0;

		for (int i = 0; i < 100; i++) {

			int mod3 = i % 3;
			if (mod3 == 0) {
				suma += i;
			}

			int mod5 = i % 5;
			if (mod5 == 0) {
				suma += i;
			}
		}

		System.out.println(suma);

	}

}
