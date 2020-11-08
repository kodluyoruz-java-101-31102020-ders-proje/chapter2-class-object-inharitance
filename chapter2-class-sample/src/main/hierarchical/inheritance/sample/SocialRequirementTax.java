package main.hierarchical.inheritance.sample;

public class SocialRequirementTax extends Tax{
	
	public SocialRequirementTax(double value, double ratio) {
		
		super(value, ratio);
	}
	
	@Override
	public double calculate() {
		
		return (super.value * super.ratio) + 10;
	}
}
