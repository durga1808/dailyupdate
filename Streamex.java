import java.util.Arrays;
import java.util.List;

public class Streamex {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20,22,23,54,55,64,87,92);

        int sumOfDoubledEvenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)        // Step 1: Filter out the even numbers
                .peek(System.out::println)          // Optional: Print the filtered even numbers
                .mapToInt(num -> num * 2)           // Step 2: Double each remaining number
                .sum();                             // Step 3: Find the sum of all the doubled numbers

        System.out.println("Sum of Doubled Even Numbers: " + sumOfDoubledEvenNumbers);
    }
}
