
// Language: Java
// Program-4: Count numbers divisible by 1–9 in a list

import java.util.*;

public class Program4 {
    public static Map<Integer, Integer> countMultiples(List<Integer> numbers) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputNumbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        System.out.println("Output: " + countMultiples(inputNumbers));
    }
}
