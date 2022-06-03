
class A234 {
  final void m12() {
	  System.out.println("it is final method");
	  System.out.println("it will not overide");
	  System.out.println("it will be never overide");
  }
  
}

 class B788 extends A234 {
	 
	// void m12() { } //error final method will not be overide
	 
	 void m1() {
		 System.out.println("it is normal method...");
	 }
 }
public class FinalMethod {

	public static void main(String[] args) {
		B788 b = new B788();
		b.m12();
		b.m1();

	}

}
