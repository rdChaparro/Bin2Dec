package view;

import java.util.Scanner;

import errors.NoBinaryException;

public class MenuBinary {

	public void menu() throws NoBinaryException {

		Scanner scanner = new Scanner(System.in);
		MenuInsertDec toBinary = new MenuInsertDec();
		MenuInsertBin toInteger = new MenuInsertBin();

		try {
			System.out.println("");
			System.out.println("*".repeat(65));
			System.out.println("Escoge el tipo de conversion: \n" + "1. De binario a entero\n"
					+ "2. De entero a binario\n" + "3. Salir");

			int eleccion = scanner.nextInt();

				if (eleccion == 1) {
					toInteger.insertBinView();
				} else if (eleccion == 2) {
					toBinary.insertDecView();
				} else if (eleccion == 3) {
					System.exit(1);
				}else {
					System.out.println("Escoge una de las opciones");
				}

		} finally {
			scanner.close();
		}
	}
}
