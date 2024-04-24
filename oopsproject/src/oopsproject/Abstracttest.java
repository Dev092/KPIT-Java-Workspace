package oopsproject;

public class Abstracttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle circle=new Circle(5);
circle.calculatearea();
circle.calculatePerimeter();
	}

}
abstract class Geometricshape{
	abstract void calculatearea();
	
	abstract void calculatePerimeter();
}
class Circle extends Geometricshape{
	int radius;
	Circle(int radius){
		this.radius=radius;
	}
	void calculatearea() {
		float ar=3.14f*radius*radius;
		System.out.println(ar);
	}
	void calculatePerimeter() {
		float pa=2*3.14f*radius;
		System.out.println(pa);
	}
}