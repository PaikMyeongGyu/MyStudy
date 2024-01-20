package InitializerBlock;

import java.util.HashMap;
import java.util.Map;

public class ExampleComplicateInitialization {

    private static Map<String, Integer> legs = new HashMap<>();

    static {
        legs.put("octopus", 8);
        legs.put("squid", 10);
    }
}
