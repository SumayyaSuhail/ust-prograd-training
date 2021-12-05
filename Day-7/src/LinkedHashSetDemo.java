import java.util.LinkedHashSet;
import java.util.List;
//LinkedHashSet -> Linked List and Hash Map -> entry order
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hashSet=new LinkedHashSet<>();
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(2);
        hashSet.addAll(List.of(2,6,4));
        hashSet.add(-8);
        hashSet.add(8);
        System.out.println(hashSet);
    }
}
