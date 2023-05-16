package algoritma.Hafta3.gun5;

import java.util.Scanner;

/*
* 
* System.out.println("==Hesap makinesi===\n"); System.out.println("1- Topla");
* System.out.println("2- Çıkar"); System.out.println("3- Çarp");
* System.out.println("4- Böl"); System.out.println("0- Çıkış");
* System.out.println("Bir işlem Seçiniz");
* 
* bir döngümüz olucak bu döngüde işlem seçeceğiz 1- toplama kullanıcan = alana
* kadar girilen sayıları toplasın ve ekrana yazdırsın; *
* 
* 5- iki asyı gireceğiz bu sayıların ebob ve ekokunu hesaplayıp bize yazdırsın
* 
* ekok=sayi*sayi2/ebob
* 
*/
public class Soru3 {

	public static void main(String[] args) {
		do {
			menu();

			switch (islem()) {
			case 1:
				topla();
				break;
			case 2:
				System.out.println(cikar());
				
				break;
			case 3:

				break;
			case 4:

				break;
			case 0:

				break;

			default:
				break;
			}
		} while (islem() != 0);
	}

	public static void menu() {
		System.out.println("==Hesap makinesi===\n");
		System.out.println("1- Topla");
		System.out.println("2- Çıkar");
		System.out.println("3- Çarp");
		System.out.println("4- Böl");
		System.out.println("0- Çıkış");
	}

	public static int islem() {
		System.out.println("Lutfen bir islem seciniz");
		Scanner input = new Scanner(System.in);
		int secimin = input.nextInt();
		return secimin;
	}

	public static void uygulama() {
		/*
		 * 1-menumuz gelsin 1 islem secelim dah sonra bu isleme gore metotlar yazip
		 * calistiralim eger 1 gelmis ise topla metodu calissin topla() ===>
		 * kullanicidan alana kadar girilen sayilari toplasin ve daha sonra toplami
		 * donsun
		 */
		int islemsec;
		do {
			menu();
			islemsec = islem();// degiskene ata ve oyle kullan yoksa kayboluyor
			switch (islem()) {
			case 1:
				topla();
				break;
			case 2:
				cikar();
				break;
			case 3:

				break;
			case 4:

				break;
			case 0:

				break;

			default:
				break;
			}

		} while (islem() != 0);
	}

	public static void topla() {

		int topla = 0;
		System.out.println("toplanmasi istediginiz sayilari girin ve tamamlaninca = tusuna basiniz");
		Scanner input = new Scanner(System.in);
		String sayi = null;
		while (!(sayi = input.nextLine()).equals("=")) {
			topla += Integer.parseInt(sayi);
		}
		System.out.println("toplam :" + topla);

	}

	public static int cikar() {
		int sonuc = 0;
		int sayac = 0;
		System.out.println("Cikarilmasini istediginiz sayilari girin ve tamamlaninca = tusuna basiniz");
		Scanner input = new Scanner(System.in);
		String sayi = "";

		while (!(sayi = input.nextLine()).equals("=")) {
			
			sayac++;
			
			if (sayac == 1) {
				sonuc = Integer.parseInt(sayi);
			} else {
				sonuc -= Integer.parseInt(sayi);
			}
		}
		return sonuc;
	}

}
