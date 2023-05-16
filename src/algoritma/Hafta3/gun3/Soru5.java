package algoritma.Hafta3.gun3;

public class Soru5 {
/*
 * dizi icerisinde 1 ve 4 kac defa gectigini ve 1 sayisinin adeti
 * 4 sayisinin adetinden buyukse true
 * degilse false yazsin
 */
	public static void main(String[] args) {
		int [] sayilar= {1,4,5,6,1,1,4,8};
		int sayac1=0;
		int sayac4=0;
		boolean kontrol=true;
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i]==1) {
				sayac1++;
			}if(sayilar[i]==4) {
				sayac4++;
			}
		} System.out.println("1 sayisi :"+sayac1+"adet"+"\n4 sayisi :"+sayac4+"adet");
		
		
		if(sayac1>sayac4) {
			kontrol=true;
			System.out.println(kontrol);
		}else if(sayac4==sayac1) {
			kontrol=false;
			System.out.println(kontrol);
			
		}else {
			System.out.println("esit");
		}
		
		//2.cozum
		boolean kontrol2=sayac1>sayac4;
		System.out.println("kontrol2=======>"+kontrol2);
	}

}
