package algoritma.Hafta2.gun4;

import java.util.Scanner;

public class Soru8 {
	// girilen sayiya kadar olan tek sayilarin toplamini bulan proigram

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = input.nextInt();
		int toplam = 0;
//		for (int i = 1; i <= sayi; i++) {// veyai'yi 1 den baslatip i+2 diyip if kullanmadan yapabilrisin
//			if (i % 2 != 0) {
//				toplam += i;
//			}
//
//		}
//		System.out.println("girdiginiz sayiya kadar olan tek sayilarin toplami :" + toplam);
//input.close();
		
		//2.yol
		int i=1;
		while (i<=sayi) {
			toplam+=i;
			i+=2;
		}System.out.println(toplam);
	}

}
