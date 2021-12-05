import java.util.HashSet;
import java.util.List;

//HashSet -> Hash Map -> no order
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(2);
        hashSet.addAll(List.of(2,6,4));
        hashSet.add(-8);
        hashSet.add(8);
        System.out.println(hashSet);
    }
}
