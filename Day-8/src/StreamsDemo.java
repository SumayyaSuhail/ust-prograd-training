import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamsDemo {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>(List.of("Kerala", "Tamil Nadu", "Maharashtra", "Rajasthan"));
        states.stream().sorted().skip(2).forEach(m-> System.out.println(m));
        states.stream().findFirst().ifPresent(System.out::println);
    }
}
