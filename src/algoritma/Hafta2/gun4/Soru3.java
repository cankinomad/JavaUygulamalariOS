package algoritma.Hafta2.gun4;

import java.util.Scanner;

public class Soru3 {
	
	/*
	 * Giilen karakterin ascii kodunu bulunuz.
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Bir karakter giriniz");
		char karakter=input.nextLine().charAt(0);
		int a=karakter;
		System.out.println(a);
	}

}
