import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101, "Apple");
        hashMap.put(102, "Orange");
        hashMap.put(103, "Grapes");
        hashMap.putIfAbsent(102, "Mango");
        System.out.println(hashMap);
        System.out.println(hashMap.get(101));
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
