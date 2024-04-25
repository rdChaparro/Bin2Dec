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
			
			int eleccion = scannerCall.nextInt();
			
			System.out.println("*".repeat(50));
			System.out.println("El numero en binario es: \n" );
			System.out.println(tobinary.toBinary(Integer.toString(eleccion)));
			
			binaryMenu.menu();
			
		} finally {
			scannerCall.close();
		}
	}

	
}
