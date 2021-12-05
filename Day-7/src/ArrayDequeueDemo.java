import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ArrayDequeueDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1,20,3));
        arrayDeque.add(20);
        arrayDeque.add(30);
        arrayDeque.addFirst(10);
        arrayDeque.addLast(40);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.poll());
        arrayDeque.removeAll(arrayList);
        System.out.println(arrayDeque);
    }
}
