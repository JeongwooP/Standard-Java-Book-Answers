package aa.bb.cc;

import java.util.Scanner;

public class Ch063 {

	public Ch063(String s) {
		int[] arr = new int[26];
		char alpha;
		for(int i = 0 ; i < arr.length; i++) 
			arr[i] = 0;
		for(int j = 0 ; j < s.length(); j++) {
			alpha = s.charAt(j);
			if(alpha == 'a' || alpha == 'A') //65
				arr[0]++;
			else if(alpha == 'b' || alpha == 'B')
				arr[1]++;
			else if(alpha == 'c' || alpha == 'C')
				arr[2]++;
			else if(alpha == 'd' || alpha == 'D')
				arr[3]++;
			else if(alpha == 'e' || alpha == 'E')
				arr[4]++;
			else if(alpha == 'f' || alpha == 'F')
				arr[5]++;
			else if(alpha == 'g' || alpha == 'G')
				arr[6]++;
			else if(alpha == 'h' || alpha == 'H')
				arr[7]++;
			else if(alpha == 'i' || alpha == 'I')
				arr[8]++;
			else if(alpha == 'j' || alpha == 'J')
				arr[9]++;
			else if(alpha == 'k' || alpha == 'K')
				arr[10]++;
			else if(alpha == 'l' || alpha == 'L')
				arr[11]++;
			else if(alpha == 'm' || alpha == 'M')
				arr[12]++;
			else if(alpha == 'n' || alpha == 'N')
				arr[13]++;
			else if(alpha == 'o' || alpha == 'O')
				arr[14]++;
			else if(alpha == 'p' || alpha == 'P')
				arr[15]++;
			else if(alpha == 'q' || alpha == 'Q')
				arr[16]++;
			else if(alpha == 'r' || alpha == 'R')
				arr[17]++;
			else if(alpha == 's' || alpha == 'S')
				arr[18]++;
			else if(alpha == 't' || alpha == 'T')
				arr[19]++;
			else if(alpha == 'u' || alpha == 'U')
				arr[20]++;
			else if(alpha == 'v' || alpha == 'V')
				arr[21]++;
			else if(alpha == 'w' || alpha == 'W')
				arr[22]++;
			else if(alpha == 'x' || alpha == 'X')
				arr[23]++;
			else if(alpha == 'y' || alpha == 'Y')
				arr[24]++;
			else if(alpha == 'z' || alpha == 'Z')
				arr[25]++;
		}
		
		System.out.println();
		System.out.println("각 영문자당 회수:");
		
		for(int k = 0; k < arr.length; k++) {
			if(arr[k] == 0)
				continue;
			alpha = (char)(k+65);
			System.out.println(alpha + ": "+ arr[k]);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("영어 문장 입력.");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		Ch063 c = new Ch063(s);
	}
}