package oopsproject;

public class kitchess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graphicchessgame chess=new graphicchessgame();
        chess.moveghora();
	}

}
class gamechess{
	final void moveghora() {
		System.out.println("ghora diagonal chlta h");
	}
	void moverook() {
		System.out.println("move vertically");
	}
}
class graphicchessgame extends gamechess{
	void moveghora() {
		System.out.println("ghora sidha chlega");
	}
	void moverook() {
		System.out.println("Tedha chlega");
	}
}
