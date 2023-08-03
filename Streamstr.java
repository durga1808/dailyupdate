import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamstr {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("package", "thread", "java", "stream", "stramapi");

        String concatenatedUppercase = words.stream()
                .filter(word -> word.length() >4)    // Step 1: Filter out strings with length <= 3
                .map(String::toUpperCase)             // Step 2: Convert each string to uppercase
                .collect(Collectors.joining());       // Step 3: Concatenate the strings

        System.out.println("Concatenated Uppercase: " + concatenatedUppercase);
    }
}
