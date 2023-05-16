package algoritma.Hafta2.gun5;

import java.util.Scanner;

public class Soru2DikdortgenIciBos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Yuksekligi giriniz");
		int yukseklik = input.nextInt();
		System.out.println("genisligi giriniz");
		int genislik = input.nextInt();
		char karakter = '*';

		for (int i = 0; i < yukseklik; i++) {
			for (int j = 0; j < genislik; j++) {
				//tavan ve tabani bosluksuz yazdirabilmek icin yapilan kontrol
				if (i==0 || i==yukseklik-1) {
					System.out.print(karakter);
				} else {
					if (j==0 || j==genislik-1) {
						System.out.print(karakter);
					}else {
						System.out.print(" ");
					}
				}

				
			}System.out.println();

		}input.close();
		

	}

}
