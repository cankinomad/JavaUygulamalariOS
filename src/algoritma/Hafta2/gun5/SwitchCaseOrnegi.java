package algoritma.Hafta2.gun5;

import java.util.Scanner;

public class SwitchCaseOrnegi {

	// İç Anadolu --> Eskişehir, Konya, Ankara, Çankırı, Aksaray, Kırıkkale,
	// Kırşehir,//Yozgat,Niğde,Nevşehir,Kayseri,Sivas //
	
	//Marmara Bölgesi --> Sakarya,
	// Kocaeli,Bursa,Kırklareli,Edirne,Çanakkale,Balıkesir,//Tekirdağ,
	// İstanbul,Yalova,Bilecik
	// turkiyede'ki bir ilin hangi bolgede oldugunu bulan program
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sehir giriniz");
		String sehir=input.nextLine();
		//sehirin ilk harfini buyuk aldik ve kalan harflerini normal alrak toplatip 
		//string ifade icine aktardik.
		String upperSehir=sehir.substring(0, 1).toUpperCase()+sehir.substring(1,sehir.length());
		switch (upperSehir) {
		case "Eskişehir", "Konya", "Ankara", "Çankırı", "Aksaray", "Kırıkkale",
		 "Kırşehir","Yozgat","Niğde","Nevşehir","Kayseri","Sivas":
			System.out.println("yasadiginiz il Ic Anadolu bolgesindedir");
			
			break;
		case "Sakarya", "Kocaeli","Bursa","Kırklareli","Edirne","Çanakkale","Balıkesir","Tekirdağ", "İstanbul","Yalova","Bilecik":
			System.out.println("yasadiginiz il MArmara bolgesindedir");
		break;
		default:
			System.out.println("Girdiginiz sehir turkiye'de degildir");
			break;
		}
	}

}
