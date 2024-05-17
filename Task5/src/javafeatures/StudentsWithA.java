package javafeatures;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsWithA {
    public static void main(String[] args) {
       
        List<String> students = Arrays.asList("Anbu","Arivu","Kalai","Thamarai");
       
        List<String> studentsWithA = students.stream()
                                             .filter(name -> name.startsWith("A"))
                                             .collect(Collectors.toList());

        studentsWithA.forEach(System.out::println);
    }
}

