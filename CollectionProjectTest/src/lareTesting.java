

import java.util.Iterator;
import java.util.TreeSet;

public class lareTesting {

    public static void main(String[] args) {
        TreeSet<Men> set = new TreeSet<>();
        set.add(new Men("Dev", 22));
        set.add(new Men("Raj", 21));

        Iterator<Men> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class Men implements Comparable<Men> {
    String name;
    int age;

    public Men(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public int compareTo(Men other) {
        return Integer.compare(this.age, other.age);
    }

  
    public String toString() {
        return "Men [name=" + name + ", age=" + age + "]";
    }
}
