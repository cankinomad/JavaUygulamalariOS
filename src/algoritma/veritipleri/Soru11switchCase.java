package algoritma.veritipleri;

import java.util.Scanner;

public class Soru11switchCase {

	/*
	 * Kullanicidan alinan sayiya gore hangi gunde oldugunu ve haftaici mi haftasonu
	 * mu oldugunu bulan programi yaziniz.
	 *
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi = input.nextInt();

		switch (sayi) {
		case 1:
			System.out.println("pazartesi");
			// System.out.println("Haftai ici"); boyle de yapabilrisin ama kod tekrari olur.
			break;
		case 2: //yanindaki numara kullanicidan alacagimiz numarayi temsil ediyor
			//eger string almak istersen pazartesi,sali yazman lazim.
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("persembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;
		
		}
		switch (sayi) {
		case 1, 2, 3, 4, 5:
			System.out.println("Haftaici");
			break;
		case 6,7:
			System.out.println("Hafta sonu");
		break;
		default:
			System.out.println("hatali bir sayi girdiniz. \nlutfen 1-7 arasi bir deger giriniz");
			break;
		}input.close();

	}

}
