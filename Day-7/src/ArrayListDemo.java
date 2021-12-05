import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList();
        ArrayList<Integer> arrayList1=new ArrayList(List.of(1,2,3));
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(0,0);
        System.out.println(arrayList);
        arrayList.addAll(1,arrayList1);
        //for (int i = 0; i < arrayList.size(); i++) {
        //    System.out.println(arrayList.get(i));
        //}
        arrayList.remove(1);
        //arrayList.forEach(n -> System.out.println(n));
        for(Iterator<Integer> it = arrayList.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
}
