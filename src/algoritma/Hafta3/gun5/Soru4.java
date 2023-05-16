package algoritma.Hafta3.gun5;

import java.util.Arrays;

public class Soru4 {
	public static void main(String[] args) {
		int dizi[]= {1,5,7};
		

		dizi=diziyeElemanEkle(dizi, 5);
		System.out.println(Arrays.toString(dizi));
	}

	public static int[] diziyeElemanEkle(int[] array,int addNumber) {
		int []yeniDizi =null;
		yeniDizi=new int[array.length+1];
		for (int j = 0; j < array.length; j++) {
			yeniDizi[j]=array[j];
		}
		yeniDizi[yeniDizi.length-1]=addNumber;
		return yeniDizi;
		
		
	}
}
