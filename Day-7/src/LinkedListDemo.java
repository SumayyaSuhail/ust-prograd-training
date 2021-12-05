import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("orange");
        linkedList.add("grapes");
        System.out.println(linkedList);
        linkedList.remove(2);
        linkedList.forEach(fruits -> System.out.println(fruits));
    }
}
