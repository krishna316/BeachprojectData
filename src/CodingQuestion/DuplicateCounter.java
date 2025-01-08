package CodingQuestion;

import java.util.*;

public class DuplicateCounter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 6, 7, 4, 7, 8, 6, 6);
        Map<Integer, Integer> duplicates = countDuplicates(numbers);
        System.out.println("Duplicate counts: " + duplicates);
    }

    public static Map<Integer, Integer> countDuplicates(List<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Remove non-duplicates
        countMap.entrySet().removeIf(entry -> entry.getValue() == 1);

        return countMap;
    }
}

