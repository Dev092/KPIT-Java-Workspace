package oopsproject;

public class Instrumentwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guitar Guitar=new Guitar();
		Guitar.use();
		Guitar.play();
		Guitar.clean();
		Guitar.tunestrings();
		Guitar.connectsystem();
		
		System.out.println("------------------------");
		
		Cutter cutter=new Cutter();
		cutter.use();
		cutter.diagnose();
		cutter.sterilize();
		cutter.cut();
		
	}

}
interface Instrument{
	void use();
}
abstract class Musicalinstrument implements Instrument{
	public void use(){
		System.out.println("used for play music");
	}
	abstract void play() ;
}
class Medicalinstrument implements Instrument{
	public void use() {
		System.out.println("used for diagnose");
	}
	void diagnose() {
		System.out.println("Start diagnose");
	}
}
class Surgucalmedicalinstrument extends Medicalinstrument{
	void sterilize() {
		System.out.println("Giving sterilize");
	}
}
class Cutter extends Surgucalmedicalinstrument{
	void cut() {
		System.out.println("Start the cutting process");
	}
}

abstract class Stringbasedinstrument extends Musicalinstrument{
	void tunestrings() {
		System.out.println("Setting the tunestring");
	}
	void clean() {
		System.out.println("clean the instrument");
	}
	
}
class Airbasedinstrument extends Musicalinstrument{
	void check() {
		System.out.println("check and find work properly");
	}
	void play() {
		
	}
}
class Guitar extends Stringbasedinstrument {
	void connectsystem() {
		System.out.println("connected and Start performance");
	}
	void play() {
		System.out.println("Playing guitar");
	}
}

class vilon extends Stringbasedinstrument{
	void play() {
		System.out.println("Playing guitar");
	}
	void connectsystem() {
		System.out.println("connected and Start performance through vilon");
	}
}
