package view;

import java.util.Scanner;

import errors.NoBinaryException;
import model.ConvertToInteger;

public class MenuInsertBin {

	public void insertBinView() throws NoBinaryException {

		Scanner scannerCall = new Scanner(System.in);
		ConvertToInteger toInteger = new ConvertToInteger();
		MenuBinary binaryMenu = new MenuBinary();
		

		try {
			System.out.println("");
			System.out.println("*".repeat(65));
			System.out.println("Ingresa un numero binario valido de maximo diez digitos:");

			String eleccion = scannerCall.next();

			if (!eleccion.matches("[10]+")) {
				throw new NoBinaryException();
			}
			System.out.println("*".repeat(65));
			System.out.println("El numero en decimales es: \n");
			System.out.println(toInteger.toInt(eleccion));

			binaryMenu.menu();

		} catch (NumberFormatException e) {
			System.out.println("Debes ingresar un numero binario valido y menor de 10 digitos");
			insertBinView();
		} catch (NoBinaryException b) {
			System.out.println("Debes ingresar un numero binario valido y menor de 10 digitos");
			insertBinView();
		}

		finally {
			scannerCall.close();
		}
	}
}
