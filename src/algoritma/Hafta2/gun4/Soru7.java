package algoritma.Hafta2.gun4;

import java.util.Scanner;

public class Soru7 {
	
	// 1'den 100'e kadar olan sayilari ekrana yazdiralim
	public static void main(String[] args) {
		
		/*for (int i = 1; i < 100; i++) {
			System.out.println("1'den 100'e kadar olan sayilar"+i);*/
		//Girilen sayiya kadar olan sayilarin toplami
		
		Scanner input=new Scanner(System.in);
		System.out.println("Sayi giriniz");
		int sayi=input.nextInt();
		int toplam=0;
		
		for (int i =1 ; i <=sayi; i++) {
			toplam+=i;
			
		}input.close();
		System.out.println(toplam);
		}

	}


