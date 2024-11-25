package algorisum;

import java.util.Arrays;

public class 중복완탐 {
    static char[] chars = {'a', 'b', 'c', 'd', 'e'};
    static int R = 3;  // Length of each permutation

    static void generatePermutations(int size, char[] chosen) {
        // Base case: when we've chosen R elements
        if (size == R) {
            System.out.println(Arrays.toString(chosen));
            return;
        }

        // Recursive case: try each possible character
        for (int i = 0; i < chars.length; i++) {
            chosen[size] = chars[i];  // Place character at current size position
            generatePermutations(size + 1, chosen);
        }
    }

    public static void main(String[] args) {
        generatePermutations(0, new char[R]);
    }
}
