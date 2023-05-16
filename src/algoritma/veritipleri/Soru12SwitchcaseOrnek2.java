package algoritma.veritipleri;

import java.util.Scanner;

public class Soru12SwitchcaseOrnek2 {

	public static void main(String[] args) {

		/*
		 * kullanicidan dogdugu ay ve dogdugu gun alinacak.
		 *
		 * koc burcu "21 mart-20Nisan Boga :21 nisan-21mayis ikizler :22 mayis-22haziran
		 * yengec :23haziran-22temmuz aslan :23temmuz-22agustos basak :23
		 * agustos-22eylul terazi ;23eylul-22ekim akrep ;23ekim-21kasim yay
		 * :22kasim-21aralik
		 * 
		 * 1. ay oglak burcu:22 aralik-21ocak 2.ay kova burcu :22ocak-19Subat
		 * 
		 * Balik Burcu:20subat-20Mart
		 * 
		 * kacinci ayda oldugunuz--> 4. ayda hangi gun dogdugunuz--> ayin20'sinde
		 * 
		 * Switch case kullanalim Default-->1-12arasinda bir sayi girin
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Hangi Ay'da dogdunuz?");
		int ay = input.nextInt();
		System.out.println("Hangi Gun'de dogdunuz?");
		int gun = input.nextInt();

		switch (ay) {
		case 1:
			if (gun < 21 && gun > 0) {
				System.out.println("Oglak burcu");
			} else if (gun >= 21 && gun <= 31) {
				System.out.println("Kova");

			} else {
				System.out.println("lutfen gecerli bir gun giriniz(1-30 arasi)");

			}
			break;
		case 2:
			if (gun < 19 && gun > 0) {
				System.out.println("Kova");
			} else if (gun >= 19 && gun <= 28) {
				System.out.println("Balik");

			} else {
				System.out.println("lutfen gecerli bir gun giriniz(1-30 arasi)");
			}
			break;
		case 3:
			if (gun<20 && gun>0) {
				System.out.println("Balik");
			}else if(gun>=20 && gun<32) {
				System.out.println("Koc");
			}else {
				System.out.println("lutfen gecerli bir gun giriniz(1-30 arasi)");
			}break;
		case 4:
			if (gun<20 && gun>0) {
				System.out.println("Koc");
			}else if(gun>=20 && gun<31){
				System.out.println("Boga");
			}else {
				System.out.println("lutfen gecerli bir gun giriniz(1-30 arasi)");
			}break;
		case 5:
			if(gun<21 && gun>0) {
				System.out.println("Boga");
			}else if(gun>=21&&gun<32) {
				System.out.println("Ikizler");
			}else {
				System.out.println("lutfen gecerli bir gun giriniz(1-30 arasi)");
			}break;
		case 6:
			if (gun<22 & gun>0) {
				System.out.println("ikizler");
			}else if(gun>=22 && gun<31) {
				System.out.println("yengec");
			}else {
				System.out.println("lutfen gecerli bir gun giriniz(1-30 arasi)");
			}break;
		case 7:
			if (gun<22&&gun>0) {
				System.out.println("yengec");
			}else if(gun>=22 && gun<32) {
				System.out.println("aslan");
			}else {
				System.out.println("lutfen gecerli bir gun giriniz(1-30 arasi)");
			}break;
		case 8:
			if (gun<22&&gun>0) {
				System.out.println("aslan");
			}else if(gun>=22 && gun<32) {
				System.out.println("basak");
			}else {
				System.out.println("lutfen gecerli bir gun giriniz(1-30 arasi)");
			}break;
		case 9:
			if (gun<22 && gun>0) {
				System.out.println("basak");
			}else if(gun>=22 && gun<31) {
				System.out.println("terazi");
			}else {
				System.out.println("lutfen gecerli bir gun giriniz(1-30 arasi)");
			}break;
		case 10:
			if(gun<23&&gun>0) {
				System.out.println("terazi");
			}else if(gun>=23&&gun<32) {
				System.out.println("akrep");
			}else {
				System.out.println("lutfen gecerli bir gun giriniz(1-30 arasi)");
			}break;
		case 11:
			if(gun<21&&gun>0) {
				System.out.println("akrep");
			}else if(gun>=21&&gun<31) {
				System.out.println("yay");
			}else {
				System.out.println("lutfen gecerli bir gun giriniz(1-30 arasi)");
			}break;
		case 12:
			if (gun<21&&gun>0) {
				System.out.println("yay");
			}else if (gun>=21&&gun<32) {
				System.out.println("oglak");
			}else {
				System.out.println("lutfen gecerli bir gun giriniz(1-30 arasi)");
			}break;
			default:
				System.out.println("1 ile 12 arasinda bir deger giriniz");
				break;
		}input.close();

	}

}
