package javafeatures;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNonEmptyStrings {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter out the empty strings using the Stream API
        List<String> nonEmptyStrings = strings.stream()
                                              .filter(str -> !str.isEmpty())
                                              .collect(Collectors.toList());

        nonEmptyStrings.forEach(System.out::println);
    }
}

