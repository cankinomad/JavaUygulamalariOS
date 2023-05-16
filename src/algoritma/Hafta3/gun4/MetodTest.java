package algoritma.Hafta3.gun4;

public class MetodTest {

	public static void main(String[] args) {
		metot1();
		metot2("JAva", 12, 5);

		int sayi1 = 10;
		int sayi2 = 15;
		String deger = "React";
		metot2(deger, sayi1, sayi2);
		// System.out.println(metot1());//void metotlar sout icinde kullanilamazlar
		int toplam = metot3();
		System.out.println("Toplam: " + toplam);
		System.out.println(metot3(12, 12));

	}// donusu olmayan parametresiz metod tipi, yani bize bir deger dondurmez
		// sadece metot icinde gecen islemeleri yapar.

	public static void metot1() {// sadece icindekini calistirir ve ne varsa onu cikarir
		System.out.println("Merhaba Dunya");
		int sayi1 = 5;
		int sayi2 = 6;
		int toplam = sayi1 + sayi2;
		System.out.println(toplam);

	}

	// donusu olmayan parametreli metot bize bir deger dondurmez
	// sadece metot icinde gecen islemleri yapar fakat disaridan bir parametre alir

	public static void metot2(String value, int number1, int number2) {
		System.out.println(value);
		int toplam = number1 + number2;
		System.out.println(toplam);
	}

	// donusu olan parametresiz metod--metot icindeki islemler sonucunda
	// bize bir deger doner bu deger metodun donus tipiyle ayni olmailidir!!!

	public static int metot3() {
		int sayi1 = 5;
		int sayi2 = 6;
		int toplam = sayi1 + sayi2;
		return toplam;
	}
	// metot overloading ayni isimli metotlari farkli parametrelerle tanimlayarak
	// kullanabilirz

	public static int metot3(int number1, int number2) {

		return number1 + number2;
	}
}
