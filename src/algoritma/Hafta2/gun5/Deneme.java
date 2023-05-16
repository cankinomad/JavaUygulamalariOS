package algoritma.Hafta2.gun5;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("mail gir");
		String mail=input.nextLine();

		String mail1="@hotmail.com";
		
		String domain=mail.substring(mail.length()-12, mail.length());
		if (domain.equals(mail1))
		System.out.println("onaylandi");
		
	}

}
