package algoritma.Hafta3.gun2;

import java.util.Scanner;


public class StringOrnek1 {
	
	/*
	 * disaridan bir kelime aliniz, her harfi basina index
	 * numarasi gelecek sekilde alt alta yazdirin
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime=input.nextLine();
		for (int i = 0; i < kelime.length(); i++) {
			
			System.out.println(i+"-"+kelime.charAt(i));
		}
		

	
	
	}
	

}
