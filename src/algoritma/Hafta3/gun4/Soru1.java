package algoritma.Hafta3.gun4;

import java.util.Arrays;

public class Soru1 {
	/*
	 *      * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı
	 * 3 katı      * ise bilge 5 ise adam hem3 ve hem 5 ise bilgeadam yazdıralım int
	 * start=2; int      * end=22; çıktı
	 * [2,bilge,4,adam,bilge,7.......14,bilgeadam......bilge]      *       *      
	 */
	public static void main(String[] args) {
		int start = 2;
		int end = 22;
		String[] array = new String[end - start + 1];
		for (int i = 0; i < array.length; i++) {
			int sayi = i + start;
			if (sayi % 15 == 0) {
				array[i] = "bilge adam";

			} else if (sayi % 5 == 0) {
				array[i] = "adam";

			} else if (sayi % 3 == 0) {
				array[i] = "bilge";

			} else {
				array[i] = String.valueOf(sayi) ;// int ile string birlestirirsen string bir deger olusturuyor
				// array[i] = Integer.toString(sayi); 2.yol veya array[i]=String.valueOf(sayi);
			}
		}
		for (String string : array) {
			System.out.println(string);
		}
		System.out.println(Arrays.toString(array));
	}

}
