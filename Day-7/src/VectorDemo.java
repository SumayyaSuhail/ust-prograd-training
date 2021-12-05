import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector();
        vector.add("Onion");
        vector.add("Carrot");
        vector.addElement("Beans");
        System.out.println(vector);
       // System.out.println(vector.firstElement());
       // System.out.println(vector.lastElement());
        vector.removeElement("Onion");
        vector.forEach(veg -> System.out.println(veg));
    }
}
