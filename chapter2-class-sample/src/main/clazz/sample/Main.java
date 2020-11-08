package main.clazz.sample;

public class Main {

	public static void main(String[] args) {
		
		
		// DatabaseConnection sınıfından new anahtar kelimesi ile yeni bir nesne ürettik.
		// Ürettiğimiz nesne hafıza bir adrese yerleşti. Artık kullanılabilir durumdadır.
		
		
		DatabaseConnection dbConnection = new DatabaseConnection("jdbc:Mysql//11.145.23.22", "user_db", 3307);
		
		DatabaseConnection dbConnection2 = new DatabaseConnection("jdbc:Mysql//11.145.23.23", "product_db", 3307);

		DatabaseConnection dbConnection3 = new DatabaseConnection("jdbc:Mysql//11.145.23.24", "admin_db", 3307);

		DatabaseConnection dbConnection4 = new DatabaseConnection();
		
		DatabaseConnection dbConnection41 = new DatabaseConnection();
		
		DatabaseConnection dbConnection5 = new DatabaseConnection("jdbc:Mysql//11.145.23.24", 3307);
		
		DatabaseConnection dbConnection6 = new DatabaseConnection("jdbc:Mysql//11.145.23.24", "admin_db");
		

		dbConnection.showDatabaseInfo(true);
		
		dbConnection2.changeDatabase("map_db");
		
		dbConnection2.showDatabaseInfo(true);
		dbConnection3.showDatabaseInfo(true);
		
		dbConnection4.showDatabaseInfo(false);
		dbConnection5.showDatabaseInfo(true);

		
		
		// Oluşturduğumuz nesne üzerinden "open" isimli fonksiyonu çağırıyoruz.
		// Fonksiyon çağırmak için ismini yazıp () içine gerekli parametreleri göndermek gerekiyor.
		// "open" fonksiyonu parametresiz olduğu için open() şeklinde bir çağrım yeterli olacaktır.
		// Bu fonksiyonu çağırabilmemizin sebebi "public" olarak dışarıya açmamızdır.
		
		
		boolean dbConnectionStatus = dbConnection.open();
		System.out.println(dbConnectionStatus);

		// Yine oluşturduğumuz nesne üzerinden "showDatabaseInfo" fonksiyonunu çağırıyoruz.
		// Bu fonksiyon içine boolean tipinde bir parametre alıyor. Bu nedenle true veya false bir değer göndermemiz gerekiyor.
	 	dbConnection.showDatabaseInfo(true);
		
	}

}
