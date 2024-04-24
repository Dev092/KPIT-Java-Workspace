
public class Demo {
	public static void main(String[] args) {
		//B a=new A();
		//a.run();
		// Parent p = new Parent();'
		// p.anyFunction();
		//A a = new A();
		//a.play();
		// Parent p = new Child();
		//A a = new B();
		//a.run();
		// only override function
		// Child c = new Child();
//		B b = new B();
//		b.run();
//		b.play();
//		b.dance();
		//Child c = new Parent();
		//C c = new C();
//		F f = new F();
//		f.play();
//		f.run();
	}
}
class A {
	public void run() {
		System.out.println("A run");
	}
	void dance() {
		System.out.println("A dance");
	}
}
class B extends A {
	public void run() {
		System.out.println("B run");
	}
	public void play() {
		System.out.println("B play");
	}
}
//abstract class C {
//	void sing() {}
//}
interface D {
	void play();
}
class C implements D {
	public void play() {}
}
class E {
	 private void run() {
		System.out.println("E run");
	}
}
//new fine -> demo2.java
class F extends E {
	public void play() {
		System.out.println("F play");
	}
}
final class X {
	public void run() {
		System.out.println("X run");
	}
}
// class -> public,final,abstract 
