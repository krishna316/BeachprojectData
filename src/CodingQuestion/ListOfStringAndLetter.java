package CodingQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringAndLetter {
    public static void main(String[] args) {
        List<List<String>> skill= Arrays.asList(
                Arrays.asList("java","spring","spring boot"),
                Arrays.asList("mysql","postgres","sql"),
                Arrays.asList("react","Angular","Java script")
                );
        List<String> allskill=skill.stream().flatMap(skilllist -> skilllist.stream()).collect(Collectors.toList());
        System.out.println(allskill);
        List<String> Startwiths=allskill.stream().filter(skills -> skills.startsWith("s")).collect(Collectors.toList());
        System.out.println(Startwiths);
    }
}
