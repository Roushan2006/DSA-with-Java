import java.util.HashMap;
import java.util.Map;

public class javacollection2 {
    static void main() {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in","India");
        mapping.put("en","England");
        mapping.put("un","United State");
        mapping.put("i","I");
        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br","brazil");

        System.out.println(table);
        table.putAll(mapping);
        System.out.println(table);

        table.remove("en");
        System.out.println(table);


        System.out.println(table.get("br"));

        System.out.println(table.entrySet());

        System.out.println(table.values());

        System.out.println(table.keySet());

    }
}