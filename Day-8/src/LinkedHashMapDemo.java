import java.util.LinkedHashMap;
import java.util.Map;
//maintains insertion order
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(101, "Oreo");
        linkedHashMap.put(102, "Britannia");
        linkedHashMap.put(103, "GoodDay");
        System.out.println(linkedHashMap);
        linkedHashMap.putIfAbsent(104, "Bourbon");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
