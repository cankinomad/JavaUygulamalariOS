package algoritma.Hafta2.gun4;

import java.util.Scanner;

public class Soru1 {

	// kullanicidan 2 tam sayi deger alalim.Bu iki sayinin toplami
	// cift degilse false, ciftse true yazdiralim
	// sonunda bu sayilarin toplamioini yarisi
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("2 sayi giriniz");
		int sayi1 = input.nextInt();
		int sayi2 = input.nextInt();

		int toplam = sayi1 + sayi2;
		int yarisi=toplam/2;
		if (toplam % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		System.out.println(yarisi);
		input.close();
	}

}
