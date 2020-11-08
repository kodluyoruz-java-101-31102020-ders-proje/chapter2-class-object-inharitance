package main.hierarchical.inheritance.sample;

public class SocialRequirementTax extends Tax{
	
	public SocialRequirementTax(double value) {
		
		super(value);
	}
	
	@Override
	public double calculate() {
		
		return 10;
	}
}
