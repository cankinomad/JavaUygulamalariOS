package algoritma.Hafta3.gun2;

import java.util.Scanner;

public class ArrayOrnek {
	/*
	 * Kullanicidan bir ulke ismi alip bu dizide olup olmadigini kontrol edelim
	 * yoksa girdiginiz ulke bulunamadi diyelim
	 */

	public static void main(String[] args) {

		String[] dizi = { "Turkiye", "Japonya", "Mogolistan", "Fransa", "Danimarka", "Norvec" };
		Scanner input = new Scanner(System.in);
		System.out.println("Bir ulke giriniz");
		String ulke = input.nextLine();
		
		System.out.println("1. cozum");
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(ulke)) {
				System.out.println("Ulke bulundu");
				break;
			} else {
				if (i == dizi.length - 1)
					System.out.println("Girdgiiniz ulke bulunamadi");
				
					
				

			}

		}
		System.out.println("/////////////////////////////////////////");
		System.out.println("====================2.yol===============");
		int count=0;
		for (int  i= 0;  i< dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(ulke)) {
				System.out.println("Ulke bulundu");
				count++;
				break;
			}
		}
		if (count==0) {
			System.out.println("Ulke bulunamadi");
		}
		System.out.println("/////////////////////////////////////////");
		System.out.println("====================3.yol===============");
		String kontrol2="Girdiginiz Ulke bulunamadi!!!";
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equalsIgnoreCase(ulke)) {
				kontrol2="Girdiginiz ulke bulundu";
				break;
			}
		}
		System.out.println(kontrol2);
	}
}
