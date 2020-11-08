package main.hierarchical.inheritance.sample;

public class KDVTax extends Tax {

	public KDVTax(double value, double ratio) {
		super(value, ratio);
	}
	
	@Override
	public double calculate() {
		
		if(super.value < 10000) {
			double newRatio = super.ratio - (super.ratio * 0.01);
			if(newRatio > 0) {
				return super.value * newRatio;
			}
		}
		else if(super.value > 100000) {
			double newRatio = super.ratio + (super.ratio * 0.10);
			if(newRatio > 0) {
				return super.value * newRatio;
			}
		}
		
		return (super.value * super.ratio) + 5;
	}
}
