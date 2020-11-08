package main.aggregation.sample.main;

import main.aggregation.sample.computer.Desktop;
import main.aggregation.sample.computer.Laptop;
import main.aggregation.sample.computer.item.Keyboard;
import main.aggregation.sample.computer.item.Screen;

public class Main {

	public static void main(String[] args) {
		
		// Kurucu metodu procted olarak belirttiğimiz için sadece Kalıtım sınıflarda çağrılabilir.
		// O yüzden dışarıdan çağrılamaz. Dışarıdan çağırabilmek için "public" olarak belirtmek gerekmektedir.
		// Computer computer = new Computer(new Screen(), new Keyboard());
		
		Desktop desktop = new Desktop(new Screen(), new Keyboard());
		String messageFromDesktop = desktop.readFromKeyboard();
		desktop.showOnScreen(messageFromDesktop);
		
		Laptop laptop = new Laptop(new Screen(), new Keyboard());
		String messageFromLaptop = laptop.readFromKeyboard();
		desktop.showOnScreen(messageFromLaptop);
	}
}
