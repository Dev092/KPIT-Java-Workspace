package oopsproject;

public class icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flavour flavour=new flavour();
		flavour.setFruit("Strawberry");
		flavour.setAmtsugar(1.87f);
		flavour.setIcecolor("Red");
		
		
		System.out.println("Your icecream flavour: "+flavour);
	    
		topping topping=new topping();
		topping.setDryfruits("coconut");
		topping.setFruit("banana");
		topping.setToppingprice(15.89f);
		System.out.println("Toppings are: "+topping);
		ingredients ingredients=new ingredients();
		icecreammachine icecreammachine=new icecreammachine();
		finalicecream finalicecream=icecreammachine.preparing(ingredients,flavour, topping);
        System.out.println("Your icecream: "+finalicecream);	
	}

}
class flavour{
	String icecolor;
	float amtsugar;
	String fruit;
	float flavourprice;
	static float tax=50;
	public String getIcecolor() {
		return icecolor;
	}
	public void setIcecolor(String icecolor) {
		this.icecolor = icecolor;
	}
	public float getAmtsugar() {
		return amtsugar;
	}
	public void setAmtsugar(float amtsugar) {
		this.amtsugar = amtsugar;
	}
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	
	@Override
	public String toString() {
		return "flavour [icecolor=" + icecolor + ", amtsugar=" + amtsugar + ", fruit=" + fruit + ", flavourprice="
				+ flavourprice + "]";
	}
	
}
class icecreammachine{      //useA
	final finalicecream preparing(ingredients ingredients,flavour flavour,topping topping)
	{
		System.out.println("Your order is being prepared..");
		finalicecream finalicecream=new finalicecream();
		finalicecream.setContainersize(finalicecream.getContainersize()+flavour.getAmtsugar()*2);
		finalicecream.setPartial(true);
		finalicecream.setPrise(ingredients.storecost()+finalicecream.getPrise()+topping.getToppingprice());
		return finalicecream;
	}
}
class ingredients extends flavour{   //isA

	float magcost=10;
	float storecost()
	{
		float at=tax+magcost;
		return at;
	}
	
	@Override
	public String toString() {
		return "ingredients [icecolor=" + icecolor + ", amtsugar=" + amtsugar + ", fruit=" + fruit + "]";
	}
	
	
}
class topping{
	String fruit;
	String dryfruits;
	float toppingprice;
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	public String getDryfruits() {
		return dryfruits;
	}
	public void setDryfruits(String dryfruits) {
		this.dryfruits = dryfruits;
	}
	public float getToppingprice() {
		return toppingprice;
	}
	public void setToppingprice(float toppingprice) {
		this.toppingprice = toppingprice;
	}
	@Override
	public String toString() {
		return "topping [fruit=" + fruit + ", dryfruits=" + dryfruits + ", toppingprice=" + toppingprice + "]";
	}
	
}

class finalicecream{   //produceA
	float containersize;
	boolean partial;
	float prise;
	public float getContainersize() {
		return containersize;
	}
	public void setContainersize(float containersize) {
		this.containersize = containersize;
	}
	public boolean isPartial() {
		return partial;
	}
	public void setPartial(boolean partial) {
		this.partial = partial;
	}
	public float getPrise() {
		return prise;
	}
	public void setPrise(float prise) {
		this.prise = prise;
	}
	@Override
	public String toString() {
		return "finalicecream [containersize=" + containersize + ", partial=" + partial + ", prise=" + prise + "]";
	}
	
}
