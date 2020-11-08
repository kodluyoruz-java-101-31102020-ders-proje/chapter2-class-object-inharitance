package main.hierarchical.inheritance.sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen fatura miktarınızı giriniz.");
		double invoiceValue = scanner.nextDouble();
		
		Tax[] taxes = new Tax[3];
		taxes[0] = new KDVTax(invoiceValue, 0.20);
		taxes[1] = new OTVTax(invoiceValue, 0.40);
		taxes[2] = new SocialRequirementTax(invoiceValue, 0.15);
		
		double totalTaxValue = TaxCalculator.totalTaxValue(taxes);
		System.out.println("Total Tax Value:" + totalTaxValue);
		
		scanner.close();
	}

}
