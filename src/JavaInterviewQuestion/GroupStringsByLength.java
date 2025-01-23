package JavaInterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("cat", "dog", "apple", "bat", "zebra");

        Map<Integer,List<String>> groupByLength=words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Grouped String: "+groupByLength);
    }
}
