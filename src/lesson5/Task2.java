package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        //Test cases
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char symbol = s.charAt(i);
            int val = symbols.get(symbol);
            result += val;

            if (i < s.length() - 1) {
                int prevVal = symbols.get(s.charAt(i + 1));
                if (val < prevVal) {
                    result -= 2 * val;
                }
            }
        }

        return result;
    }
}
