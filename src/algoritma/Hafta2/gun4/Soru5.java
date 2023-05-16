package algoritma.Hafta2.gun4;

import java.util.Scanner;

public class Soru5 {

	/*
	 * Girilen karakterin alfabenin icinde olup olmadigini kontrol ediniz
	 * 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("karakter giriniz");
		char karakter = input.next().charAt(0);

		int i = karakter;
//
//		if (i > 64 && i < 91) {// A'dan Z'ye kadar olan harfler
//			System.out.println(karakter + "-->" + "ascii code:" + i + " --->Alfabede vardir buyuk harf olarak vardir ");
//		} else if (i > 96 && i < 122) {// a'dan z'ye kadar olan harfler
//			System.out.println(karakter + "-->" + "ascii code:" + i + "--->Alfabe karsiligi kucuk harf olarak vardir ");
//		} else {
//			System.out.println(karakter + "-->" + "ascii code:" + "alfabe karsiligi yoktur");
//		}
		//diger cozum 2.yol
		if((karakter>='a'&& karakter<='z')|| (karakter>='A'&& karakter <='Z')) {
			System.out.println(karakter + "-->" + "ascii code:" + i + " --->Alfabede vardir buyuk harf olarak vardir ");
		}else {
			System.out.println(karakter + "-->" + "ascii code:" + "alfabe karsiligi yoktur");
		}
		input.close();
	}

}
