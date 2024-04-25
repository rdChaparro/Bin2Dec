package model;

public class ConvertToInteger {
	public String toInt(String x) {

		int res = 0;
		int count = 1;

		for (int n = x.length() - 1; n >= 0; n--) {

			int numberDec = Character.getNumericValue(x.charAt(n));
			res += count * numberDec;
			count *= 2;
		}

		return Integer.toString(res);
	}
}
