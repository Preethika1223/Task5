package javafeatures;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateInput = scanner.nextLine();
        LocalDate birthdate = LocalDate.parse(birthdateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);
        System.out.printf("Your age is: %d years, %d months, and %d days.%n", 
                          age.getYears(), age.getMonths(), age.getDays());

        scanner.close();
    }
}

