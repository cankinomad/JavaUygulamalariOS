package algoritma.veritipleri;

import java.util.Scanner;

public class Soru2 {
	
	/* turk lirasi degerini kullanicidan aliniz
	 * bu degerin bugunku dolar ve euro kuru uzerinden 
	 * ne kadar dolar ve euroya karsilik geldigini bulunuz
	 */

	public static void main(String[] args) {
		float dolar,euro;
		Scanner input=new Scanner(System.in);
		System.out.println("Kac paraniz oldugunu tl cinsinden girin");
		float mevcutPara=input.nextFloat();
		dolar=mevcutPara/18.97f;
		euro=mevcutPara/20.37f;
		System.out.println("dolar karsiligi :"+ dolar
				+ "\nEuro karsiligi :"+ euro);
		// \n ile alt satira gecebilirsin.
		// ilgili satira gelip ctrl+alt+assagi ok tusuyla aynisini yazdir
		input.close();
	}

}
