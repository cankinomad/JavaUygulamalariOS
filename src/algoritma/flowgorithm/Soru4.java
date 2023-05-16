package algoritma.flowgorithm;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // kullanici 5 sayisini girsin
		//suan sc degeri esit degildir 5 e
		
		System.out.println("Bir deger giriniz");
		
		int sayi = sc.nextInt();
		sc.close();
		if (sayi!=0) {
			System.out.println("Isik aciktir");	
		}else {
		System.out.println("Isik kapali");
		}
	}

}
