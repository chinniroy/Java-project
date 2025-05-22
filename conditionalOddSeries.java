// Language: Java
// Program-3: Conditional odd series depending on even/odd input

import java.util.*;

public class Program3 {
    public static List<Integer> generateConditionalOddSeries(int x) {
        int count = (x % 2 != 0) ? x : x - 1;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < (count + 1) / 2; i++) {
            result.add(2 * i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + generateConditionalOddSeries(4)); // [1, 3, 5]
    }
}
