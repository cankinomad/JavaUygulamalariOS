package algoritma.Hafta3.gun3;

public class Soru7 {

	/*
	 * String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;
	 * 04-Ağrı;05-Amasya;06-Ankara;" + "07-Antalya;08-Artvin;09-Aydın;
	 * 10-Balıkesir;42-Konya"; 1- stringimiz bir arraye cevirecegiz 01-adana,
	 * 02-adiyaman
	 * 
	 * array[0]="01-Adana" array[1]="02-Adiyaman"
	 * 
	 * 2-arrayimiz donerken her sehir icin bir cikti vereecegiz adananin plaka kodu
	 * =01;
	 */

	public static void main(String[] args) {
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya;";
		int index = 0;
		String[] dizi = sehirler.split(";");

		for (int i = 0; i < dizi.length; i++) {
			index = dizi[i].indexOf("-");
			System.out.println(dizi[i].substring(index + 1) + " plaka kodu :" + dizi[i].substring(0, index));
		}
	}

}
