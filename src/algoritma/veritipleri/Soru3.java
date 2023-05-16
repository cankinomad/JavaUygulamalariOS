package algoritma.veritipleri;

import java.util.Scanner;

public class Soru3 {

	/*
	 * kullanicidan 2 sayi alalim
	 * bu iki sayinin toplami cift ise true, tek ise false
	 * en son toplamin yarisini ekrana yazdir 
	 * 
	 */
	public static void main(String[] args) {
		//1.yol
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("1. sayiyi giriniz");
		int sayi1=input.nextInt();
		System.out.println("ilk girdiginiz sayi :"+ sayi1);
		System.out.println("2. sayiyi giriniz");
		int sayi2=input.nextInt();
		System.out.println("girdiginiz 2. sayi :"+ sayi2);
		float toplam= sayi1+sayi2; // toplami float tanimlayip da yapabilrisin f yazmadan
				
		/*if (toplam%2==0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}*/
		//float yarisi=toplam/2f; // sonucuun float cikmasi icin 2'nin sonuna f ifadesiyle float oldugunu belirtiyoruz
		//System.out.println("toplamin yarisi :"+ yarisi);
		
		
		//2. yol
		
		boolean durum= toplam%2==0; // durum kontrolu yaptiriyoruz if yerine
		
		float yarisi=toplam/2;
		System.out.println("Sayinin durumu :"+ durum);
		System.out.println("toplam sayinin yarisi :"+ yarisi);
		/*toplamin yarisi kontrolunu dogrudan sout icerisinde yapabiliriz
		 * ancak bir degere atayip yazdirmak daha dogrudur
		 * System.out.println(toplam%2==0);
		 */
		input.close();
		
	}

}
