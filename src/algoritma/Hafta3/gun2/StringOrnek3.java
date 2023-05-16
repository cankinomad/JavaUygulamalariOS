package algoritma.Hafta3.gun2;

import java.util.Scanner;

public class StringOrnek3 {
	/*Dışarıdan bir	ıban değeri
	girelim TR 1001005001,TR 1001005002
	veya OTH*2002002000	gibi daha
	sonra bu	değerleri kontrol
	edelim eğer	Tr ile başlıyorsa*
	yurt içi	işlemler yazsın
	ve Eğer 5001	ile Bitiyorsa Ziraat 5002
	ile bitiyorsa*Garanti 5003	ile bitiyorsa
	İş bankası	yazdırsın eğer
	OTH ise	Yurt dışı*	işlemler yazdıralım 2000
	ile bitiyorsa	kıta içi
	işelmeler ve	OTH yerine *Ki 200200…
	değilse kıta	dışı işlemler
	yazsın ve	OTH yerine Kd 200201…*/

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("iBANINIZI GIRINIZ");
		String iban=input.nextLine().toUpperCase();
		
		
		if(iban.startsWith("Tr".toUpperCase())) {
			System.out.println("Yurtici islemler");
			if(iban.endsWith("5001")) {
				System.out.println("Ziraat bankasi islemi");
			}else if(iban.endsWith("5002")){
				System.out.println("Garanti bankasi islemi");
			}else if(iban.endsWith("5003")) {
				System.out.println("IS bankasi islemi");
			}else {
				
				System.out.println("Diger");
			}
		}else if((iban.startsWith("Oth".toUpperCase()))) {
			System.out.println("Yurtdisi islemler");
			if(iban.endsWith("2000")) {
				System.out.println("Kita ici islemler");
				System.out.println(iban.replace("Oth".toUpperCase(), "KI"));
				
			}else {
				System.out.println("Kita disi islemler");
				System.out.println(iban.replace("Oth".toUpperCase(), "KI"));
				
			}
		}

	}

}
