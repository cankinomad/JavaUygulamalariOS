package algoritma.veritipleri;

import java.util.Scanner;

public class Soru1 {

	
	/* Bir urunun satis fiyatinin icinde %18 kdv ve
	 * %15 kar oldugu biliniyor.
	 * urunun ham fiyati nedir?
	 * satis fiyatini kullanicidan alalim
	 * satisFiyati, kdvsizFiyat, hamFiyat
	 */
	public static void main(String[] args) {
		//1.yol
//		float kdv,kdvsizFiyat,kar,hamFiyat;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Satis fiyati giriniz");
//		float satisFiyati=sc.nextFloat();
//		System.out.println("Satis fiyat :"+satisFiyati);
//		kdv= (satisFiyati*(1.18f));
//		kdvsizFiyat=satisFiyati-kdv;
//		kar=(kdvsizFiyat*(1.15f));
//		hamFiyat=kdvsizFiyat-kar;
//		
	
//		System.out.println("kdv'siz fiyat :"+ kdvsizFiyat);
//		System.out.println("ham fiyat"+ hamFiyat);
//		
//		2.yol
		Scanner input=new Scanner(System.in);
		System.out.println("Fiyat giriniz :");
		float satisFiyati=input.nextFloat();
		
		float hamFiyat;
		hamFiyat=((satisFiyati/1.18f)/1.15f);
		System.out.println("ham fiyati :" +hamFiyat);
		input.close();
	}

}
