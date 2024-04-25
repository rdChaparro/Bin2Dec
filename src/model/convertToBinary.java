package model;

public class ConvertToBinary {

	public String toBinary(String x) {

		int numberDec = Integer.parseInt(x);
		int res = 0;
		String binary = "";

		while (numberDec >= 2) {
			res = numberDec;
			numberDec = numberDec / 2;
			binary = Integer.toString(res % 2) + binary;
			if (res / 2 == 1) {
				binary = Integer.toString(res / 2) + binary;
			}
		}
		return binary;
	}

}
