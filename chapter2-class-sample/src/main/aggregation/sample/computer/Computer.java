package main.aggregation.sample.computer;

import main.aggregation.sample.computer.item.Keyboard;
import main.aggregation.sample.computer.item.Screen;

public class Computer {

	// Screen ve Keyboard tipinden bir nesneleri referans olarak tutuyoruz.
	// "keyboard" ve "screen" isimli nesneler "HAS-A" ilişkisine örnektir.
	// "Inheritance" yoluyla değil de "Aggregation" yoluyla sınıf içinde tanımlanmıştır.
	
	/*
	 * Keyboard ve Screen niçin Computer sınıfına kalıtım vermemiştir diye sorabilirsiniz.
	 * Çünkü, Keyboard ve Screen veri tipi, Computer veri tipiyle bir akrabalık ilişkisi yoktur.
	 * Computer başka bir nesnedir. Keyboard başka bir nesnedir. Akrabalık bağı bulunmadığı için bu sınıflardan nesneleri "Aggregation" yoluyla
	 * Computer sınıfı içinde kullandık.
	 * 
	 * Fakat, Computer sınıfından kalıtım almış Laptop ve Desktop alt sınıfları kalıtım oluyla ilişki kurarlar.
	 * Çünkü, Desktop ve Laptop, Computer nesnesinin bir alt türüdür. Bir akrabalık ilişkisi vardır. 
	 * Aynı ailenin üyesidirler. Computer sınıfı ile Desktop ve Laptop sınıfları arasındaki ilişki "IS-A" ilişkisidir.
	 * 
	 */
	
	protected Keyboard keyboard;
	protected Screen screen;
	protected int size;
	protected String material;

	
	protected Computer(Screen screen, Keyboard keyboard) {
		
		this.screen = screen;
		this.keyboard = keyboard;
	}
	
	public void showOnScreen(String message) {
		
		this.screen.show(message);
	}
	
	public String readFromKeyboard() {
		
		return this.keyboard.readFromKeyboard();
	}
}
