package main.hierarchical.inheritance.sample;

public class KDVTax extends Tax {

	public KDVTax(double value) {
		super(value);
	}
	
	@Override
	public double calculate() {
		
		return (super.value * 0.18) + 5;
	}
}
