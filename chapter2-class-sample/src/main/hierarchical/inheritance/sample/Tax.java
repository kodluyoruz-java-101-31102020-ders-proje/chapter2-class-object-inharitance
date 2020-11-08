package main.hierarchical.inheritance.sample;

public class Tax {

	protected double ratio;
	protected double value;

	public Tax() {
		this.ratio = 0.0;
		this.value = 0.0;
	}
	
	public Tax(double value, double ratio) {
		this.value = value;
	}
	
	public double calculate() {
		
		return this.value * this.ratio;
	}

}
