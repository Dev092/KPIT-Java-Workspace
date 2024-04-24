package oopsproject;

public class finaltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final float pi=3.14f;      //if we declare as final then it not chande further
        System.out.println(pi);
        chess chess=new chess();
        chess.movebishop();
        chess gc=new graphicchess();
        gc.movebishop();
	}

}
class chess{
	final void movebishop() {   //if we declare as final then overriding not possible
		System.out.println("moving diagnolly backward forward");
	}
	void ischeckmate() {   //this is exclusivr method because it is classfunction not inherites
		
	}
}
class graphicchess extends chess{
	void movemybishop() {
		System.out.println("moving diagnolly on graphic");
	}
}