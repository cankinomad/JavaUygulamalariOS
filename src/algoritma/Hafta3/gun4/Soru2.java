package algoritma.Hafta3.gun4;

import java.util.Arrays;

public class Soru2 {
	/*
	 * carpim tablosu cift boyutlu bir array 1x1=1 1x2=2 1x3=3
	 * 
	 */
	public static void main(String[] args) {
		String[][] carpim = new String[10][10];

		for (int i = 0; i < carpim.length; i++) {
			for (int j = 0; j < carpim[i].length; j++) {
				carpim[i][j] = (i + 1) + "x" + (j + 1) + "=" + ((i + 1) * (j + 1));
			}
		}
		for (int i = 0; i < carpim.length; i++) {
			for (int j = 0; j < carpim.length; j++) {

				System.out.println(carpim[i][j]);
			}
		}
		for (String[] x : carpim) {// her elemani string dizi 1'ler 2'ler icin hepsini aliyor ama iclerini alamiyor
			for (String strings : x) {// tek boyutlu diziye dusurduk simdi burdan 1'ler icin tek tek yaziyor sonra
										// artiyor
				System.out.println(strings);
			}
		}
		for (String[] strings : carpim) {// usttekiyle ayni mantik, once tek boyutluya dusuryourz
			System.out.println(Arrays.toString(strings));// sonra yazdiriiyoruz
		}

	}

}
