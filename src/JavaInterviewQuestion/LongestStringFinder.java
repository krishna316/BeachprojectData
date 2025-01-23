package JavaInterviewQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringFinder {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple", "banana", "cherry", "date");

        String longest=words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("No string available");
        System.out.println("Longest String:" +longest);
    }
}
