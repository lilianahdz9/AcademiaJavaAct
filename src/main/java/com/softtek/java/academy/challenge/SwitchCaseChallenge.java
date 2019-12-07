package com.softtek.java.academy.challenge;

public class SwitchCaseChallenge {
	public static void main(String... args) {
		int formulaNumber = 50;
		String heisenbergFormula = "";
		/*
		 * CHOICE I switch (formulaNumber) { case 30: heisenbergFormula += "Zn"; break;
		 * case 50: heisenbergFormula += "Mn"; case 10: heisenbergFormula += "Ne"; case
		 * 5: heisenbergFormula += "H"; break; default: heisenbergFormula += "He"; }
		 */
		/*
		 * CHOICE II switch (formulaNumber) { case 30: heisenbergFormula += "Zn"; break;
		 * case 10: heisenbergFormula += "O"; case 50: heisenbergFormula += "Mn"; case
		 * 5: heisenbergFormula += "Ne"; default: heisenbergFormula += "H"; }
		 */
		/*
		 * CHOICE III switch (formulaNumber) { case 50: heisenbergFormula += "Mn"; case
		 * 10: heisenbergFormula += "Ne"; break; case 30: heisenbergFormula += "Zn";
		 * case 5: heisenbergFormula += "O"; default: heisenbergFormula += "H"; }
		 */

		switch (formulaNumber) {
		case 20:
			heisenbergFormula += "Mn";
		case 60:
			heisenbergFormula += "Ne";
			break;
		case 50:
		case 10:
			heisenbergFormula += "Mn";
		case 5:
		case 90:
			heisenbergFormula += "Ne";
		default:
			heisenbergFormula += "H";
		}
		System.out.println(heisenbergFormula);
	}
}
