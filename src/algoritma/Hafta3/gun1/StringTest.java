package algoritma.Hafta3.gun1;

public class StringTest {

	public static void main(String[] args) {
		
		  String value="Merhaba Dunya"; //ctrl+alt+assagi arrow String
		  String value2="Merhaba Dunya ";
		  //=============================
		  System.out.println(value2.trim()==value);//trimlesen bile referansin degismediginden false geliyor
		  System.out.println(value2.trim().equals(value));//trimleyince equals icerik kontrolu yaptigindan true geliyor
		  
		  
		 /* System.out.println(value.charAt(1));
		 * System.out.println(value.indexOf("r"));//ilk gectigi degeri bulur
		 * System.out.println(value2.trim()); System.out.println(value.indexOf("a",5));
		 * //a yi 5'ten sonra ariyor
		 * 
		 * System.out.println(value.lastIndexOf("a"));//sondan ilk a yi buluyor
		 * System.out.println(value.substring(7));//7 yi alir ve sonrasini yazdirir
		 * System.out.println(value.substring(0, 5));//0dan itibaren 0 dahil 5 e kadar
		 * yazzar 5 dahil degil System.out.println(value.replace('a', 'o'));//elimizdeki
		 * a yi o yapiyor System.out.println(value);
		 * System.out.println(value.endsWith("a"));// a ile mi bitioyr? boolean donuyor
		 * System.out.println(value.endsWith("x"));
		 * System.out.println(value.startsWith("m"));
		 * System.out.println(value.startsWith("M"));
		 * System.out.println(value.concat(" xxxxx"));//concat gibi + isareti de iki
		 * stringi birlestirme islemi yapar System.out.println(value);
		 * System.out.println(value.contains("ha"));
		 * System.out.println(value.contains("ba "));
		 * System.out.println(value.contains("ba"));
		 * System.out.println(value.toUpperCase());
		 * System.out.println(value.toLowerCase());
		 * System.out.println(value.equals(value2));
		 * System.out.println(value.equals("Merhaba Dunya"));
		 * System.out.println(value.equalsIgnoreCase("merhaba dunya"));
		 */
		
		String value3="Mustafa";
		String value4="Mustafa";
		String value5=new String ("Mustafa");
		
		System.out.println(value3==value4);
		System.out.println(value5==value4);//referansini kontrol ediyor ==
		System.out.println(value5.equals(value4));//icerigini kontrol ediyor .equals
		
	}

}
