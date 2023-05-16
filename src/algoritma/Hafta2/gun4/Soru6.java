package algoritma.Hafta2.gun4;

import java.util.Scanner;

public class Soru6 {

	// girilen karakterin unlu mu unsuz mu oldugnuu bulunuz
	// switch-case kullaniniz
	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.println("Bir karakter giriniz");
		char ch = input.next().charAt(0);
		
		switch (ch) {
		case 65, 97, 69, 101, 73, 105, 79, 111, 86, 117:
			System.out.println("unlu harftir");
			break;
		default:
			System.out.println("unlu harf degildir");
		}
		input.close();*/

		// 2.yol
		Scanner input = new Scanner(System.in);
		System.out.println("Bir karakter giriniz");
		char ch = input.next().charAt(0);
		
		switch (ch) {
		case 'a','e','i','u','A','E','I','U':
			System.out.println("unlu harftir");
			break;
		default:
			System.out.println("unlu harf degildir");
		}
		input.close();
		 

	}

}
