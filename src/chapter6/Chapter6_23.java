package chapter6;

public class Chapter6_23 {

	static int max(int [] arr) {
		int MAX = 0;
		
		
		if(arr == null || arr.length == 0)
			return -999999;
		
		
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] >= MAX) {
				MAX = arr[i];
			}
		}
			return MAX;
	}
	
	public static void main(String[] args) {
		{
			int[] data = {3,2,9,4,7};
			System.out.println(java.util.Arrays.toString(data));
			System.out.println("�ִ밪:"+max(data));
			System.out.println("�ִ밪:"+max(null));
			System.out.println("�ִ밪:"+max(new int[]{})); // ũ�Ⱑ 0�� �迭
			}
	}

}
