// Language: Java
// Program-2: Generate odd number series up to count 

import java.util.*;

public class Program2 {
    public static List<Integer> generateOddSeries(int a) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            result.add(2 * i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Output: " + generateOddSeries(4));
    }
}
