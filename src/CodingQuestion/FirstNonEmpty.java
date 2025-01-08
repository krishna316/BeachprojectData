package CodingQuestion;

import java.util.Arrays;
import java.util.List;

public class FirstNonEmpty {
    public static void main(String[] args) {
        List<String> string= Arrays.asList("","krishna","dev");
        String result=string.stream()
                .filter(str -> !str.trim().isEmpty())
                .findFirst()
                .orElse("No value found");
        System.out.println("First Non-Empty String :"+result);
    }
}
