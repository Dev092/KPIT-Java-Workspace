package association;

public class hasAtest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  human h=new human();
        
//        h.thinking();
//        h.feling();
  //     h.sweetheart.pumping();   
//        
		poet p=new poet();
		p.feling();
		
		pen ballpen=new pen();
		paper whitepaper=new paper();
		p.imagine(ballpen,whitepaper);
		
	}

}
class hand{
	void forward()
	{
		System.out.println("forward move....");
	}
	void backward()
	{
		System.out.println("backward move....");
	}
}
class heart{
	void pumping()
	{
		System.out.println("pumping blood....");
	}
}
class lung{
	void inhale()
	{
		System.out.println("inhalinh");
	}
	void exhale()
	{
		System.out.println("exhaling");
	}
}
class human{
	heart sweetheart=new heart();  //hasA
	//Lung lung = new Lung();
	// Lung lung;
	// lung = new lUn
	lung rightlung;
	lung leftlung;
	
	hand righthand;
	hand lefthand;
	
	
	
	human(){
		
	rightlung=new lung();
	leftlung=new lung();
	rightlung.inhale();
	leftlung.inhale();
	
	rightlung.exhale();
	leftlung.exhale();
	 
	righthand=new hand();
	lefthand=new hand();
	righthand.forward();
	righthand.backward();
	
	
	}
	
	
	void thinking()
	{
		System.out.println("thinking....");
	}
	void feling()
	{
		System.out.println("feeling...");
	}
}
class pen {
	void write()
	{
		System.out.println("writing...");
	}
}
class paper{
	String line;
	void read()
	{
		System.out.println("Line "+line);
	}
}
class poet extends human{   //isA
	
	void imagine(pen thepen,paper thepaper)
	{
		System.out.println("poetis imagining...");
		thepen.write();
		thepaper.line="DEVKumar";
		thepaper.line+="Pune";
		thepaper.read();
	}
}