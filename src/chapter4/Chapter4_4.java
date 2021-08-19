package chapter4;

public class Chapter4_4 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(sum < 100) {
			if(i % 2 != 0) {
				sum += i;
			}else {
				sum -=i;
			}
			i++;
		}

		
		System.out.println("to : " + i + "\n" + "sum : " + sum );
		
	}

}
