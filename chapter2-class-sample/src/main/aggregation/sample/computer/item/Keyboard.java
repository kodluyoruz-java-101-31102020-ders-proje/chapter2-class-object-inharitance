package main.aggregation.sample.computer.item;

import java.util.Scanner;

public class Keyboard {

	private Scanner scanner;
	
	public Keyboard() {
		this.scanner = new Scanner(System.in);
	}
	
	public String readFromKeyboard() {
		
		String fetchedFromKeyboard = this.scanner.nextLine();
		return fetchedFromKeyboard;
	}
	
	public void close() {
		
		if(this.scanner == null) {
			return;
		}
		
		this.scanner.close();
	}
	
}
