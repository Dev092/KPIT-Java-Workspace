package oopsproject;

public class statictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       circle circle1 =new circle(8);
//       circle1.calculatearea(3);
        
        circle.calculatearea(9);  // if we create static method then we
        //not need to create obj we can call by classname.methodname()
        
	}
}

class circle{
	int radius;
    static float pi=3.14f; // if we use static then copy of
    //pi not made again and again when we create different no. of objects
	public circle(int radius) {
		super();
		this.radius = radius;
	}
	static void calculatearea(int radius) {
		float area=pi*radius*radius;
		System.out.println(area);
	}
}

//nonstatic can access static but static not access nonstatic