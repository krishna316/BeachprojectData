package JavaInterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeListsToMap {
    public static void main(String[] args) {
        List<String> keys = Arrays.asList("id1", "id2", "id3");
        List<String> values = Arrays.asList("apple", "banana", "cherry");

        Map<String,String> mergedMap= IntStream.range(0,Math.min(keys.size(),values.size()))
                .boxed()
                .collect(Collectors.toMap(keys::get,values::get));

        System.out.println("Marged Map: "+ mergedMap);
    }
}
