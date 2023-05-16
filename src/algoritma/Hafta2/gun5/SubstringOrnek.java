package algoritma.Hafta2.gun5;

public class SubstringOrnek {

	public static void main(String[] args) {
		String name= "arda@hotmail.com@hotmail.com";
		System.out.println(name.charAt(0));
		
		//substring ---> bir String'e uye ol demektir
		String newName= name.substring(0,5).toLowerCase()+ name.substring(6,8);
		//oncelikle ilk harfini alip kucultuyoruz, kalan harfleri de kalanindan ekleyerek
		// yapiyoruz.
		System.out.println(newName);
		
		if(name.contains("sheesh")) {
			System.out.println("Damnn son");
		}else {
			System.out.println(name.contains("@hotmail.com"));		
		}
	}

}
