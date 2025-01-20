package CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("krishna","shrinivas","akshay","rushikesh");
        List<String> uppercase=names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase Words: " + uppercase);
    }
}
