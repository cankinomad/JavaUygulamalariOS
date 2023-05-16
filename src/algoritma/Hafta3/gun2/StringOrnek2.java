package algoritma.Hafta3.gun2;

public class StringOrnek2 {
	
		/*string degeri
		 * Hayat,kisa,kuslar,ucuyor,
		 * ,'den ayirip her kelimeyi alt alta yazdiralim
		 */
	
	public static void main(String[] args) {
		String kelime="Hayat,kisa,kuslar,ucuyor";
		int index=0;
		
		for (int i = 0; i < kelime.length(); i++) {
			if(kelime.charAt(i)==',') {
			System.out.println(kelime.substring(index,i));
				index=i+1;
			}
				
		}System.out.println(kelime.substring(index));
		
		System.out.println("?????????????????????????????????");
		for (int i = 0; i < kelime.length(); i++) {
			if(kelime.charAt(i)==',') {
				System.out.println();
			}else {
				System.out.print(kelime.charAt(i));
			}	
			
		}
		System.out.println("|||||||||||||||||||||||||||||||");
		
		System.out.println(kelime.replace(",", "\n"));

	}

}
