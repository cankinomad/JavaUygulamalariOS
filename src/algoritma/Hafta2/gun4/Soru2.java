package algoritma.Hafta2.gun4;

import java.util.Scanner;

public class Soru2 {
	/*girilen 3 sayiyi buyukten kucuge
	 * 
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("birinci sayiyi giriniz");
		int a=input.nextInt();
		System.out.println("ikinci sayiyi giriniz");
		int b=input.nextInt();
		System.out.println("ucuncu sayiyi giriniz");
		int c=input.nextInt();
		
		if(a==b || b==c || c==a){
			System.out.println("Birbirinden farkli sayilar giriniz");
		}else {
			if(a<b) {
				if(b<c) {
					System.out.println("c>b>a");
				}else if(c<a) {
					System.out.println("b>a>c");
				}else if(a<c) {
					System.out.println("b>c>a");
				}
			}
			if(b<a) {
				if(a<c) {
					System.out.println("c>a>b");
				}else if (c<b) {
					System.out.println("a>b>c");
				}else if(b<c) {
					System.out.println("a>c>b");
				}
			}input.close();
			
		}

	}

}
