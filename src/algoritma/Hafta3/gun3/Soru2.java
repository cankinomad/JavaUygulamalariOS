package algoritma.Hafta3.gun3;

public class Soru2 {

	public static void main(String[] args) {
		int [] sayilar= {0,120,5,85,-256,16,1258,-435,14};
		
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]>max) {
				max=sayilar[i];
			}
		}
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i]>max2 && sayilar[i]<max) {
				max2=sayilar[i];
			}
		}
		System.out.println("En buyuk sayi :"+max);
		System.out.println("Ikinci En buyuk sayi :"+max2);
	}

}
