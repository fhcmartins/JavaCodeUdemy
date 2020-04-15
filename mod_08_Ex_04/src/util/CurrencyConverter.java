package util;

public class CurrencyConverter {
	public double dollarPrice;
	public double quantity;
	
	public double quotation() {
		double value = ((dollarPrice * quantity) * 0.06 + (dollarPrice * quantity));
		return value;
	}
	
	public String toString() {
		return "Amount to be paid in reais "
				+ String.format("%.2f", quotation());
	}
}
