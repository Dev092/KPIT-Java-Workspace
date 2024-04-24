package elements.table;

public class ChemicalElement implements Comparable<ChemicalElement>{
	int elementNumber;
	String elementName;
	String elementFormula;
	int atomicWeight;
	
	//Constructor
	public ChemicalElement(int elementNumber, String elementName, String elementFormula, int atomicWeight) {
		super();
		this.elementNumber = elementNumber;
		this.elementName = elementName;
		this.elementFormula = elementFormula;
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "ChemicalElement [elementNumber=" + elementNumber + ", elementName=" + elementName + ", elementFormula="
				+ elementFormula + ", atomicWeight=" + atomicWeight + "]";
	}
	
	public int compareTo(ChemicalElement other) {
		return Integer.compare( other.atomicWeight,this.atomicWeight);
	}
}


