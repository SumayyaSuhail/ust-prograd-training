import java.util.List;
import java.util.TreeSet;
//TreeSet -> Tree -> sorted order
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> hashSet = new TreeSet<>();
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(2);
        hashSet.addAll(List.of(2,6,4));
        hashSet.add(-8);
        hashSet.add(8);
        System.out.println(hashSet);
    }
}
