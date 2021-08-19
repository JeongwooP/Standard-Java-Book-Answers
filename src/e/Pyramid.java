package e;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		System.out.println("수를 입력하시오.");
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		for(int a = 0; a < max ; a++) {
			for(int i = 0; i < max - a - 1; i++) 
				System.out.print(" ");
	
			for(int j = 1; j < a + 2; j++)
				System.out.print(j);
			
			System.out.println();
		}
		
	}

}
