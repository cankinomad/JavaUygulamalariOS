package algoritma.flowgorithm;

import java.util.Scanner;

public class Soru8 {

	// kullanicidan alinan 2 sayi 50'den buyukse toplansin ornegi.
	
	public static void main(String[] args) {
		int sayi1,sayi2;
		Scanner sc=new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz");
		sayi1= sc.nextInt();
		System.out.println("2. sayiyi giriniz");
		sayi2=sc.nextInt();
		sc.close();
		int toplam= sayi1+sayi2;
			
		if (sayi1>50 && sayi2>50) {
			System.out.println("Sayilarin toplami :"+toplam);
		}else { 
			System.out.println("Sayilardan birisi 50'den kucuk bir sayi giriniz");
		}
			
	}

}
