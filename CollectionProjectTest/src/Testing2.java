import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Testing2 {

    public static void main(String[] args) {
        TreeSet<Employes> l1 = new TreeSet<>();
        l1.add(new Employes("Ram", 98));
        l1.add(new Employes("Sayam", 93));
        l1.add(new Employes("Mohan", 94));
        l1.add(new Employes("Dev", 97));

        Iterator<Employes> it = l1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class Employes implements Comparable<Employes> {
    String name;
    int Id;

    public Employes(String name, int id) {
        super();
        this.name = name;
        Id = id;
    }

    
    public int compareTo(Employes other) {
        // Compare based on the Id
        return Integer.compare( other.Id,this.Id);
    }

    
    public String toString() {
        return "Employes [name=" + name + ", Id=" + Id + "]";
    }
}
