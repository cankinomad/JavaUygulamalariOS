package algoritma.Hafta3.gun2;

import java.util.Scanner;

public class IbanSorusuSWitchCase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lutfen bir iban giriniz");
		String iban=scanner.nextLine().toUpperCase();
		
		String kontrol=iban.substring(0,3);
		
		switch (kontrol.trim()) {
		case "TR":
			System.out.println("Yurtici islemler");
			String bankaNo=iban.substring(iban.length()-4);//5001 veya 5002 gibi son 4 deger
			switch (bankaNo) {
			case "5001":
				System.out.println("Ziraat Bankasi");
				
				break;
			case "5002":
				System.out.println("Garanti Bankasi");
				
				break;
			case "5003":
				System.out.println("is bankasi Bankasi");
				
				break;

			default:
				System.out.println("Diger");
				break;
			}
			
			
			
			break;
		case "OTH":
			System.out.println("Yurt disi islmeler");
			String bankaNo2=iban.substring(iban.length()-4);
			switch (bankaNo2) {
			case "2000":
					System.out.println("Kita ici islemler");
					System.out.println(iban.replace("OTH", "KI"));
				break;

			default:
				System.out.println("Kita disi islemler");
				System.out.println(iban.replace("OTH", "KD"));
				break;
			}
			break;
		default:
			System.out.println("Yanlis iban girdiniz");
			break;
		}

	}

}
