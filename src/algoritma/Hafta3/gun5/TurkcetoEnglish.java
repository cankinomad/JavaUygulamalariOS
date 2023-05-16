package algoritma.Hafta3.gun5;

import java.util.Scanner;


public class TurkcetoEnglish {

	public static void main(String[] args) {
		char [] turkishWords= {'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü','Ü','ö','Ö'};
		char [] englishWords= {'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u','U','o','O'};
		
		
		
		System.out.println(replaceWords(turkishWords,englishWords));
	}

	public static String replaceWords(char[] turkishWords, char[] englishWords) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String value=scanner.nextLine();
		for (int sayac = 0; sayac < englishWords.length; sayac++) {
			value=value.replace(turkishWords[sayac], englishWords[sayac]);
		}
		return value;
		
	}
	
}
