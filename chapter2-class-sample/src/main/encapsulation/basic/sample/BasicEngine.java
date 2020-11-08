package main.encapsulation.basic.sample;

public class BasicEngine {

	private float temperature;
	
	private short activePistonCount;
	
	private boolean status = false;
	
	public BasicEngine() {
		this.temperature = 0.0f;
		this.activePistonCount = 0;
	}
	
	// motor çalışmaya başladıktan 55 derece artmaktadır.
	// "temperature" değişkeninde motorun sıcaklık bilgisi tutulmaktadır.
	// Bu da nesnenin durumunu ifade eder. Bu durum değişikliğini bir fonksiyon yardımıyla yapıyoruz.
	// Engine tipindeki nesnenin sıcaklık bilgisi direkt olarak değiştirilemez. Bu kapsüllemeye iyi bir örnektir.
	public void start() {
		
		// motorun çalışma durumunu saklayan değişkeni true'ya çekip motorun çalışmaya başladığını belirtiyoruz.
		this.status = true;
		this.activePistonCount = 4;
		this.temperature += 55;
	}
	
	// Aynı şekilde moturu durdurma işini de bir fonksiyon yardımıyla yapıyoruz. 
	// Bu değişkenler üzerindeki veri değişimini fonksiyonlar ile yönetiyoruz.
	public void stop() {
		this.status = false;
	}
	
	
	// Motorun sıcaklığını azaltmak için soğutma ünitesinden faydalanıyoruz.
	// Böylece yine sıcaklık bilgisini direkt erişime açmadan dışarıdan bir fonksiyon yardımıyla değiştirilmesini sağlamış oluyoruz.
	// İşte bu da bir kapsülleme örneğidir.
	public void freezeTemperature(float freezeValue) {
		
		this.temperature -= freezeValue;
	}
	
	
	// Nesne üzerindeki private değişkenlerdeki değerleri dışarıdan okuyabilmek için yine fonksiyonlardan faydalanıyoruz.
	// Veri okuma işini de kapsülleme prensibine uygun şekilde yapmış oluyoruz.
	public boolean getStatus() {
		return this.status;
	}
	
	public int getActivePistonCount() {
		return this.activePistonCount;
	}
	
	public float getTemperature() {
		return this.temperature;
	}
	
}
