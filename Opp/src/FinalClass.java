
 final class A00{
	int a =133;
	void method() {
		System.out.println("iojfhajwsj");
		System.out.println("we can not inherited the FINAL CLASS..");
	}
}
 
// class A345 extends A00           { //error because we can not inherited the final class.....
	 //make sure  we can not inherited the final class .....

public class FinalClass {

	public static void main(String[] args) {
		A00 a= new A00();
		System.out.println(a.a);
		a.method();

	}

}
