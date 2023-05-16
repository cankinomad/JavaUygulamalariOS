package algoritma.Hafta3.gun3;

public class Soru4 {
	/*
	 * bir dizideki tum sayilarin toplami ve her sayi icin 
	 * 2 sayisi bu sayi tektir, bu sayi cifttir diye bir cikti verelim
	 */
	public static void main(String[] args) {
		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		int toplam=0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam+=sayilar[i];
		}System.out.println(toplam);
		
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i]%2==0) {
				if(sayilar[i]==0) {
					System.out.println("0 notr bir sayidir");
				}else {
				System.out.println(sayilar[i]+" sayisi cifttir");}
			}else {
				System.out.println(sayilar[i]+" sayisi tektir");
			}
				
		}
	}

}
