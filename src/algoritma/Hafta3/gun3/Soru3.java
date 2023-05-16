package algoritma.Hafta3.gun3;

public class Soru3 {
	/*
	 * bir dizide ard arda gelen 2 indexdeki sayi degeri 2 ise true
	 * yazdirip dongu sonlansin
	 * yoksa false yazdiralim.
	 * 
	 */
	public static void main(String[] args) {
		
		int [] sayilar= {2,-256,2,129,2,2};
		boolean kontrol=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]==2 && sayilar[i+1]==2) {
				kontrol=true;
				break;
			}
		} System.out.println(kontrol);
		
		
	}

}
