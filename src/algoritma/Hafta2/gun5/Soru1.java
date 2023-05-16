package algoritma.Hafta2.gun5;

import java.util.Scanner;

public class Soru1 {
	// bir dikdortgenin boyutlarina gore cizdiren programi yazdiniz
	// ******
	// ******
	// ******
	//
	// contains ve equals ile beraber mail kontrolune bak
	
	//ici dolu olan 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Yuksekligi giriniz");
		int yukseklik = input.nextInt();
		System.out.println("genisligi giriniz");
		int genislik = input.nextInt();
		char karakter = '*';

		for (int i = 0; i < yukseklik; i++) {
			for (int j = 0; j < genislik; j++) {

				System.out.print(karakter);
			}System.out.println();

		}
		input.close();

	}

}
