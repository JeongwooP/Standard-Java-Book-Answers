package e;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("¿Âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		String fullFC = input.next();
		char depend = fullFC.charAt(fullFC.length()-1);
		String cutFC = fullFC.substring(0, fullFC.length()-1);
		Double tempBefore = Double.parseDouble(cutFC);
		Double tempAfter;
		switch(depend) {
			case 'F':
			case 'f':
				tempAfter = (tempBefore - 32) / 18;
				System.out.println("È­¾¾:" + Math.round(tempBefore) + ", ¼·¾¾:" +  Math.round(tempAfter));
				break;
			case 'C':
			case 'c':
				tempAfter = tempBefore * 1.8 + 32;
				System.out.println("¼·¾¾:" + Math.round(tempBefore) + ", È­¾¾:" + Math.round(tempAfter));
				break;
		}		
	}

}
