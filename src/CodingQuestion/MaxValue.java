package CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(12, 45, 67, 98, 89);

        int maxNum = number.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new NoSuchElementException("List is empty"));

        System.out.println("Maximum value: " + maxNum);
    }
}
