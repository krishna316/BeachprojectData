package JavaInterviewQuestion;

import java.util.*;
import java.util.stream.*;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        List<String> keyValuePairs = map.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.toList());

        System.out.println("Key-Value Pairs: " + keyValuePairs);
    }
}

