package chapter5;


public class Chapter5_10 {

	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
			// 0 1 2 3 4 5 6 7 8 9
			char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			String src = "abc123";
			String result = "";
			// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
			for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			
			if('a'<=ch && 'z'>=ch) {
				for(int j = 0;j < abcCode.length; j++) {
					if(ch == abcCode[j]) {
						ch = abcCode[j];
					}
				}
			}
			
			
			
			}
			System.out.println("src:"+src);
			System.out.println("result:"+result);

	}

}
