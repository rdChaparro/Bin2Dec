package view;

import java.util.Scanner;

import model.ConvertToInteger;

public class MenuInsertBin {
	
	public void InsertBinView() {

	Scanner scannerCall = new Scanner(System.in);
	ConvertToInteger toInteger = new ConvertToInteger();
	MenuBinary binaryMenu = new MenuBinary();
	
	try {			
		System.out.println("");
		System.out.println("*".repeat(50));
		System.out.println("Ingresa un numero binario valido:");
		
		int eleccion = scannerCall.nextInt();
		
		System.out.println("*".repeat(50));
		System.out.println("El numero en decimales es: \n" );
		System.out.println(toInteger.toInt(Integer.toString(eleccion)));
		
		binaryMenu.menu();
		
	} finally {
		scannerCall.close();
	}
}
}