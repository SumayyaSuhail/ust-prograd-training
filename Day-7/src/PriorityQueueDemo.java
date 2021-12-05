import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
//minheap-> top is min value
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        //PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(12);
        priorityQueue.add(20);
        priorityQueue.add(15);
        System.out.println(priorityQueue);
    }
}
