package algoritma.Hafta2.gun5;

import java.util.Scanner;

public class Soru2AltCozum {		
	
	//3 for ile olan cozumu

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int yukseklik = input.nextInt();
		int genislik = input.nextInt();

		// tavan
		for (int i = 0; i < genislik; i++) {
			System.out.print("*");
			
		}
		System.out.println();
		
		//orta
		for (int i = 0; i < yukseklik-2; i++) {
			System.out.print("*");
			for (int j = 0; j < genislik-2; j++) {
				System.out.print(" ");
				
			}
			System.out.println("*");
		}
			//taban
		for (int i = 0; i < genislik; i++) {
			System.out.print("*");
			
		}
						

					input.close();	

					
	}
}
