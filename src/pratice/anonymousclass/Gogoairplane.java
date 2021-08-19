package pratice.anonymousclass;

public class Gogoairplane {

	public static void main(String[] args) {
		Person p = new Person() {
			
			String name = "kim";
			
			public void callMe() {
				System.out.println("Call me Method");
			}
			
			void whoAmI() {	//override
				System.out.println("나는" + name + "이다.");
			}
		};
		p.whoAmI();
	}

}

 class Person{
	 void whoAmI() {
		 System.out.println("나는 Person");
	 }
 }