package CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","pineapple","banana","orange","banana","banana","pineapple","pineapple","pineapple");
        Map<String,Long> wordCount=words.stream()
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));
        System.out.println("Word count:"+wordCount);
    }
}
