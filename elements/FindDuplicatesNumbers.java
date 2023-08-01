import java.util.HashSet;

public class FindDuplicatesNumbers {
    public static void main(String[] args) {
        // Sample array with duplicate elements
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3,1,5,9, 7, 8, 9, 4, 10};

        // Find and print duplicate elements
        findAndPrintDuplicates(numbers);
    }

    private static void findAndPrintDuplicates(int[] arr) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        HashSet<Integer> duplicateElements = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElements.add(num)) {
                duplicateElements.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicateElements);
    }
}
