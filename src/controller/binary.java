package controller;

import errors.NoBinaryException;
import view.MenuBinary;

public class Binary {
	public static void main(String[] args) throws NoBinaryException {
		MenuBinary menuBinary = new MenuBinary();
		menuBinary.menu();
	}
}


// Resolver cuando el numero binario empieza por cero 
// el residuo del ultimo numero sea 0
