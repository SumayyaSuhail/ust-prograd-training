import java.util.Map;
import java.util.TreeMap;
//ascending order
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(103, "Car");
        treeMap.put(100, "Bike");
        treeMap.put(105, "Lorry");
        treeMap.put(101, "Auto");
        for (Map.Entry<Integer, String> entry: treeMap.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
