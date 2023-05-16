package algoritma.Hafta3.gun4;

import java.util.Scanner;

public class Soru3 {
	/*
	 * bir metot yazacagiz, bu metot disaridan 2 tane sayi alacak ve bunlari bir
	 * arraye atasin daha sonra arrayin ilk 2 elemaninin carpimini donsun main
	 * metotda bir sayi degerimiz olsun ve bunun bir baslangic degeri olsun bir de
	 * sonuc degeri tanimlayalim baslangic degeri=0 olsun daha sonra sonuca metotdan
	 * gelen deger ile tanimladigimiz sayi degerinin bolumunu esitleyelim ve sonucu
	 * yazdiralim
	 */
	public static void main(String[] args) {
		double sayi1 = 30;
		double sonuc = 0;
		// sonuc = metot1() / sayi1;
		// System.out.println(sonuc);

		int[] array = sayilariAta();
		int carpim = carpim(array);
		sonuc = carpim / sayi1;
		System.out.println(sonuc);
		//////////////////////
		System.out.println(carpim(sayilariAta()) / sayi1);

	}

	public static int metot1() {// istersen
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen 1. sayiyi giriniz");
		int sayi1 = input.nextInt();
		System.out.println("Lutfen 2. sayiyi giriniz");
		int sayi2 = input.nextInt();
		int[] sayilar = new int[2];
		sayilar[0] = sayi1;
		sayilar[1] = sayi2;
		int carpim;
		return carpim = sayilar[0] * sayilar[1];

	}

	public static int sayiAl() {
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen sayiyi giriniz");
		int sayi = input.nextInt();
		return sayi;
	}

	public static int[] sayilariAta() { // int dizi donuyor o yuzden return int[] yapiyoruz
		int sayi1 = sayiAl();
		int sayi2 = sayiAl();
		int[] sayilar = new int[2];
		sayilar[0] = sayi1;
		sayilar[1] = sayi2;
		return sayilar;
	}

	public static int carpim(int[] array) {

		return array[0] * array[1];
	}

}
