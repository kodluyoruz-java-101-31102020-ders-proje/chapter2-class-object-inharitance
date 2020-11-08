package main.hierarchical.inheritance.sample;

public class OTVTax extends Tax {

	public OTVTax(double value) {
		super(value);
	}
	
	@Override
	public double calculate() {
		
		if(super.value > 100000) {
			
			return super.value * 0.4 + 10000;
		}
		else if(super.value < 100000 && super.value > 50000) {
			
			return super.value * 0.3 + 5000;
		}
		else {
			return super.value * 0.12;
		}	
	}
}
