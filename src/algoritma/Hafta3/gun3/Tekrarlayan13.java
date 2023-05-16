package algoritma.Hafta3.gun3;

public class Tekrarlayan13 {
	/*
	 * bir dizide 13 var ise 13 ve bir sonraki eleman toplama eklenmeden toplam
	 * sonucu bulan algoritma
	 */

	public static void main(String[] args) {
		int[] nums = { 1, 13, 13, 5,1, 13, 1};
		int toplam = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				if (nums.length>(i+1) && nums[i+1] != 13) {
					i++;}
				 
				}else  {
					toplam =toplam+ nums[i];
			}
		}
			System.out.println(toplam);
		
		 
	}
}
