package util;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	public static double dollar;
	public static double real;
	//public static double paid;
	
	public static double currency(double dollar) {
		return dollar*IOF*real;
	
	}

}
