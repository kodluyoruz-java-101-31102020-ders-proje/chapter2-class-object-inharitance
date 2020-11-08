package main.hierarchical.inheritance.sample;

public class TaxCalculator {

	public static double totalTaxValue(Tax[] taxes) {
		
		double totalValue = 0;
		
		for(Tax tax : taxes) {
			
			totalValue += tax.calculate();
		}
		
		return totalValue;
	}
	
}
