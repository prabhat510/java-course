import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionApi {
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<Double>();
        Map<String, String> student = new HashMap<>();
        student.put("prabhat", "bhargava");
        nums.add(1.2);
        System.out.println(nums);
        System.out.println(student.get("prabhat"));


         List<String> names = Arrays.asList("John", "Alice", "Bob", "Jane", "Eve");

        // Using a stream to filter names starting with 'J' and print them
        names.stream()
             .filter(name -> name.startsWith("J"))
             .forEach(System.out::println);
    }
}
