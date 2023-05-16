package algoritma.Hafta3.gun2;

public class Deneme2 {
public static void main(String[] args) {
	/*string degeri
	 * Hayat,kisa,kuslar,ucuyor,
	 * ,'den ayirip her kelimeyi alt alta yazdiralim
	 */
	
	String kelime="Hayat,kisa,kuslar,ucuyor";
	
	String [] dizi=kelime.split(",");
	
	for (int i = 0; i < dizi.length; i++) {
		System.out.println(dizi[i]);
	}
}
}
