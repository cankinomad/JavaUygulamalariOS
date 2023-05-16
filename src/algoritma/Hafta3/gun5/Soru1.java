package algoritma.Hafta3.gun5;

public class Soru1 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 3267, 2 },
				{ 189, 35, 56, 89, 8 } };
		int[] a = tekSayilariAta(matris);

		arrayYazdir(a);
		
		System.out.println("=======================================");
		
		int boyut=tekSayiAdateBul(matris);
		int [] teksayilar3=tekSayilariAta(matris,boyut);
		
		arrayYazdir(teksayilar3);
	}

	int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 3267, 2 }, { 189, 35, 56, 89, 8 } };

	/**
	 * 
	 * @param matris
	 * @return
	 */
	public static int[] tekSayilariAta(int[][] matris) {
		int[] tekSayilar = new int[matris.length * matris[0].length];
		int index = 0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 == 1) {
					tekSayilar[index] = matris[i][j];
					index++;
				}
			}
		}
		return tekSayilar;
	}
	/**
	 * 
	 * @param array
	 */

	public static void arrayYazdir(int[] array) {
		for (int sayi : array) {
			if (sayi != 0)
				System.out.println(sayi);
		}
		System.out.println("Dizinin boyutu=======>"+array.length);
	}
	/**
	 * 
	 * @param matris
	 * @return
	 */
	public static int tekSayiAdateBul(int[][] matris) {
		int sayac=0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if(matris[i][j]%2==1) {
					sayac++;
				}
			}
		} 
		return sayac;
	}
	/**
	 * 
	 * @param matris
	 * @param boyut
	 * @return
	 */
	public static int[] tekSayilariAta(int[][] matris,int boyut) {
		int[] tekSayilar = new int[boyut];
		int sayac=0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 == 1) {
					tekSayilar[sayac] = matris[i][j];
					sayac++;
				}
			}
		}
		return tekSayilar;
	}
}
