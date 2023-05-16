package algoritma.Hafta3.gun3;

public class Soru1 {
/*
 * Bir dizideki min ve max degerleri yazdiralim
 * int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
 */
	public static void main(String[] args) {
		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		
	//	int min=Integer.MAX_VALUE;
	//	int max=Integer.MIN_VALUE;
		
		int min2=sayilar[0];
		int max2=sayilar[0];
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]<min2) {
				min2=sayilar[i];			
			}
			if(sayilar[i]>max2) {
				max2=sayilar[i];
			}
		}
		System.out.println("max deger :"+max2+" "+" Min :"+min2);
	}

}
