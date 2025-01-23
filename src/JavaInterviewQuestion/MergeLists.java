package JavaInterviewQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeLists {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,3,5,6,7);
        List<Integer> list2= Arrays.asList(2,3,4,8,7);

        List<Integer> mergeList= Stream.concat(list1.stream(),list2.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Merged List:" +mergeList);

    }
}
