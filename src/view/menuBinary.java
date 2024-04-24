package view;

import java.util.Scanner;

import model.convertToBinary;
import model.convertToInteger;

public class menuBinary {
	
	public void menu () {
		
		Scanner scanner = new Scanner(System.in);
		convertToInteger toInt = new convertToInteger();
		convertToBinary tobinary = new convertToBinary();
		
		System.out.println("");
		System.out.println("*".repeat(50));
		System.out.println("Escoge: \n"
				+ "1. De binario a entero\n"
				+ "2. De entero a binario");
		
		int eleccion = scanner.nextInt();
		
		if (eleccion == 1) {
			toInt.toInt(null);
		} else if (eleccion == 2) {
			tobinary.toBinary(null);
		}
	}
}
