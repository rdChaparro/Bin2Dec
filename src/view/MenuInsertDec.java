package view;

import java.util.Scanner;

import errors.NoBinaryException;
import model.ConvertToBinary;

public class MenuInsertDec {

	public void insertDecView() throws NoBinaryException {

		ConvertToBinary tobinary = new ConvertToBinary();
		MenuBinary binaryMenu = new MenuBinary();
		Scanner scannerCall = new Scanner(System.in);

		try {
			System.out.println("");
			System.out.println("*".repeat(65));
			System.out.println("Ingresa un numero decimal valido de maximo 10 digitos:");

			String eleccion = scannerCall.next();

			System.out.println("*".repeat(65));
			System.out.println("El numero en binario es: \n"); 
			System.out.println(tobinary.toBinary(eleccion));

			binaryMenu.menu();

		} catch (NumberFormatException e) {
			System.out.println("Debes ingresar un numero decimal valido y menor de 10 digitos");
			insertDecView();
		}
		
		
		finally {
			scannerCall.close();
		}
	}

}
