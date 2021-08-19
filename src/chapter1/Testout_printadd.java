package chapter1;

public class Testout_printadd {

	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		
		kor = 70;
		eng = 80;
		math = 90;
		
		System.out.println(kor+eng+math);
		System.out.println("String과 int를 +하면.." + kor + eng + math);
		System.out.println("String과 int를 +해도 (괄호)하면.." + (kor + eng + math));
	}

}
