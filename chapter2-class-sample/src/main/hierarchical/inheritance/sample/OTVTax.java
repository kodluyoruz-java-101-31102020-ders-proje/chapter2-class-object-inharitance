package main.hierarchical.inheritance.sample;

public class OTVTax extends Tax {

	public OTVTax(double value, double ratio) {
		super(value, ratio);
	}
	
	@Override
	public double calculate() {
		
		if(super.value > 100000) {
			
			return super.value * super.ratio + 10000;
		}
		else if(super.value < 100000 && super.value > 50000) {
			
			return super.value * (super.ratio - 0.1) + 5000;
		}
		else {
			return super.value * 0.12;
		}	
	}
}
