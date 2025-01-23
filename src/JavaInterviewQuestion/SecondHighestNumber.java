package JavaInterviewQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(12,45,67,8,76)    ;

        int seconhighest=number.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Not enough element:"));

        System.out.println("Second Highest Number:"+seconhighest);
    }
}
