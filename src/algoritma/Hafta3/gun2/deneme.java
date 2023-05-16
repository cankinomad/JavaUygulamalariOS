package algoritma.Hafta3.gun2;

import java.util.Scanner;

public class deneme {
public static void main(String[] args) {
	/*
	 * disaridan bir kelime aliniz, her harfi basina index
	 * numarasi gelecek sekilde alt alta yazdirin
	 */
	Scanner input=new Scanner(System.in);

	String kelime2=input.nextLine();
	for (int i = 0; i < kelime2.length(); i++) {
	System.out.println((i+1)+"-"+kelime2.charAt(i));
	}
	
}
}
