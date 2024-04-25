package view;

import java.util.Scanner;

import model.ConvertToBinary;

public class MenuInsertDec {

	public void InsertDecView() {

		ConvertToBinary tobinary = new ConvertToBinary();
		MenuBinary binaryMenu = new MenuBinary();
		
		Scanner scannerCall = new Scanner(System.in);
		
		try {			
			System.out.println("");
			System.out.println("*".repeat(50));
			System.out.println("Ingresa un numero decimal valido:");
			
			String eleccion = scannerCall.next();
			
			System.out.println("*".repeat(50));
			System.out.println("El numero en binario es: \n" );
			System.out.println(tobinary.toBinary(eleccion));
			
			binaryMenu.menu();
			
		} finally {
			scannerCall.close();
		}
	}

	
}
