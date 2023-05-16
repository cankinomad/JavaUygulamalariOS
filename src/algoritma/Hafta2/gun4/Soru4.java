package algoritma.Hafta2.gun4;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Sayi giriniz");
		int sayi=input.nextInt();
		
		input.nextLine();/* tek scanner ile sayidan sonra
		bunu ekleyip string alabilirsin 2. scanner acmana gerek kalmadan*/ 
		
		System.out.println("Metin giriniz"+sayi);
		
		String wordString=input.nextLine();
		

		System.out.println(wordString);
		input.close();
		
	}

}
