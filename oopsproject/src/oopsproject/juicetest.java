package oopsproject;

public class juicetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chikoo chiku=new chikoo();
		chiku.setFruitname("CHIKOO");
		chiku.setColor("Brown");
		chiku.setRipe(true);
		chiku.setWeight(1.45f);
		
		System.out.println("chiku object is: "+chiku);
        
		water water =new water();
		water.setType("Mineral");
		water.setTemperature(23.5f);
		water.setQuantity(100);
		System.out.println("water object is"+water);
		kitchen kitchen=new kitchen();
		juice juice=kitchen.perparingsomething(chiku, water);
		System.out.println("juice : "+juice);
	}

}
class kitchen{
	juice perparingsomething(fruit fruit,water water) {
		System.out.println("Preparing something...");
		juice juice =new juice();
		juice.setColor(fruit.getColor());
		juice.setFiltered(true);
		juice.setQuality(fruit.getWeight()+water.getQuantity());
		juice.setTemperature(water.getTemperature());
		juice.setType(fruit.getType()+" "+fruit.getFruitname());
		return juice;
	}
}
class fruit{
	String fruitname;
	String type;
	float weight;
	String color;
	boolean ripe;
	
	
	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isRipe() {
		return ripe;
	}
	public void setRipe(boolean ripe) {
		this.ripe = ripe;
	}
	
	
	
}
class chikoo extends fruit{

	@Override
	public String toString() {
		return "chikoo [fruitname=" + fruitname + ", type=" + type + ", weight=" + weight + ", color=" + color
				+ ", ripe=" + ripe + "]";
	}
	
}
class water{
	String type;
	float quantity;
	float temperature;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "water [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + "]";
	}
	
	
}

class juice{
	float quality;
	String type;
	float temperature;
	boolean filtered;
	String color;
	public float getQuality() {
		return quality;
	}
	public void setQuality(float quality) {
		this.quality = quality;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public boolean isFiltered() {
		return filtered;
	}
	public void setFiltered(boolean filtered) {
		this.filtered = filtered;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "juice [quality=" + quality + ", type=" + type + ", temperature=" + temperature + ", filtered="
				+ filtered + ", color=" + color + "]";
	}
	
}
